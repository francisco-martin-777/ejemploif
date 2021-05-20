
package ejemploif;

import java.util.Scanner;

public class EjemploIf2 {

    public static void main(String[] args) {

        int edad;
        double dinero;

        Scanner miScanner = new Scanner(System.in);

        System.out.println("1. Introduce tu edad");

        edad = Integer.parseInt(miScanner.nextLine());
        

        System.out.println("2. Cuanto dinero tienes?");

        dinero = Double.parseDouble(miScanner.nextLine());

        System.out.println("3. Tu edad es " + edad + " y tienes " + dinero + " euros");

        // Primero vamos a evaluar condiciones con la edad
        if (edad > 18) {

            System.out.println("4. Puedes entrar a un bar");
            
        } 
        
        else if (dinero>20) {
            
        }
        else {
            System.out.println("4.A. Vete a tu casa!");

        }

        // Aqui vamos a mirar condiciones en base al dinero
        if (edad>18 && dinero > 2) {

            System.out.println("5. Puedes pedir una caña");

        } else {
            System.out.println("5.A. Solo te puedo dar agua del grifo");

        }
        
   
        
        // vamos a ver el funcionamiento del OR
   
        if  (   (edad>65) ||   (dinero>=200 && dinero<=300)    ) {
            
           
            System.out.println("6. Pensionista pudiente!!");
  
        }
        
        

        System.out.println("Fin de ejecucion");

    }

}
