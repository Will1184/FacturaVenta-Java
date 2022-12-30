package com.gm.mundopc;

public class Computadora {
    private String nombre,marca;
    private  double idComputadora,precio,contadorComputadora;

    private static int contador;
    private static int idComputador;

    public Computadora(String nombre) {
        this.nombre = nombre;
    }

    public Computadora() {

        this.contadorComputadora=++contador;
    }

    public Computadora( int precio, String marca) {
        this();
        this.precio = precio;
        this.idComputadora=++idComputador;
        this.marca=marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getContadorComputadora() {
        return contadorComputadora;
    }

    public void setContadorComputadora(int contadorComputadora) {
        this.contadorComputadora = contadorComputadora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                ", marca='" + marca +
                ", precio=" + precio +
                '}';
    }
}
