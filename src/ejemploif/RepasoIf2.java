
package ejemploif;

import java.util.Scanner;

public class RepasoIf2 {

    public static void main(String[] args) {

        // Vamos a ver if anidados
        
        // supongamos que para aprobar has de sacar mas de un 5 en el examen
        // y ademas tener hechas las practicas
        
        // 1. Leemos de teclado primero la nota que ha sacado
        // si mete una nota no valida, fuera del rango de 0 a 10, mostramos error y FIN
        // 2. Leemos si ha hecho las practicas, con una pregunta simple y el usuario
        // ha de introcucir "si" o "no", si introduce cualquier otra cosa, idem, error y FIN
        // nota: la variable que considera si estan las practicas es un boolean, y vas a 
        // leer una cadena!
        // 3. Mostraremos el mensaje de alumno aprobado si tiene mas de un 5 y si las practicas
        // estan entregadas
        // 4. Si tiene un 4 y las practicas estan entregadas mostraremos 
        // un mensaje de alumno a recuperacion
        // 5. Si tiene menos de un 4 tenga las practicas entregadas o no, suspenso
        
        int notaExamen=0;
        boolean practicasEntregadas=false;
        
        String cadenaPracticas;
                
        Scanner miScanner =new Scanner(System.in);
        System.out.println("introduce la nota de examen");
        
        notaExamen = Integer.parseInt(miScanner.nextLine());
        
        if (notaExamen >=0 && notaExamen <=10){
                                              
            System.out.println("has hecho las practicaa?(si/no)");
            cadenaPracticas=miScanner.nextLine();
            
            
            if (cadenaPracticas.equals("si")){
                practicasEntregadas=true;
            }
            else if(cadenaPracticas.equals("no")){
                practicasEntregadas=false;
                
            }else{
                practicasEntregadas=false;
                System.out.println("error en practicas");
             }
            
                        
            //if(notaExamen >=5 && cadenaPracticas.equals("si")) {
            
            if(notaExamen >=5 && practicasEntregadas==true) {
                System.out.println("estas aprobado");
            }
            if(notaExamen ==4 && practicasEntregadas==true) {
                System.out.println("vas a recup");
            }
            if(notaExamen <4) {
                System.out.println("estas suspenso");
            }
            
                               
                       
            
        }else{
            System.out.println("error notaExamen");  
        }
        
    }

}
