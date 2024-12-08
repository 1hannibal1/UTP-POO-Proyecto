package modelo;

import java.util.ArrayList;

public class PedidoTemp {

    private static ArrayList<Pedidos> pedidoTemp = new ArrayList<>();

    static {
        pedidoTemp = new ArrayList<>();
        pedidoTemp.add(new Pedidos(1, 1, 1, 1, 1));
        pedidoTemp.add(new Pedidos(2, 1, 2, 2, 1));
    }

    public static void setPedidos(Pedidos pedido) {
        pedidoTemp.add(pedido);
    }

    public static ArrayList<Pedidos> getPedidos() {
        return pedidoTemp;
    }

    public static void limpiarLista() {
        pedidoTemp.clear();
    }
}
