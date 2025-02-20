package Ejemplos;
package Taller03_2;

// Clase base
public class Animal02 {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

// Clase derivada (sin usar @Override)
public class Gato extends Animal {
    public void hacerSonido() {
        System.out.println("El gato maúlla.");
    }
}