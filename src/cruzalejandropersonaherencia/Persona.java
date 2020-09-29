/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruzalejandropersonaherencia;

/**
 *
 * @author EntornoVM
 */
class Persona{
    
    public Persona(){
        
    };
    
    public Persona(String n,String a,long d){
        nombre = n;
        apellido=a;
        dni=d;
    }
    
    public void setNombre(String n){
        nombre=n;
    }
    
    public void setApellido(String a){
        apellido=a;
    }
    public void setDni(long d){
        dni=d;
    }    
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public long getDni(){
        return dni;
    }
    
    public void mostrar(){
        System.out.println("Datos: "+getNombre()+" "+getApellido()+" "+getDni());        
    }
        
    private String nombre,apellido;
    private long dni;
}
