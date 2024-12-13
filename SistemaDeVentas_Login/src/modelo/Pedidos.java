package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;

    @Column(name = "cod_pedido", nullable = false)
    private int codPedido;

    @Column(name = "cod_producto", nullable = false)
    private int codProducto;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "cod_mesa", nullable = false)
    private int codMesa;

    public Pedidos() {
    }

    public Pedidos(int codigo, int codPedido, int codProducto, int cantidad, int codMesa) {
        this.codigo = codigo;
        this.codPedido = codPedido;
        this.codProducto = codProducto;
        this.cantidad = cantidad;
        this.codMesa = codMesa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodMesa() {
        return codMesa;
    }

    public void setCodMesa(int codMesa) {
        this.codMesa = codMesa;
    }
}