package vehiculos;

public class Camion extends Vehiculo{
    private int ejes;

    public Camion(int puertas, int velocidadMaxima, String traccion, int ejes) {
        super(puertas, velocidadMaxima, traccion);
        this.ejes = ejes;
    }
}
