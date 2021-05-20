
package ejemploif;


public class EjemploIfElseIf {

    public static void main(String[] args) {

        int nota = 5;
// Primero evalua el primer if
        if (nota < 5) {
            System.out.println("primera nota es suspenso!");
        } // En otro caso distinto del anterior, evaluame tambien esta condicion
        else if (nota >= 5) {
            System.out.println("primera nota es aprobado!");

        }

                int segundaNota = 10;

        
        // ESTE ES OTRO BLOQUE IF INDEPENDENDIENTE DEL DE ARRIBA
        
        // Primero evalua el primer if
        if (segundaNota < 5) {
            System.out.println("segunda nota es suspenso!");
        } // En otro caso distinto del anterior, evaluame tambien esta condicion
        else if (segundaNota >= 5) {
            System.out.println("segunda nota es aprobado!");

        } else if (segundaNota == 10) {
            System.out.println("segunda nota es sobre!");

        }

    }
}
