package app;

public class Taxi extends Vehiculo{
    private float kmRecorridos;
    private float bajadaDeBandera;
    private float precioPorKM;

    public Taxi()
    {
        super();
        kmRecorridos = 0;
        bajadaDeBandera = 0;
        precioPorKM = 0;
    }

    public Taxi(String marca, String modelo, String tipoCombustible, String patente/*, float bajadaDeBandera*/, float precioPorKM)
    {
        super(marca, modelo, tipoCombustible, patente);
        kmRecorridos = 0;
        /*this.*/bajadaDeBandera = 10;
        this.precioPorKM = precioPorKM;
    }

    // gets

    public float getBajadaDeBandera() {
        return bajadaDeBandera;
    }

    public float getKmRecorridos() {
        return kmRecorridos;
    }

    public float getPrecioPorKM() {
        return precioPorKM;
    }

    // sets

    public void setKmRecorridos(float kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}
