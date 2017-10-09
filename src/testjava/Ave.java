package testjava;


public class Ave extends Animal {
	/***
	 * Constructor de la clase Ave
	 * predefine los atributos propios de las aves
	 * @param nombre
	 */
	public Ave(String nombre,int ataque) {
		super(nombre,ataque);
		this.setPatas(2);
		this.setDientes(0);
		this.setSalta(false);
		this.setOjos(2);
	}
	 public Ave(int vida , int ataque, char sexo,String nombre){
		super (vida,ataque,sexo,nombre);
	    }
}
	
	
