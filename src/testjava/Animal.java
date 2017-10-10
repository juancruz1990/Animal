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
    int ataque;
    int vida;

    

	/***
     * constructor de la clase animal sin parametros 
     */

    public Animal(String nombre){
        System.out.println("Naci soy un animal");
        this.nombre = nombre;        
    }
    /***
     * contructor de la clase animal
     * @param nombre
     * @param ataque
     */
    public Animal(String nombre, int ataque){
        this.nombre = nombre;
        this.ataque= ataque;
        this.vida= 100;    
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
        //System.out.println("Naci soy una animal");
        this.vida = vida;
        this.ataque = ataque;
        this.sexo = sexo;
        this.nombre=nombre;

    }
     /**
      * metodo comer de la clase animal, que intenta comer a otro animal
      * @param otro del tipo animal
      */

    public void comer(Animal otro){
    	System.out.println("the fight is comming");
		this.pelear(otro);
		if (this.vida>=0){
			if (otro.vida <= 0){
				System.out.println(this.nombre+" comio a: "+otro.nombre);
			}
			else {
				System.out.println(this.nombre+" no pudo comer a: "+otro.nombre);
			}
		}
		else{
			System.out.println(this.nombre+" ha muerto intendo comer a: "+otro.nombre);
		}
    }
    /***
     * codigo para que dos animales se peleen 
     * @param otro objeto de tipo animal
     */
    public void pelear(Animal otro){
    	String Ab1, Ab2;
    	Ab1=this.getClass().getSimpleName();
    	Ab2=otro.getClass().getSimpleName();
    	System.out.println(Ab1+ ": "+ this.nombre+ " vs "+ Ab2+ ": "+ otro.nombre);
		if (Ab1.equals(Ab2)){
			if (this.getSexo()== otro.getSexo()){
				if (otro.getVida()>0){
					this.vida= this.vida - otro.getAtaque();
					System.out.println(this.nombre+" recibe: "+ otro.getAtaque()+" daño, y su salud queda en: "+ this.vida);
				}
				if (this.getVida()>0){
					otro.vida= otro.vida - this.getAtaque();
					System.out.println(otro.nombre+" recibe: "+ this.getAtaque()+" daño, y su salud queda en: "+ otro.vida);
				}
			}
		}
		else {
			while (otro.vida>0 && this.vida>0){
				if (otro.getVida()>0){
					this.vida= this.vida - otro.getAtaque();
					System.out.println(this.nombre+" recibe: "+ otro.getAtaque()+" daño, y su salud queda en: "+ this.vida);
				}
				if (this.getVida()>0){
					otro.vida= otro.vida - this.getAtaque();
					System.out.println(otro.nombre+" recibe: "+ this.getAtaque()+" daño, y su salud queda en: "+ otro.vida);
				}
			}
		}
    }
    /***
     * geterrs & setters
     * @return
     */

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
