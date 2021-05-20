
package ejemploif;

import java.util.Scanner;
public class ejemploif3 {
    public static void main(String[] args) {
     
        Scanner s=new Scanner(System.in);
     System.out.println("que nota has sacado ");
     float nota=Float.parseFloat(s.nextLine());

     
     if(nota >=0 && nota<3){
        System.out.println("tu nota es muy deficiente");
        }
     
    else if(nota>=3 && nota<5){
            System.out.println("tu nota es deficiente");
        }
     
     if (nota ==5){
            System.out.println("tu nota es de aprobado");
        }
     
     if(nota ==6){
            System.out.println("tu nota es bien");
        }
     
     if(nota >=7 && nota <=8){
            System.out.println("tu nota es notable");
        }
     
   
     
     if(nota >=9 && nota <=10){
            System.out.println("tu nota es sobre");
        }
     
     
        
    }
}
