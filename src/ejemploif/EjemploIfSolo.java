
package ejemploif;

public class EjemploIfSolo {

    public static void main(String[] args) {

        int nota = 7;

        // 1. Un if solo
        if (nota >= 5) {
            System.out.println("appobado");
        }
        // Y aqui el resto de sentencias del programa independientes del if anterior
        System.out.println("mas sentencias...");

    }
}
