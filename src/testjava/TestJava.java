
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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	Animal p1 = new Pez(100,20,'f',"Pez");
    	Animal p2 = new Pez(100,40,'m',"Pez");
    	Animal m1 = new Mamifero(100,40,'f',"Mamifero");
        Animal m2 = new Mamifero(100, 40, 'm',"Mamifero");
        Mamifero m3 = new Mamifero(100, 10, 'm',"Mamifero");
        Animal m4 = new Mamifero(100, 13, 'f',"Mamifero");
        Pez p3 = new Pez(100,25, 'm',"Pez");
        Pez p4 = new Pez(100,46, 'f',"Pez");
        Pez p5 = new Pez(100,14,'f',"Pez");
        Mamifero m5 = new Mamifero(100,31,'m',"Mamifero");
        Mamifero m6 = new Mamifero(100,46,'m',"Mamifero");
        

        ArrayList<Animal> l = new ArrayList<>();
        {
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);
        l.add(p5);
        l.add(m1);
        l.add(m2);
        l.add(m3);
        l.add(m4);
        l.add(m5);
        l.add(m6);
        }

        Random r = new Random();
        for (int i = 0; i < l.size(); i++) {
            int animalSeleccionado = r.nextInt(l.size() - 1);
            if (animalSeleccionado != i) {
            	l.get(i).comer(l.get(animalSeleccionado));
            	
            }
            else {
                System.out.println("No me puedo comer a mi mismo");
            }
        }
        for (int i = 0; i < l.size(); i++) {
        	System.out.println(l.get(i).getVida() + " soy "+l.get(i).getNombre()+"  "+l.get(i).getEstado());
        }
}
}

     	
     

