package com.gm.mundopc;

public class Monitor extends Computadora{
    private String marcaMonitor;
    private  double precioMonitor, idMonitor, contador;
    private int pulgadas;

    private static int contadorMonitor;
    private static int Idmonitor;

    public Monitor(String nombre, int idMonitor) {
        super(nombre);
        this.contador = contadorMonitor;
    }

    public Monitor(String nombre, String marca, int precioMonitor, int pulgadas) {
        super(nombre);
        this.marcaMonitor = marca;
        this.precioMonitor = precioMonitor;
        this.pulgadas = pulgadas;
        this.idMonitor=Idmonitor++;
    }


    public String getMarcaMonitor() {
        return marcaMonitor;
    }

    public void setMarcaMonitor(String marcaMonitor) {
        this.marcaMonitor = marcaMonitor;
    }

    public double getPrecioMonitor() {
        return precioMonitor;
    }

    public void setPrecioMonitor(int precioMonitor) {
        this.precioMonitor = precioMonitor;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                ", marcaMonitor='" + marcaMonitor + '\'' +
                ", precioMonitor=" + precioMonitor +
                ", pulgadas=" + pulgadas +
                ", idMonitor=" + idMonitor +
                ", contador=" + contador +
                '}';
    }
}
