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

	/***
	 * metodo que se ejecuta cuando se encuentran dos animales distintos y se pelean
	 */
	public void pelear(Animal otro)
	{
		System.out.println("soy un ave feroz. Grrr");
		if (otro instanceof Ave){
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
	 * metodo que se utiliza cuando un animal se come a otro
	 */
	public void comer(Animal otro){
		//primero se llama a pelear
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
}
	
	
