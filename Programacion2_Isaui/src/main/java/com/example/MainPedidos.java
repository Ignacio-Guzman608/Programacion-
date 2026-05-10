package com.example;

public class MainPedidos {
    public static void main(String[] args) {
        Producto p1 = new Producto("Teclado", 15000, 1);
        Producto p2 = new Producto("Mouse", 8000, 0);

        ItemPedido i1 = new ItemPedido(p1, 2);
        ItemPedido i2 = new ItemPedido(p2, 1);

        Pedido pedido = new Pedido("P001");

        pedido.agregarItem(i1);
        pedido.agregarItem(i2);

        pedido.confirmarDisponibilidad();

        System.out.println("Total: $" + pedido.calcularTotal());

        pedido.procesarPedido();
    }
}