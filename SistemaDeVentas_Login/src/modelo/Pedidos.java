package modelo;

public class Pedidos {

    private int codigo;
    private int codPedido;
    private int codProducto;
    private int cantidad;
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
