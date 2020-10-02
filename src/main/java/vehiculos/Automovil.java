package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;

    public Automovil(int puertas, int velocidadMaxima, String traccion, int puestos) {
        super(puertas, velocidadMaxima, traccion);
        this.puestos = puestos;
    }
}