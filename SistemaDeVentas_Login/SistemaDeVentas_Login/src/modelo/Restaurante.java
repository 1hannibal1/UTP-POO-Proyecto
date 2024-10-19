package modelo;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Mesa> mesas;

    public Restaurante(int numeroMesas) {
        mesas = new ArrayList<>();
        for (int i = 1; i <= numeroMesas; i++) {
            mesas.add(new Mesa(i));
        }
    }

    public Mesa getMesa(int numero) {
        if (numero > 0 && numero <= mesas.size()) {
            return mesas.get(numero - 1);
        } else {
            return null;
        }
    }

    public void mostrarEstadoMesas() {
        for (Mesa mesa : mesas) {
            mesa.mostrarPedidos();
        }
    }
}
