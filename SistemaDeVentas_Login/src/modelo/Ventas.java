package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ventas")
public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;

    @Column(name = "cod_pedido", nullable = false)
    private int codpedido;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @Column(name = "cliente", nullable = false, length = 100)
    private String cliente;

    @Column(name = "documento", nullable = false, length = 20)
    private String documento;

    @Column(name = "direccion", length = 255)
    private String direccion;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "total", nullable = false)
    private double total;

    public Ventas() {
    }

    public Ventas(int codigo, int codpedido, String tipo, String cliente, String documento, String direccion, int telefono, double total) {
        this.codigo = codigo;
        this.codpedido = codpedido;
        this.tipo = tipo;
        this.cliente = cliente;
        this.documento = documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodpedido() {
        return codpedido;
    }

    public void setCodpedido(int codpedido) {
        this.codpedido = codpedido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}