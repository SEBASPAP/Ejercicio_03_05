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
public class Personaje {
    public String nombre;
    public String nombrePer;
    public String funcionPer;
    public String generoMof;

    public Personaje(String nombre, String nombrePer, String funcionPer, String generoMof) {
        this.nombre = nombre;
        this.nombrePer = nombrePer;
        this.funcionPer = funcionPer;
        this.generoMof = generoMof;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrePer() {
        return nombrePer;
    }

    public void setNombrePer(String nombrePer) {
        this.nombrePer = nombrePer;
    }

    public String getFuncionPer() {
        return funcionPer;
    }

    public void setFuncionPer(String funcionPer) {
        this.funcionPer = funcionPer;
    }

    public String getGeneroMof() {
        return generoMof;
    }

    public void setGeneroMof(String generoMof) {
        this.generoMof = generoMof;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
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
        final Personaje other = (Personaje) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", nombrePer=" + nombrePer + ", funcionPer=" + funcionPer + ", generoMof=" + generoMof + '}';
    }
    
    
}
