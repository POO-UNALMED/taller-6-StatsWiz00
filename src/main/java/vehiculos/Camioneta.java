package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;

    public Camioneta(int velocidadMaxima, String traccion, boolean volco) {
        super(90, "4x4");
        this.volco = volco;
    }
}
