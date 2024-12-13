package modelo;

import java.util.ArrayList;

public class PedidoTemp {

    private static ArrayList<Pedidos> pedidoTemp = new ArrayList<>();

    static {
        pedidoTemp = new ArrayList<>();
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
