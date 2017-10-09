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
		/*
		 * Animal p1 = new Pez(100,20,'f',"Pez"); Animal p2 = new
		 * Pez(100,40,'m',"Pez"); Animal m1 = new
		 * Mamifero(100,40,'f',"Mamifero"); Animal m2 = new Mamifero(100, 40,
		 * 'm',"Mamifero"); Mamifero m3 = new Mamifero(100, 10, 'm',"Mamifero");
		 * Animal m4 = new Mamifero(100, 13, 'f',"Mamifero"); Pez p3 = new
		 * Pez(100,25, 'm',"Pez"); Pez p4 = new Pez(100,46, 'f',"Pez"); Pez p5 =
		 * new Pez(100,14,'f',"Pez"); Mamifero m5 = new
		 * Mamifero(100,31,'m',"Mamifero"); Mamifero m6 = new
		 * Mamifero(100,46,'m',"Mamifero");
		 * 
		 * /* Random r =new Random()
		 * 
		 * 
		 * 
		 * ArrayList<Animal> l = new ArrayList<>(); { l.add(p1); l.add(p2);
		 * l.add(p3); l.add(p4); l.add(p5); l.add(m1); l.add(m2); l.add(m3);
		 * l.add(m4); l.add(m5); l.add(m6); }
		 * 
		 * Random r = new Random(); for (int i = 0; i < l.size(); i++) { int
		 * animalSeleccionado = r.nextInt(l.size() - 1); if (animalSeleccionado
		 * != i) { l.get(i).comer(l.get(animalSeleccionado));
		 * 
		 * } else { System.out.println("No me puedo comer a mi mismo"); } } for
		 * (int i = 0; i < l.size(); i++) {
		 * System.out.println(l.get(i).getVida() +
		 * " soy "+l.get(i).getNombre()+"  "+l.get(i).getEstado()); }
		 */
		Random r = new Random();
		ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
		int valor;
		char sexo;
		int vida;
		int ataque;
		Animal p1;
		for (int i=0 ; i<100 ; i++){
			
			
			valor = r.nextInt(5) + 1;
			System.out.println(valor);
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
				p1= new Reptil(vida,ataque,sexo,"Juan"+r.nextInt(9999);
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
	}
}
