/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        // TODO code application logic here

        Pez p1 = new Pez("alberto", true, true);
        Mamifero m1 = new Mamifero("Diego", 10, 4);
        Animal m2 = new Mamifero("Pedro", 10, 3);
        Pez p3 = new Pez("Santiago", true, true);
        Mamifero m3 = new Mamifero("Rodrigo", 10, 4);
        Animal m4 = new Mamifero("Luciano", 10, 3);
        Reptil r1 = new Reptil("Juan cruz", 2);
        Reptil r2 = new Reptil("Mariano", 4);
          Reptil r3 = new Reptil("Juan cruz", 2);
        Reptil r4 = new Reptil("Mariano", 4);
        Reptil r5 = new Reptil("Mariano", 4);
        

        ArrayList<Animal> l = new ArrayList<>();

        l.add(p1);
        l.add(p3);
        l.add(m1);
        l.add(m2);
        l.add(m3);
        l.add(r1);
        l.add(r2);
        l.add(m4);
        l.add(r4);
        l.add(r3);
        l.add(r5);
        

        Random r = new Random();
        for (int i = 0; i < l.size(); i++) {
            int animalSeleccionado = r.nextInt(l.size() - 1);
            if (animalSeleccionado != i) {
                l.get(i).comer(l.get(animalSeleccionado));
            } else {
                System.out.println("No me puedo comer a mi mismo");
            }
        }
    }

    /* Animal a1 = new Animal("Pepe");
        Animal a2 = new Animal("Juan");
        Animal a3 = new Animal("Pedro");
        Animal a5 = new Animal("Juancito");
        System.out.println("La mascota que me compre se llama:" + a1.getNombre());
        a1.setNombre("pepito");
        System.out.println("La mascota que me compre se llama:" + a1.getNombre());
     */
}
