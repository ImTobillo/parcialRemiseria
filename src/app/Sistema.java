package app;

public class Sistema {
    private Agencia agencia;

    public Sistema()
    {
        agencia = new Agencia();
    }

    // metodos

    public boolean pedirViaje(Pedido pedido)
    {
        if (pedido.getTipoVehiculo().equalsIgnoreCase("remis"))
        {
            Remis remis = agencia.pedirRemis();
            if (remis != null)
            {
                Cliente cliente = new Cliente(pedido.getNombre(), pedido.getApellido(), pedido.getTelefono(), pedido.getDireccion(), pedido.getCuadrasARecorrer()*remis.getTarifaPorCuadra());
                if (agencia.chequearCliente(cliente.getNombre()) == false)
                    agencia.agregarCliente(cliente);
                agencia.recibirPago(cliente.getTotalAPagar());
                return true;
            }
            else
                return false;
        }
        else if (pedido.getTipoVehiculo().equalsIgnoreCase("taxi"))
        {
            Taxi taxi = agencia.pedirTaxi();
            if (taxi != null)
            {
                Cliente cliente = new Cliente(pedido.getNombre(), pedido.getApellido(), pedido.getTelefono(), pedido.getDireccion(), taxi.getBajadaDeBandera()+ taxi.getKmRecorridos()* taxi.getPrecioPorKM());
                if (agencia.chequearCliente(cliente.getNombre()) == false)
                    agencia.agregarCliente(cliente);
                agencia.recibirPago(cliente.getTotalAPagar());
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }

    public void agregarAFlota(Vehiculo auto)
    {
        agencia.agregarAFlota(auto);
    }

    public int cantClientes()
    {
        return agencia.getCantClientes();
    }

}
