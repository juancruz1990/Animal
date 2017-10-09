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
    
    public void comer(Animal otro){
    
        System.out.println("Soy un reptil");
        
        if (otro instanceof Pez){
            System.out.println("Puedo comer peces");
        }
        if (otro instanceof Mamifero){
            System.out.println("Puedo comer un mamifero");
        }
        if (otro instanceof Reptil){
            System.out.println("Tengo que pensarlo...");
        }
    }
}
