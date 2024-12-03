package modelo;

public class Pedido {
    private String nombreCliente;
    private Productos product;
    private int cantidad;
    private int numeroMesa;
    private int precio;

// constructor 
    public Pedido(String nombreCliente, Productos product, int cantidad, int numeroMesa) {
        this.nombreCliente = nombreCliente;
        this.product = product;
        this.cantidad = cantidad;
        this.numeroMesa = numeroMesa;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
    public Productos getProduct() {
        return product;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    @Override
    public String toString() {
        return "Mesa: " + numeroMesa + ", Cliente: " + nombreCliente + ", Producto: " + product + ", Cantidad: " + cantidad;
    }
}