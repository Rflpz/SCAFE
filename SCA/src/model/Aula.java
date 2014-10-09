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
public class Aula {
   private int idAula;
   private String nombre;
   private String tipo;
   
   public Aula(){
   }
   
   public int getIdAula(){
       return this.idAula;
   }
   public String getNombre(){
       return this.nombre;
   }
   public String getTipo(){
       return this.tipo;
   }
   
   public void setIdAula(int id){
       this.idAula = id;
   }
   public void setNombre(String nom){
       this.nombre = nom;
   }
   public void setTipo(String tip){
       this.tipo = tip;
   }
   
   public String toString(){
       return "idAula: " + this.idAula + " nombre: " + this.nombre + " tipo: " + this.tipo;
   }
}
