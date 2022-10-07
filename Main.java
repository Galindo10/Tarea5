package Tarea5;
import Tarea5.Cliente;
import Tarea5.Tienda;
public class Main {

    public static void main(String args[])
    {
        Tarea5.Tienda tienda = new Tienda();
        tienda.setNombre("Galindo S.S");
        tienda.setDireccion("JR.san mateo MZ B1 LT 13");
        tienda.agregarCliente(new Tarea5.Cliente(102,"Kevin","casio borja"));
        tienda.agregarCliente(new Tarea5.Cliente(103,"Sandro","Santiago Soto"));
        tienda.agregarCliente(new Tarea5.Cliente(104,"Pedro","Santacruz Cruz"));
        tienda.agregarCliente(new Tarea5.Cliente(106,"Joel","Soto Santiago"));
        tienda.agregarCliente(new Tarea5.Cliente(105,"Carlos","Tucto Montero"));
        tienda.agregarCliente(new Tarea5.Cliente(107,"Felix","Arpasi Chambi"));
        tienda.agregarCliente(new Tarea5.Cliente(109,"Osmar","Toribio Matos"));
        tienda.agregarCliente(new Tarea5.Cliente(108,"Aquiles","Matos Toribio"));
        tienda.agregarCliente(new Tarea5.Cliente(101,"Pilunchi","Albornoz Aguirre"));

        System.out.println("TIENDA CON NOMBRE: "+tienda.getNombre()+ " DIRECCION: "+tienda.getDireccion());

        for(Cliente cliente: tienda.mostrarCliente()) {

            System.out.println("CODIGO DE CLIENTE: "+cliente.getCodigo()+" NOMBRE: "+cliente.getNombres()+"  APELLIDOS: "+cliente.getApellidos());
        }


        tienda.ordenar();


    }
}
