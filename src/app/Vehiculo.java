package app;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String tipoCombustible;
    private String patente;
    private boolean disponible;

    public Vehiculo()
    {
        marca = "";
        modelo = "";
        tipoCombustible = "";
        patente = "";
        disponible = false;
    }

    public Vehiculo(String marca, String modelo, String tipoCombustible, String patente)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.patente = patente;
        disponible = true;
    }

    // gets

    public boolean isDisponible() {
        return disponible;
    }

    // sets

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
