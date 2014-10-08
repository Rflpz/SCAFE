/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rflpz
 */
public class Materia {
    private int idMateria;
    private String nombre;
    
    public Materia(){
        this.idMateria = 0;
        this.nombre = null;
    }
    
    public int getIdMateria(){
        return this.idMateria;
    }
    public String getNombreMateria(){
        return this.nombre;
    }
    public void setIdMateria(int id){
        this.idMateria = id;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }
    @Override
    public String toString(){
       return Integer.toString(this.idMateria) + " " + this.nombre;
    }
}
