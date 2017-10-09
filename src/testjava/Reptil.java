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
public class Reptil extends Animal{
int cantidadHuevos;
   
    /***
     * 
     * @param nombre
     * @param cantidadHuevos 
     */
    public Reptil( int cantidadHuevos) {
        super();
        this.cantidadHuevos = cantidadHuevos;
    }
	public Reptil(String nombre,int ataque) {
		super(nombre,ataque);
		this.setPatas(4);
		this.setSalta(true);
		this.setOjos(2);
	}
   
    
}
