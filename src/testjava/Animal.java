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
    
    public Animal(String nombre, int ataque){
        this.nombre = nombre;
        this.ataque= ataque;
        this.vida= 100;    
    }
    /***
     * codigo para comer un animal
     * @param otro
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

    }
     /**
      * metodo comer de la clase animal con parametros
      * @param otro del tipo animal
      */

    public void comer(Animal otro){
		this.pelear(otro);
		if (this.vida>=0){
			if (otro.vida <= 0){
				System.out.println("lo he comido");
			}
			else {
				System.out.println("no he podido comerlo");
			}
		}
		else{
			System.out.println("he muerto en el intento y estas hablando con mi espiritu");
		}
    }
    /***
     * codigo para que dos animales se peleen 
     * @param otro
     */
    public void pelear(Animal otro){
    	String Ab1, Ab2;
    	Ab1=this.getClass().getSimpleName();
    	Ab2=otro.getClass().getSimpleName();
		if (Ab1.equals(Ab2)){
			if (this.getSexo()== otro.getSexo()){
				this.vida= this.vida - otro.getAtaque();
				otro.vida= otro.vida - this.getAtaque();
			}
		}
		else {
			while (otro.vida>0 && this.vida>0){
				this.vida= this.vida - otro.getAtaque();
				otro.vida= otro.vida - this.getAtaque();
			}
		}
    }

    /***
     * Devuel el nombre del animal
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
