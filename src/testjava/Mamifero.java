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
    int tiempoDeGestacion;
    int cantidadMamas;
    /***
     * Constructor que genera un mamifero con
     * @param nombre
     * @param tiempoDeGestacion
     * @param cantMamas 
     */
    public Mamifero(String nombre, int tiempoDeGestacion, int cantMamas) {
        super(nombre);
        this.tiempoDeGestacion = tiempoDeGestacion;
        this.cantidadMamas = cantMamas;
    }
    
    public void comer(Animal otro){
        System.out.println("Soy un mamifero");
        
        if (otro instanceof Pez){
            System.out.println("Puedo comer peces");
        }
        if (otro instanceof Mamifero){
            System.out.println("Tengo que pensarlo...");
        }
        if (otro instanceof Reptil){
            System.out.println("Si puedo comer un reptil");
        }
    }
    
   
    
}
