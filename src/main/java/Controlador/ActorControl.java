/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Actor;
import Modelo.Pelicula;
import Modelo.Personaje;
import Servicio.ActorServicio;
import java.util.List;
/**
 *
 * @author paulp
 */
public class ActorControl {
    
    Actor act;

    private final ActorServicio actorServicio = new ActorServicio();

    public Actor crear(String[] params, int fechaNacimiento, int edad,Personaje personaje,Pelicula pelicula) {  //,Personaje personaje,Pelicula pelicula
        var actor = new Actor(params[0], params[1], fechaNacimiento, edad,personaje,pelicula); //,personaje,pelicula
        this.actorServicio.crear(actor);
        return actor;
    }

    public List<Actor> listar() {
        return this.actorServicio.listar();
    }

    public void modificar(String[] params, int fechaNacimiento, int edad, Personaje pers, Pelicula pelicula) {

        for (int i = 0; i < this.listar().size(); i++) {
            if (params[0].equals(this.listar().get(i).getNombre())) {
                var act = new Actor(params[0], params[1], fechaNacimiento, edad, pers, pelicula);
                act.setNacionalidad(params[1]);
                act.setFechanacimiento(fechaNacimiento);
                act.setEdad(edad);
                act.setPelicula(pelicula);
                act.setPersonaje(pers);
                actorServicio.modificar(act);
            }
        }
    }
    
    public void eliminar(String nombre){
        
        this.actorServicio.eliminar(nombre);
    }
}
