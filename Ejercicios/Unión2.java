package Ejercicios;

public class Unión2 {
    public static void main(String[] args) {
        // Crear objetos
        Vehículo vehiculo = new Vehículo(); // Instancia de Vehiculo
        Vehículo bicicleta = new Bicicleta(); // Instancia de Bicicleta (referencia de tipo Vehiculo)
        // Invocar el método moverse
        vehiculo.moverse();   // Imprime: El vehículo se está moviendo.
        bicicleta.moverse();  // Imprime: La bicicleta se está moviendo con pedales.
    }
}


