package app;

public class Pedido {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String tipoVehiculo;
    private int cuadrasARecorrer;

    public Pedido()
    {
        nombre = "";
        apellido = "";
        telefono = "";
        direccion = "";
        tipoVehiculo = "";
        cuadrasARecorrer = 0;
    }

    public Pedido(String nombre, String apellido, String telefono, String direccion, String tipoVehiculo, int cuadrasARecorrer)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoVehiculo = tipoVehiculo;
        this.cuadrasARecorrer = cuadrasARecorrer;
    }

    // gets

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public int getCuadrasARecorrer() {
        return cuadrasARecorrer;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }
}
