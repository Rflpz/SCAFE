/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Blob;

/**
 *
 * @author Rflpz
 */
public class Usuario {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String contrasena;
    private Blob fotografia;
    private String correo;
    private String cargo;
    private int tipo;
    private int privilegios;
    
    //Clear the variables of the object
    public Usuario(){
        this.nombre = null;
        this.apellidoP = null;
        this.apellidoM = null;
        this.contrasena = null;
        this.fotografia = null;
        this.correo = null;
        this.tipo = 0;
        this.privilegios = 0;
        this.cargo = null;
    }
    
    //Get information from object USER
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidoP(){
        return this.apellidoP;
    }
    public String getApellidoM(){
        return this.apellidoM;
    }
    public String getContrasena(){
        return this.contrasena;
    }
    public Blob getFotografia(){
        return this.fotografia;
    }
    public String getCorreo(){
        return this.correo;
    }
    public String getCargo(){
        return this.cargo;
    }
    public int getprivilegios(){
        return this.privilegios;
    }
    public int getTipo(){
        return this.tipo;
    }
    
    //Set information to object USER
    public void setNombre(String nombreO){
        this.nombre = nombreO;
    }
    public void setApellidoP(String apellidoPO){
        this.apellidoP = apellidoPO;
    }
    public void setApellidoM(String apellidoMO){
        this.apellidoM = apellidoMO;
    }
    public void setContrasena(String contrasenaO){
        this.contrasena = contrasenaO;
    }
    public void setFotografia(Blob fotografiaO){
        this.fotografia = fotografiaO;
    }
    public void setCorreo(String correoO){
        this.correo = correoO;
    }
    public void setCargo(String cargoO){
        this.cargo = cargoO;
    }
    public void setTipo(int tipoO){
        this.tipo = tipoO;
    }
    public void setPrivilegios(int privilegiosO){
        this.privilegios = privilegiosO;
    }
    @Override
    public String toString(){
        return this.nombre +
                " " + 
                this.apellidoP +
                " " + 
                this.apellidoM;
    }
}
