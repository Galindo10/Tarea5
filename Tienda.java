package Tarea5;
public class Tienda {

    private Tarea5.Cliente cliente[];
    private int contadorCliente;

    private String nombre;
    private String direccion;

    public Tienda()
    {
        this.cliente = new Tarea5.Cliente[9];

        this.contadorCliente = 0;
    }

    public void agregarCliente(Tarea5.Cliente cliente)
    {
        this.cliente[contadorCliente++] = cliente;

    }

    public Cliente[] mostrarCliente()
    {
        return this.cliente;
    }


   public void ordenar(){

       int posicion[];
       int inicia = 0;


       posicion = new int[9];


       for (int i = 0; i < 9; i++ ){
           posicion[i]=i;
       }

       for (int i = 0; i < 9; i++ ){
           for (int j = i + 1; j < 9; j++ ){
               if (cliente[i].getCodigo() > cliente[j].getCodigo()){
                   inicia=posicion[i];
                   posicion[i]=posicion[j];
                   posicion[j]=inicia;
               }
           }
       }

       for (int i = 0; i < 9; i++){
           System.out.println( " CODIGO: " + cliente[posicion[i]].getCodigo()+" NOMBRE: " + cliente[posicion[i]].getNombres() + " APELLIDOS: " + cliente[posicion[i]].getApellidos());
       }
   }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



}

