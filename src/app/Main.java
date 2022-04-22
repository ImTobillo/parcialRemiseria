package app;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        sistema.agregarAFlota(new Remis("chevrolet", "corsa", "diesel", "aa-123-me", 12));
        sistema.agregarAFlota(new Taxi("chevrolet", "corsa", "diesel", "aa-123-me", 100));

        System.out.println(sistema.pedirViaje(new Pedido("leo", "messi", "2234469437", "barcelona", "remis", 5)));
        System.out.println(sistema.pedirViaje(new Pedido("leo", "messi", "2234469437", "barcelona", "taxi", 5)));

        System.out.println("Cant clientes = "+ sistema.cantClientes());

        /*Vehiculo vehiculos[] = new Vehiculo[2];
        vehiculos[0] = new Remis("chevrolet", "corsa", "diesel", "aa-123-me", 12);
        vehiculos[1] = new Taxi("chevrolet", "corsa", "diesel", "aa-123-me", 100);

        System.out.println(         ((Remis)vehiculos[0]).getTarifaPorCuadra()    );
        */


    }
}
