package Tarea5;

public class Cliente {

    private Integer codigo;

    private String nombres;

    private String apellidos;

    public Cliente()
    {

    }

    public Cliente(Integer codigo, String nombre, String apellidos) {
        this.codigo = codigo;
        this.nombres = nombre;
        this.apellidos = apellidos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
