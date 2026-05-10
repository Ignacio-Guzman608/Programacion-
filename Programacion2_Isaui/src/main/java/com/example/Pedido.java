package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    private ArrayList<ItemPedido> items;
    private String idPedido;
    private String estado;

    public Pedido(String idPedido) {
        this.idPedido = idPedido;
        this.estado = "Pendiente";
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemPedido item) {
        items.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < items.size(); i++) {
            ItemPedido item = items.get(i);
            total += item.getProducto().getPrecio() * item.getCantidadSolicitada();
        }

        return total;
    }

    public void confirmarDisponibilidad() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < items.size(); i++) {
            ItemPedido item = items.get(i);

            while (item.getCantidadSolicitada() > item.getProducto().getCantidadDisponible()) {
                System.out.println("No hay stock suficiente de " + item.getProducto().getNombre());
                System.out.print("Ingrese una nueva cantidad: ");
                int nuevaCantidad = sc.nextInt();
                item.setCantidadSolicitada(nuevaCantidad);
            }
        }
    }

    public void procesarPedido() {
        for (int i = 0; i < items.size(); i++) {
            ItemPedido item = items.get(i);

            int procesados = 0;

            do {
                item.getProducto().setCantidadDisponible(
                        item.getProducto().getCantidadDisponible() - 1
                );

                procesados++;

            } while (
                    procesados < item.getCantidadSolicitada()
                            && item.getProducto().getCantidadDisponible() > 0
            );
        }

        estado = "Completado";
    }

    public void cambiarEstado(String nuevoEstado) {
        estado = nuevoEstado;
    }
}