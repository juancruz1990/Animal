/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

/**
 * Esta clase genera un nuevo animal
 * @author fdman
 */
public class Animal {
    int ojos;
    int patas;
    int dientes;
    float peso;
    String nombre;
    char color;
    boolean salta;
    char sexo;
    
    /***
     * Este es el constructor de animal
     * @param nombre de tipo cadena, necesario para darle nombre 
     */
    public Animal(String nombre){
        System.out.println("Naci soy una animal");
        this.nombre = nombre;
        
    }
    
    public void comer(Animal otro){
       
    }
    
    /***
     * Devuel el nombre del animal
     * @return 
     */
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    
    public char getColor(){
        return this.color;
    }

    public int getOjos() {
        return ojos;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getDientes() {
        return dientes;
    }

    public void setDientes(int dientes) {
        this.dientes = dientes;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isSalta() {
        return salta;
    }

    public void setSalta(boolean salta) {
        this.salta = salta;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
}
