/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;


public class Pez extends Animal{
   
	
	/**
	 * Constructor que genera un pez con
	 * @param vida del animal de tipo integer
	 * @param ataque del animal de tipo integer
	 * @param sexo del animal de tipo char
	 * @param nombre del animal de tipo String
	 */ 
	public Pez(int vida , int ataque,char sexo,String nombre){
		super(vida,ataque,sexo,nombre);
	
    }
	
	 /**
     * metodo pelear de la clase pez con parametros
     * @param otro del tipo animal
     */
	public void pelear(Animal otro){
		
		if (otro instanceof Pez){
			if(otro.getSexo() == this.getSexo()){
				this.setVida(this.getVida() - otro.getAtaque());
				otro.setVida(otro.getVida() - this.getAtaque());
			}
		}
		else{
			while ((otro.getVida() > 0) &&  (this.getVida()> 0)){
				this.setVida(this.getVida() - otro.getAtaque());
				if (this.getVida() > 0 ){
					otro.setVida(otro.getVida() - this.getAtaque());
				}
				
			}
		}
		
	}
	
	/**
	 * metodo comer de la clase pez
	 */
	public void comer(Animal otro){
		if (otro.getVida() > 0)  {
			this.pelear(otro);
		}
		if (this.getVida() <= 0){
			this.setEstado("muerto");
			System.out.println("el animal "+otro.getNombre()+"  se comio a "+this.getNombre());
		}

		if (otro.getVida() <= 0){
			otro.setEstado("muerto");
			System.out.println("el animal "+this.getNombre()+"  se comio a "+otro.getNombre());
		}
			
	}
        
}
