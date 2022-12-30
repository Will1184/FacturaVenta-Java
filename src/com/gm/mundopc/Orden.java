package com.gm.mundopc;

public class Orden {
    private Computadora computadoras;
    private Monitor monitores;
    private int numCompra=0,numFactura;

    private static int contadorCompra;
    private static int contadorFactura;

    public  Orden(){
        this.numFactura=++contadorFactura;
    }
    public Orden(Computadora computadora) {
        this();
        this.numCompra=++contadorCompra;
    }

    public Orden( Monitor monitores) {
        this();
        this.numCompra=++contadorCompra;
    }


    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public int getNumOrden() {
        return numCompra;
    }

    public void setNumOrden(int numOrden) {
        this.numCompra = numOrden;
    }

    public Computadora getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(Computadora computadoras) {
        this.computadoras = computadoras;
    }

    public Monitor getMonitores() {
        return monitores;
    }

    public void setMonitores(Monitor monitores) {
        this.monitores = monitores;
    }

    public static void imprimir(Computadora computadoras, Monitor monitores, double suma, int i){
        System.out.println("        Mundo Pc\n       Factura# "+i+"\n-------------------------\n Producto                 Precio\n"+monitores.getNombre()+"                $"+ computadoras.getPrecio()+"\nMonitor "+monitores.getMarcaMonitor()+" "+monitores.getPulgadas()+ " Pulgadas    $"+monitores.getPrecioMonitor()+"\n----------------------------\nCantidad de articulos     #" +contadorCompra+"\nTotal                     $"+suma+"\n");

    }
    public static double Suma(Computadora computadoras, Monitor monitores){
       double total;
       return total=computadoras.getPrecio()+monitores.getPrecioMonitor();

    }

}
