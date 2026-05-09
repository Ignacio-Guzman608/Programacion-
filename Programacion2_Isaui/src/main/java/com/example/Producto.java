package com.example;

public class Producto {

    //attribute
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    //constructures
    public Producto (String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }
    //geters
    public double getPrecio() {
        return precio;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    //seters      hara falta seters para los demas atributos?
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }






}
