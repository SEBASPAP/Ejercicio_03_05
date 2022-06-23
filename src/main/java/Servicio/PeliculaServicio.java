/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Pelicula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulp
 */
public class PeliculaServicio implements IPeliculaServicio{
    
    private static List<Pelicula> peliculaList = new ArrayList<>();

    @Override
    public Pelicula crear(Pelicula pelicula) {
        this.peliculaList.add(pelicula);
        return pelicula;
    }

    @Override
    public List<Pelicula> listar() {
        return this.peliculaList;
    }

    @Override
    public Pelicula buscar(String pelicula) {
        for (Pelicula pel : this.listar()) {
            if(pelicula.equals(pel.getNombreActor())){
                return pel;
            }
        }
        return null;
    }
    
}
