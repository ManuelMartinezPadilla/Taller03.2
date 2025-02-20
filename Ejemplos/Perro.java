package Ejemplos
// Clase base
public class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

public class Perro extends Animal {  //Dos clases públicas no pueden estar dentro del mismo archivo
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}
