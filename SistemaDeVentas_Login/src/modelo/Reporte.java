
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Reporte {
     private int numeroMesa;
    private ArrayList<Pedidos> pedidos;

    public Reporte(int numeroMesa, ArrayList<Pedidos> pedidos) {
        this.numeroMesa = numeroMesa;
        this.pedidos = pedidos;
    }

    public ArrayList<Pedidos> getPedidos() {
        return this.pedidos;
    }


    public void agregarPedido(Pedidos pedido) {
        pedidos.add(pedido);
    }
    public void mostrarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos disponibles.");
        } else {
            for (Pedidos pedido : pedidos) {
                
            }
        }
    }
}


