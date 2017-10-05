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
    private int ojos;
    private int patas;
    private int dientes;
    private float peso;
    private String nombre;
    private char color;
    private boolean salta;
    private char sexo;
    private int vida;
    private int ataque;
    private String estado;
    

	/***
     * constructor de la clase animal sin parametros 
     */
	public Animal(){
		
		
	}
	/***
	 *constructor de la clase animal con parametros 
	 *
	 * @param vida del animal de tipo integer
	 * @param ataque del animal de tipo integer
	 * @param sexo del animal de tipo char
	 * @param nombre del animal de tipo String
	 */
    public Animal(int vida , int ataque, char sexo,String nombre){
        System.out.println("Naci soy una animal");
        this.vida = vida;
        this.ataque = ataque;
        this.sexo = sexo;
        this.nombre=nombre;
        this.estado= "vivo";
        
    }
     /**
      * metodo comer de la clase animal con parametros
      * @param otro del tipo animal
      */
    public void comer(Animal otro){
       
    }
    

    public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void modificarVida(int salud){
		this.vida = vida-salud;
	}
	
	public void setColor(char color) {
		this.color = color;
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
