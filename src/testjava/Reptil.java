/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

public class Reptil extends Animal{
   
	
	/**
	 * Constructor que genera un reptil con
	 * @param vida del animal de tipo integer
	 * @param ataque del animal de tipo integer
	 * @param sexo del animal de tipo char
	 * @param nombre del animal de tipo String
	 */ 
	public Reptil(int vida , int ataque,char sexo,String nombre){
		super(vida,ataque,sexo,nombre);
	
    }
<<<<<<< HEAD
	public Reptil(String nombre,int ataque) {
		super(nombre,ataque);
		this.setPatas(4);
		this.setSalta(true);
		this.setOjos(2);
	}
   
    
}
=======
	
	 /**
     * metodo pelear de la clase Reptil con parametros
     * @param otro del tipo animal
     */
	/*public void pelear(Animal otro){
		
		if (otro instanceof Reptil){
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
		
	}*/
	
	/**
	 * metodo comer de la clase Reptil
	 */
	/*public void comer(Animal otro){
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
			
	}*/
        
}
>>>>>>> a6a9688eb6775bf56f90ab419dbad062315bfc73
