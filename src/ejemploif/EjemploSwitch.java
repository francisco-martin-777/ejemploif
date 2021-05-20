
package ejemploif;

import java.util.Scanner;

public class EjemploSwitch {
    
            public static void main(String[] args) {
        
    
    // Un switch no es mas que una forma "simplificada" 
    // de escribir un if con muchasss condiciones
    
    int opcionMenu;
    
      Scanner miScanner =new Scanner(System.in);
        System.out.println("Soy una calculadora, Elige una accion a realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Salir");
        
        
        opcionMenu = Integer.parseInt(miScanner.nextLine());
        
        
        if (opcionMenu==1) {
            System.out.println("Sumando...");
        }
        
        if (opcionMenu==2) {
            System.out.println("Restando...");
        }
        
        if (opcionMenu==3) {
            System.out.println("Multiplicando...");
        }
   
        if (opcionMenu==4) {
            System.out.println("Adios...");
        }
        
        
        
 }   
}
