package testjava;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

/**
 *
 * @author fdman
 */
public class TestJava {
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
		listaAnimales = generacionAleatoria(listaAnimales, r, 1000);
		simulacion(listaAnimales, r);
	}
	/***
	 * genera aleatoriamente una cantidad de animales pasada por parametros
	 * @param listaAnimales arraylist de animales
	 * @param r objeto de la clase random 
	 * @param cantidad de elementos que se quieren crear
	 * @return
	 */
	static ArrayList<Animal> generacionAleatoria(ArrayList<Animal> listaAnimales, Random r, int cantidad){
		int valor;
		char sexo;
		int vida;
		int ataque;
		Animal p1;
		for (int i=0 ; i<cantidad ; i++){
			valor = r.nextInt(5) + 1;
			if (r.nextInt(100) % 2 == 0){
				sexo = 'f';
			}
			else{
			sexo = 'm';
			}
			vida = r.nextInt(100)+1;
			ataque = r.nextInt(50)+1;
			if (valor == 1) {
				p1= new Pez(vida,ataque,sexo,"pepe"+r.nextInt(9999));
				listaAnimales.add(p1);
			}
			if (valor == 2) {
				p1= new Reptil(vida,ataque,sexo,"Juan"+r.nextInt(9999));
				listaAnimales.add(p1);
			}
			if (valor == 3) {
				p1= new Ave(vida,ataque,sexo,"Jose"+r.nextInt(9999));
				listaAnimales.add(p1);
			}
			if (valor == 4) {
				p1= new Mamifero(vida,ataque,sexo,"Rodolfo"+r.nextInt(9999));
				listaAnimales.add(p1);
			}
			if (valor == 5) {
				p1= new Anfibio(vida,ataque,sexo,"Pedro"+r.nextInt(9999));
				listaAnimales.add(p1);
			}
		}
		return listaAnimales;
	}
	/***
	 * simulacion hace que los animales contenidos en el arraylist se coman entre ellos
	 * @param listaAnimales
	 * @param r
	 */
	static void simulacion(ArrayList<Animal> listaAnimales, Random r){
		int j=0, k=0;
		int valor;
		while ((listaAnimales.size())>1){
			do{
				valor=r.nextInt(listaAnimales.size());
			}while (valor==j);
			System.out.println(j);
			System.out.println(valor);
			System.out.println(listaAnimales.size());
			listaAnimales.get(j).comer(listaAnimales.get(valor));
			k=0;
			while (k<listaAnimales.size()){
				if (listaAnimales.get(k).getVida()<=0){
					listaAnimales.remove(k);
				}
				k++;
			}
			if (j<listaAnimales.size()-1){
				j++;
			}
			else {
				j=0;
			}
		}
	}
}