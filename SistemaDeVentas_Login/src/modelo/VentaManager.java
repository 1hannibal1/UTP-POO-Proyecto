package modelo;

import java.util.ArrayList;

public class VentaManager {
    private static final ArrayList<Venta> venta  = new ArrayList<>();

    public static ArrayList<Venta> getVenta() {
        return venta;
    }
}
