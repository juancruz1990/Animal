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
public class Pez extends Animal{
    boolean esVertebrado;
    boolean tieneBranquias;
    
    /***
     * Este es el contructor de pez
     * @param nombre de tipo cadena
     * @param esVertebrado de tipo logico, que define si tiene espinas o no
     * @param tieneBranquias 
     */
    public Pez(String nombre, boolean esVertebrado, boolean tieneBranquias) {
        super(nombre);
        System.out.println("Naci soy un pez");
        this.tieneBranquias = tieneBranquias;
        this.esVertebrado = esVertebrado;
    }
    
   public void comer(Animal otro){
       System.out.println("No puedo comer a " + otro.getNombre() + " porque yo soy pez y el es "+ otro.getClass());
   }
    
   
    
    
}
