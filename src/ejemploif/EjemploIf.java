
package ejemploif;

import java.util.Scanner;

/**
 *
 * @author duvbarte
 */
public class EjemploIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int edad;

        Scanner miScanner = new Scanner(System.in);

        System.out.println("1. Introduce tu edad");

        edad = Integer.parseInt(miScanner.nextLine());

        System.out.println("2. Tu edad es " + edad);

        if (edad > 18) {

            System.out.println("3. Puedes entrar a un bar");

        } else {
            System.out.println("3. A Vete a tu casa!");

        }

        System.out.println("Fin de ejecucion");

    }

}
