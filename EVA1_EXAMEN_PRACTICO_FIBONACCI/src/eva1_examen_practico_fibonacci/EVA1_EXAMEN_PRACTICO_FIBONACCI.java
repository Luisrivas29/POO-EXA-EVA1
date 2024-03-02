package eva1_examen_practico_fibonacci;

import java.util.*;

public class EVA1_EXAMEN_PRACTICO_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        //constructor default
        ClassFibonacci serie1 = new ClassFibonacci();
        serie1.printSerie();
        
        //constructor custom
        ClassFibonacci serie2 = new ClassFibonacci(0,1,20);
        serie2.printSerie();
        
        //constructor custom del ususario
        System.out.println("Primer valor de la serie: ");
        int valor1 = keyboard.nextInt();
        System.out.println("Segundo valor de la serie: ");
        int valor2 = keyboard.nextInt();
        System.out.println("Numero de repeticiones: ");
        int valor3 = keyboard.nextInt();
        
        ClassFibonacci serie3 = new ClassFibonacci(valor1,valor2,valor3);
        serie3.printSerie();
    }
    
}
