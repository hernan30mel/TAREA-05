public class Main {

    public static void main(String[] args) {

        Tienda tienda = new Tienda("Comercial Juliams", "jr 28 de julio 523");
        tienda.addCliente(new Cliente(733, "Karen Diana", "Criollo Calero"));
        tienda.addCliente(new Cliente(826, "Miguel Angel", "Serrano Aquino"));
        tienda.addCliente(new Cliente(213, "Frans Stiven", "Jara Payano"));
        tienda.addCliente(new Cliente(154, "Nelvi Fiorella", "Revolledo Avila"));
        tienda.addCliente(new Cliente(582, "Lesli Carolina", "Caballero Rojas"));
        tienda.addCliente(new Cliente(623, "Yan Yordi", "zevallos Reyes"));
        tienda.addCliente(new Cliente(702, "Nelson Brayan", "Jaramillo Cardenas"));
        tienda.addCliente(new Cliente(362, "Gonzalo Oscar", "Ramirez Castro"));
        tienda.addCliente(new Cliente(956, "Junior Piero", "Maylle Alarcon"));

        tienda.ordenar();

        System.out.println(tienda.getNombre() + " " + tienda.getDireccion());

        for (Cliente cliente : tienda.getClientes()) {
            System.out.println(cliente.getCodigo() + " " + cliente.getNombres() + " " + cliente.getApellidos());

        }


    }


}
