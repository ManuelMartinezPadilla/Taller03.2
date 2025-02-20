package Ejemplos;
package Taller03_2;

// Clase base
public class Vehículo {
    public void acelerar(int velocidad) {
        System.out.println("El vehículo acelera a " + velocidad + " km/h.");
    }
}

// Clase derivada (incorrecta)
public class Coche extends Vehículo {
    // Error de compilación: Diferente firma del método
    @Override
    public void acelerar() {
        System.out.println("El coche acelera.");
    }
}