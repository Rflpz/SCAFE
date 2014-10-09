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
public class Grupo {
    private int idGrupo;
    private String nombreGrupo;
    private String grado;
    private String carrera;
    
    public int getIdGrupo(){
        return this.idGrupo;
    }
    public String getNombre(){
        return this.nombreGrupo;
    }
    public String getGrado(){
        return this.grado;
    }
    public String getCarrera(){
        return this.carrera;
    }
    public void setIdGrupo(int grup){
        this.idGrupo = grup;
    }
    public void setNombreGrupo(String nom){
        this.nombreGrupo = nom;
    }
    public void setGrado(String gra){
        this.grado = gra;
    }
    public void setCarrera(String carr){
        this.carrera = carr;
    }
    @Override
    public String toString(){
        return "idGrupo: " + Integer.toString(this.idGrupo) +" nombre: " + nombreGrupo +" grado: " + grado +" carrera: " + carrera;
    }
}
