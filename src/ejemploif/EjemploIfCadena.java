
package ejemploif;

import java.util.Scanner;


public class EjemploIfCadena {
    
    
    public static void main(String[] args) {
        
        String cadenaLeida;
        boolean cadenaReconocida;
        
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        cadenaLeida = miScanner.nextLine();
        
        
        
        if (cadenaLeida.equals("hola")) {
            System.out.println("saludos");
            cadenaReconocida=true;
        }
        else if (cadenaLeida.equals("adios")) {
            System.out.println("despedida");
            cadenaReconocida=true;
        }
        else {
            System.out.println("No entiendo");
            cadenaReconocida=false;
        }
        
        
        //if (cadenaLeida.equals("hola") || cadenaLeida.equals("adios")) {
        if (cadenaReconocida==true) {  
          System.out.println("Orden entendida");
        }
        else {
            System.out.println("Orden no entendida");
        }
        
        
        
        
        
        
        
    }
    
}
