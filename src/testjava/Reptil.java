/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

public class Reptil extends Animal{
   
	
	/**
	 * Constructor que genera un reptil con
	 * @param vida del animal de tipo integer
	 * @param ataque del animal de tipo integer
	 * @param sexo del animal de tipo char
	 * @param nombre del animal de tipo String
	 */ 

	public Reptil(String nombre,int ataque) {
		super(nombre,ataque);
		this.setPatas(4);
		this.setSalta(true);
		this.setOjos(2);
	}
	 public Reptil(int vida , int ataque, char sexo,String nombre){
		super (vida,ataque,sexo,nombre);
	    }
}