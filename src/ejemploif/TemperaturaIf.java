
package ejemploif;

import java.util.Scanner;

public class TemperaturaIf {

    public static void main(String[] args) {
        double medicion;

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce medicion de temperatura actual");
        medicion = Double.parseDouble(miScanner.nextLine());

        if (medicion < -274 || medicion > 70) {
            
            System.out.println("Error en lectura de medicion");
            
        } else {

            if (medicion == 25) {
                System.out.println("Temperatura ideal, la temperatura: " + medicion);
            } else if (medicion < -30) {
                System.out.println("Congelacion!, la temperatura: " + medicion);

            } else if (medicion >= -30 && medicion < 0) {
                System.out.println("Hace frio con ganas!, la temperatura: " + medicion);

            } 

            else if (medicion <= 0) {
                System.out.println("Estamos bajo 0!, la temperatura: " + medicion);
            }
            
           
            
            
            
            if (medicion==0) {
                System.out.println("se hace hielo");
            }
            
        }        
        
      
    }

}
