package modelo;

import java.util.ArrayList;

public class PedidosManager {

    private static ArrayList<Pedidos> pedidos = new ArrayList<>();

    static {
        pedidos = new ArrayList<>();
        pedidos.add(new Pedidos(1, 1, 1, 1, 1));
        pedidos.add(new Pedidos(2, 1, 2, 2, 1));
    }

    public static void setPedidos(Pedidos pedido) {
        pedidos.add(pedido);
    }

    public static ArrayList<Pedidos> getPedidos() {
        return pedidos;
    }
}
