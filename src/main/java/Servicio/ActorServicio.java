/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Actor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulp
 */
public class ActorServicio implements IActorServicio {

    private static List<Actor> actorList = new ArrayList<>();

    @Override
    public Actor crear(Actor actor) {
        this.actorList.add(actor);
        return actor;
    }

    @Override
    public List<Actor> listar() {
        return this.actorList;
    }

    @Override
    public Actor modificar(Actor actor) {
        for (int i = 0; i < this.actorList.size(); i++) {
            Actor ac = this.actorList.get(i);
            if (actor.getNombre().equals(ac.getNombre())) {
                this.actorList.set(i, actor);
                break;
            }
        }
        return null;
    }

    @Override
    public Actor eliminar(String nombre) {
        for (int i = 0; i < this.actorList.size(); i++) {
            Actor ac = this.actorList.get(i);
            if (nombre.equals(ac.getNombre())) {
                this.actorList.remove(i);
                break;
            }
        }
        return null;
    }

    @Override
    public boolean buscar(String personaje, String pelicula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
