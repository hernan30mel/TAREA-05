import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Tienda {

    private String nombre;

    private String direccion;

    private Cliente[] clientes;

    private int index = 0;

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

    public Cliente[] getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        this.clientes[this.index++] = cliente;
    }

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.clientes = new Cliente[9];

    }

    public void ordenar() {

        Arrays.sort(this.clientes, new OrdenarCliente());

    }
}

class OrdenarCliente implements Comparator<Cliente> {

    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.getCodigo() - o2.getCodigo();
    }

}