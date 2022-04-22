package app;

public class Agencia {
    private Cliente[] clientes;
    private int cantClientes;
    private Remis[] remises;
    private int cantRemises;
    private Taxi[] taxis;
    private int cantTaxis;
    private float recaudacion;

    public Agencia()
    {
        clientes = new Cliente[20];
        cantClientes = 0;
        remises = new Remis[20];
        cantRemises = 0;
        taxis = new Taxi[20];
        cantTaxis = 0;
    }

    // sets

    public void recibirPago(float pago)
    {
        recaudacion += pago;
    }

    // metodos

    public void agregarAFlota(Vehiculo auto)
    {
        if (auto instanceof Remis)
        {
            remises[cantRemises] = (Remis)auto;
            cantRemises++;
        }
        else if (auto instanceof Taxi)
        {
            taxis[cantTaxis] = (Taxi)auto;
            cantTaxis++;
        }
    }

    public Remis pedirRemis()
    {
        int i = 0;

        while (i < cantRemises && remises[i].isDisponible() == false)
            i++;

        if (i == cantRemises) // no se encontro ninguno disponible
            return null;
        else
        {
            remises[i].setDisponible(false);
            return remises[i];
        }
    }

    public Taxi pedirTaxi()
    {
        int i = 0;

        while (i < cantTaxis && taxis[i].isDisponible() == false)
            i++;

        if (i == cantTaxis) // no se encontro ninguno disponible
            return null;
        else
        {
            taxis[i].setDisponible(false);
            return taxis[i];
        }
    }

    public void agregarCliente(Cliente cliente)
    {
        clientes[cantClientes] = cliente;
        cantClientes++;
    }

    public boolean chequearCliente(String nombre)
    {
        for (int i = 0; i < cantClientes; i++) {
            if (clientes[i].getNombre().equalsIgnoreCase(nombre))
                return true;
        }
        return false;
    }

    public int getCantClientes() {
        return cantClientes;
    }
}
