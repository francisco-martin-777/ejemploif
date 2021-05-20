
package ejemploif;


public class EjemploIfSoloSeguidoOtroIf {

    public static void main(String[] args) {

        int nota = 7;

        // 1. Un if seguido de otro if
        if (nota >= 5) {
            System.out.println("appobado");
        }
        // Y aqui el resto de sentencias del programa independientes del if anterior
        System.out.println("mas sentencias...");

        
        // Aqui hay otro if, TOTALMENTE independiente del de mas arriba
        if (nota == 7) {
            System.out.println("tienes un 7");
        }
        // Y aqui el resto de sentencias del programa independientes del if anterior
        System.out.println("mas sentencias 2...");
    }
}
