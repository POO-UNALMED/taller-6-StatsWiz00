package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;
    private static int cantidadAutos;

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "Fwd", fabricante);
        this.puestos = puestos;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public static int getCantidadAutos() {
        return cantidadAutos;
    }
}