package com.example;

public class ItemPedido {

    //attribute
    private Producto producto;
    private int cantidadSolicitada;

    //constructures
    public ItemPedido(Producto producto, int cantidadSolicitada) {
        this.producto = producto;
        this.cantidadSolicitada = cantidadSolicitada;
    }

    //getters
    public Producto getProducto() {
        return producto;
    }
    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    //setters
    public void setCantidadSolicitada(int cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }
}