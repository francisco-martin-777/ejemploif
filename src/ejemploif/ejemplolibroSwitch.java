
package ejemploif;

import java.util.Scanner;

public class ejemplolibroSwitch {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Calculo de areas");
        System.out.println("1. cuadrado");
        System.out.println("2. rectangulo");
        System.out.println("3. triangulo");
        System.out.print("");
        System.out.println("\n elija una de las opciones(1-3)");
        
        int opcionMenu;
        double base;
        double altura;
        
        opcionMenu=Integer.parseInt(s.nextLine());
        
        
        switch(opcionMenu){
            case 1:
                System.out.println("introduzca lado cuadrado:");
                double lado=Double.parseDouble(s.nextLine());
                System.out.println("el area del cuadrado es  "+ (lado*lado)+" cm2");
                break;
            case 2:
                System.out.println("introduzca base rectangulo:");
                base=Double.parseDouble(s.nextLine());
                System.out.println("introduzca altura rectangulo:");
                altura=Double.parseDouble(s.nextLine());
                System.out.println("el area del rectangulo es  "+ (base*altura)+" cm2");
                break;
            case 3:
                System.out.println("introduzca base triangulo:");
                 base=Double.parseDouble(s.nextLine());
                System.out.println("introduzca altura triangulo:");
                 altura=Double.parseDouble(s.nextLine());
                System.out.println("el area del triangulo es  "+ ((base*altura)/2)+" cm2");
                break;  
            default:
                System.out.println("la opcion escogida no es valida");   
              
        }
    }
}
