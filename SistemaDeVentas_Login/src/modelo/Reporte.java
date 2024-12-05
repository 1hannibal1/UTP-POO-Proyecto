
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Reporte {
     private int numeroMesa;
    private ArrayList<Pedido> pedidos;

    public Reporte(int numeroMesa, ArrayList<Pedido> pedidos) {
        this.numeroMesa = numeroMesa;
        this.pedidos = pedidos;
    }

    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }


    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    public void mostrarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos disponibles.");
        } else {
            for (Pedido pedido : pedidos) {
                System.out.println("Cliente: " + pedido.getNombreCliente() + 
                                   ", Producto: " + pedido.getProduct() + 
                                   ", Cantidad: " + pedido.getCantidad());
            }
        }
    }
}


