/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Pelicula;
import Servicio.PeliculaServicio;
import java.util.List;
/**
 *
 * @author paulp
 */
public class PeliculaControl {
    
    private final PeliculaServicio peliculaServicio = new PeliculaServicio();
    
    public Pelicula crear(String [] params, int fecha){
        var pelicula = new Pelicula(params[0],params[1],params[2],params[3],fecha); 
        this.peliculaServicio.crear(pelicula);
        return pelicula;
    }
   
    public List<Pelicula> listar()
    {
        return this.peliculaServicio.listar();
    }
    
    public Pelicula buscar(String nombre){
        
        return this.peliculaServicio.buscar(nombre);
    }
}
