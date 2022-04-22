package app;

public class Remis extends Vehiculo{
    private float tarifaPorCuadra;

    public Remis()
    {
        super();
        tarifaPorCuadra = 0;
    }

    public Remis(String marca, String modelo, String tipoCombustible, String patente, float tarifaPorCuadra)
    {
        super(marca, modelo, tipoCombustible, patente);
        this.tarifaPorCuadra = tarifaPorCuadra;
    }

    // gets

    public float getTarifaPorCuadra() {
        return tarifaPorCuadra;
    }
}
