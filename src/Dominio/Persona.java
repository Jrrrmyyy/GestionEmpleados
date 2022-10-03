/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 * crear subclase que se llame empleado (hereda nombre apellidos)
 * crear otro campo de NumSS pal empleado, 
 * Modificar clase persona para tener atributo final. Extender comportamiento
 * creando clase empleado metodo imprimir empleado.
 * @author Alumno Mañana
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int contadorr;

    
    private static int contadorPersona;
    
    
    public Persona() {
        this.contadorr = ++Persona.contadorPersona;
    }
    public Persona(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getContadorr() {
        return contadorr;
    }
    public static int getContadorPersona() {
        return contadorPersona;
    }

    
    public final void imprimir(){
        System.out.println("imprimiendo desde la clase padre...");
    }
    @Override
    public String toString() {
        return "-> "+ nombre + "-" + apellido + " ID" + contadorr ;
    }
    

    
    

    
    
}    

    
    
    

