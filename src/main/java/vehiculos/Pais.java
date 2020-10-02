package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private int numVehiculos = 0;
    private static ArrayList<Pais> paises = new ArrayList<Pais>();
    public Pais(String nombre) {
        this.nombre = nombre;
        paises.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addVehiculo(){
        numVehiculos ++;
    }

    public int getNumVehiculos() {
        return numVehiculos;
    }

    public static Pais paisMasVendedor(){
        Pais maxPais = paises.get(0);
        for (Pais pais: paises){
            if (maxPais.getNumVehiculos() < pais.getNumVehiculos()){
                maxPais= pais;
            }
        }
        return maxPais;
    }
}