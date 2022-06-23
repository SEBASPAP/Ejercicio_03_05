/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Actor;
import java.util.List;

/**
 *
 * @author paulp
 */
public interface IActorServicio {
    public Actor crear(Actor actor);
    public List<Actor>listar();
    public Actor modificar(Actor actor);
    public Actor eliminar(String nombre);
    public boolean buscar(String personaje,String pelicula);
}
