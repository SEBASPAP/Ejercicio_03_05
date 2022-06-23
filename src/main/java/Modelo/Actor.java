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
public class Actor {
    public String nombre;
    public String nacionalidad;
    public int fechanacimiento;
    public int edad;
    Personaje Personaje;
    Pelicula Pelicula;

    
    public Actor(String nombre, String nacionalidad, int fechanacimiento, int edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechanacimiento = fechanacimiento;
        this.edad = edad;
    }
    
    public Actor(String nombre, String nacionalidad, int fechanacimiento, int edad, Personaje Personaje, Pelicula Pelicula) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechanacimiento = fechanacimiento;
        this.edad = edad;
        this.Personaje = Personaje;
        this.Pelicula = Pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(int fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Personaje getPersonaje() {
        return Personaje;
    }

    public void setPersonaje(Personaje Personaje) {
        this.Personaje = Personaje;
    }

    public Pelicula getPelicula() {
        return Pelicula;
    }

    public void setPelicula(Pelicula Pelicula) {
        this.Pelicula = Pelicula;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombre);
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
        final Actor other = (Actor) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + 
                ", fechanacimiento=" + fechanacimiento + ", edad=" + edad + 
                ", Personaje=" + Personaje + ", Pelicula=" + Pelicula + '}';
    }
    
}
