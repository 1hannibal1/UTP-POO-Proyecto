package modelo;

public class Pedido {
    private String producto;
    private int cantidad;
    private double precioUnitario;

    public Pedido(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    @Override
    public String toString() {
        return cantidad + " x " + producto + " @ $" + precioUnitario + " = $" + calcularTotal();
    }
}