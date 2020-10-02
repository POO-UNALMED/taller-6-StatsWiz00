package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Fabricante> lista = new ArrayList<Fabricante>();
    private static ArrayList<Pais> paises = new ArrayList<Pais>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    }