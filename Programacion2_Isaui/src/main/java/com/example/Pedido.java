package com.example;

import java.util.ArrayList;

public class Pedido {

    //attribute
    String idpedido;
    String estado;
    ArrayList<String> listaItemPedidos = new ArrayList<>();

    //constructures
    public pedido (String idpedidos,String estado, String listaItemPedidos ) {
        this.idpedido = "";
        this.estado = "";
        this.listaItemPedidos.of("");
    }

    public String getIdpedido() {return idpedido; }
    public void setIdpedido (String idpedido) {this.idpedido = idpedido; }

    public String getEstado() {return estado; }
    public void setEstado (String estado) {this.estado = estado; }

    // falta array
    //public String getNombreProducto() {return nombreProducto; }
    //public void setNombreProducto (string nombreproducto) {this.nombreproducto = nombreproducto; }
}
