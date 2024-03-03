/*
 * LUIS RAUL RIVAS SANCHEZ
 */
package EVA1_EXAMEN_PRACTICO_COVID;

import java.util.Scanner;

/**
 *
 * @author raulr
 */
public class Examen_covid{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        TestCovid persona = new TestCovid();
        
        System.out.println("Ingrese la edad:");
        int edad = input.nextInt();
        persona.setEdad(edad);

        System.out.println("¿Tiene alguna enfermedad cronica? (true/false):");
        boolean enfermedadCronica = input.nextBoolean();
        persona.setEnfermedadCronica(enfermedadCronica);

        System.out.println("Ingrese el peso en kg:");
        double peso = input.nextDouble();
        persona.setPeso(peso);

        System.out.println("Ingrese la estatura en metros:");
        double estatura = input.nextDouble();
        persona.setEstatura(estatura);
        
        System.out.println("Resultado del test COVID para la persona:");
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Enfermedad Cronica: " + persona.tieneEnfermedadCronica());
        System.out.println("Peso: " + persona.getPeso());
        System.out.println("Estatura: " + persona.getEstatura());
        System.out.println("Resultado: " + persona.calcularPersonaRiesgo());
    }
    
}
