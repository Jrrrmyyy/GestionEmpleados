/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Dominio.Persona;

/**
 *
 * @author Alumno Mañana
 */
public class Empleado extends Persona {
     private int NumSS;

    public Empleado() {
        super();
    }

    public Empleado(int NumSS) {
        this.NumSS = NumSS;
    }

    public Empleado(int NumSS, String nombre, String apellido) {
        super(nombre, apellido);
        this.NumSS = NumSS;
    }

    public int getNumSS() {
        return NumSS;
    }

    public void setNumSS(int NumSS) {
        this.NumSS = NumSS;
        
    }

    /*@Override NO SE PUEDE PORQUE ES FINAL 
    public void imprimir(){
        System.out.println("imprimiendo desde la clase padre...");
    }
    */
    
    @Override
    public String toString() {
        return "Número Seguridad Social " + NumSS;
    }
     
     
     
     
     
     
}

