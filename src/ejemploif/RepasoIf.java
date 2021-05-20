
package ejemploif;

import java.util.Scanner;


public class RepasoIf {

    public static void main(String[] args) {

        // Supongamos vamos a tomar ciertas decisiones en base a çierto valor
        // En este ejemplo, em base a la hora
        // Declaramos la variable donde guardaremos la hora
        int hora;

        
//  Declaramos el scanner para poder leer de teclado 
        Scanner miScanner = new Scanner(System.in);

// Damos instrucciones de lo que hay que hacer
        System.out.println("Que hora es?");

        // Leemos la hora de teclado, ojo al parseint!!
        // Ya que el readline devuelve String y la hora es de tipo int
        hora = Integer.parseInt(miScanner.nextLine());

        // Mostramos por pantalla hora que ha introducido
        System.out.println("La hora que me has dicho es " + hora);

        // La sentencia de arriba es independiente del if
        // Dependiendo de la hora daremos los buenos dias, tardes, etc.
        // La hora al tener que estar en un rango hay que jugar con los < > y con el
        // operador logico && (and) en este caso
        if (hora >= 0 && hora < 12) { // si la hora es mayor que 8 Y menor que 12
            System.out.println("Buenos dias!");

        } // Esto es, SI NO ( sino se cumple la condicio anterior), 
        // SI y miramos la condicion actual
        else if (hora >= 12 && hora <= 17) {
            System.out.println("Es mediodia!");
        } 
        else if (hora>17 && hora<22) {
            System.out.println("Buenas tardes!");
        } 
        else if (hora>=22 && hora<=23) {
            System.out.println("Buenas noches!");
        } 
        else {
            System.out.println("TE ESTAS QUEDANDO CONMIGO, ESA HORA NO ES VALIDA!");

        }

    }
}
