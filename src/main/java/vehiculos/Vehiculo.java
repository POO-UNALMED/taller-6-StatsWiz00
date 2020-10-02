package vehiculos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    private static ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();


    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
    }

    public Vehiculo(int velocidadMaxima, String traccion) {
        this.velocidadMaxima = velocidadMaxima;
        this.traccion = traccion;
        lista.add(this);
    }
    public int getCantidadVehiculos(){
        return lista.size();
    }
}
