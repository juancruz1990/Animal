/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;


public class Pez extends Animal{
   
	
	/**
	 * Constructor que genera un pez con
	 * @param vida del animal de tipo integer
	 * @param ataque del animal de tipo integer
	 * @param sexo del animal de tipo char
	 * @param nombre del animal de tipo String
	 */ 
	
	 public Pez(int vida , int ataque, char sexo,String nombre){
		super (vida,ataque,sexo,nombre);
	    }
}
