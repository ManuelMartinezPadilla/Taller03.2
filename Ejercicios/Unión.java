package Ejercicios;

public class Unión {
        public static void main(String[]args){
            // Usando polimorfismo
        Persona persona = new Persona();     // Instancia de Persona
        Persona estudiante = new Estudiante(); // Instancia de Estudiante
        Persona profesor = new Profesor();    // Instancia de Profesor
        
        //Invocar el método presentarse
        persona.presentarse();
        estudiante.presentarse(); 
        profesor.presentarse();   
    }
}

