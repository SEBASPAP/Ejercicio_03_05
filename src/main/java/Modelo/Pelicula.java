/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author paulp
 */
public class Pelicula {
    public String nombre;
    public String nombreActor;
    public String genero;
    public String paisOrigen;
    public int fechaPublicacion;

    public Pelicula(String nombre, String nombreActor, String genero, String paisOrigen, int fechaPublicacion) {
        this.nombre = nombre;
        this.nombreActor = nombreActor;
        this.genero = genero;
        this.paisOrigen = paisOrigen;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombreActor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        return Objects.equals(this.nombreActor, other.nombreActor);
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", nombreActor=" + nombreActor + ", genero=" + genero + ", paisOrigen=" + paisOrigen + ", fechaPublicacion=" + fechaPublicacion + '}';
    }
    
    
}
