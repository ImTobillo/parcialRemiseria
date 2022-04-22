package app;

public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private float totalAPagar;

    public Cliente()
    {
        nombre = "";
        apellido = "";
        telefono = "";
        direccion = "";
        totalAPagar = 0;
    }

    public Cliente(String nombre, String apellido, String telefono, String direccion, float totalAPagar)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.totalAPagar = totalAPagar;
    }

    // gets

    public float getTotalAPagar() {
        return totalAPagar;
    }

    public String getNombre() {
        return nombre;
    }
}
