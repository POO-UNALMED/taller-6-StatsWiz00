package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int numVehiculos = 0;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getNumVehiculos() {
        return numVehiculos;
    }
    public void addVehiculo(){
        numVehiculos ++;
        this.pais.addVehiculo();
    }
    public static Fabricante fabricaMayorVentas(){
        Fabricante mayor = Fabricante.fabricantes.get(0);
        for (Fabricante fabricante: fabricantes){
            if(mayor.getNumVehiculos() < fabricante.getNumVehiculos()){
                mayor = fabricante;
            }
        }
        return mayor;
    }
}
