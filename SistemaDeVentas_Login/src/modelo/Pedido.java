package modelo;

public class Pedido {
    private String nombreCliente;
    private String nombreProducto;
    private int cantidad;
    private int numeroMesa;

// constructor 
    public Pedido(String nombreCliente, String nombreProducto, int cantidad, int numeroMesa) {
        this.nombreCliente = nombreCliente;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.numeroMesa = numeroMesa;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    @Override
    public String toString() {
        return "Mesa: " + numeroMesa + ", Cliente: " + nombreCliente + ", Producto: " + nombreProducto + ", Cantidad: " + cantidad;
    }
}