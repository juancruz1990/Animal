/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

/**
 *
 * @author fdman
 */
public class Mamifero extends Animal{
    //private int tiempoDeGestacion;
    //private int cantidadMamas;
    
    
    /**
     * Constructor que genera un mamifero con
     * @param vida del animal de tipo integer
     * @param ataque del animal de tipo integer
     * @param sexo del animal de tipo char
     * @param nombre del animal de tipo String
     */ 

   	 public Mamifero(int vida , int ataque, char sexo,String nombre){
 		super (vida,ataque,sexo,nombre);
 	    }
}
