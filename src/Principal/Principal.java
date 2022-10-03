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
public class Principal {
    
    public static void main(String[] args) {
        
        Persona pers1 = new Persona("Alberto", "Fruta");
        Persona pers2 = new Persona("Rodolfo", "Verdura");
        
        Persona pers3 = new Persona("Juan","Pepe");
        Persona pers4 = new Persona("Miguel","Marrón");
        

        System.out.println("Estas son: " + pers1 + " " + pers2 + " " + pers3 +
                " " + pers4);
        
        
        System.out.println();
        
    }
    
    
}
