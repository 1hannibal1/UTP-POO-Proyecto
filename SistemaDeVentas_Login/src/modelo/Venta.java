package modelo;

import java.util.ArrayList;

public class Venta {

    private int codigo;
    private String nombreCliente;
    private String codigoDocumento;
    private String tipoVenta;
    private String ruc;
    private String telefono;
    private ArrayList<ProductoVenta> productos;
    private String fechaRegistro;
    private double costoTotal;

    public Venta() {
    }

    public Venta(int codigo, String nombreCliente, String codigoDocumento, String tipoVenta, String ruc, String telefono, ArrayList<ProductoVenta> productos, String fechaRegistro, double costoTotal) {
        this.codigo = codigo;
        this.nombreCliente = nombreCliente;
        this.codigoDocumento = codigoDocumento;
        this.tipoVenta = tipoVenta;
        this.ruc = ruc;
        this.telefono = telefono;
        this.productos = productos;
        this.fechaRegistro = fechaRegistro;
        this.costoTotal = costoTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCodigoDocumento() {
        return codigoDocumento;
    }

    public void setCodigoDocumento(String codigoDocumento) {
        this.codigoDocumento = codigoDocumento;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<ProductoVenta> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoVenta> productos) {
        this.productos = productos;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }


}
