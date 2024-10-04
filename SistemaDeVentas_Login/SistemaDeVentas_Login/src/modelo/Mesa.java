package modelo;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numero;
    private List<Pedido> pedidos;

    public Mesa(int numero) {
        this.numero = numero;
        this.pedidos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.calcularTotal();
        }
        return total;
    }

    public void mostrarPedidos() {
        System.out.println("Pedidos de la Mesa " + numero + ":");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
        System.out.println("Total de la mesa " + numero + ": $" + calcularTotal());
    }
}
