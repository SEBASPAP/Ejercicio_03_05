/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Personaje;
import java.util.List;

/**
 *
 * @author paulp
 */
public interface IPersonajeServicio {
    public Personaje crear(Personaje personaje);
    public List<Personaje>listar();
    public Personaje modificarPer(Personaje personaje);
    public Personaje buscar(String personaje);
}
