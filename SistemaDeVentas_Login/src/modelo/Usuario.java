package modelo;

public class Usuario {
    private String codigo;
    private String nombre;
    private String clave;

    public Usuario() {
    }

    public Usuario(String codigo, String nombre, String clave) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.clave = clave;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

   
}
