package ejemploif;

import java.util.Scanner;

public class switchdiasemana {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String diaSemana;

        System.out.println("dime dia de la semana");
        diaSemana = s.nextLine();

        if (diaSemana.equals("l") || diaSemana.equals("m") || diaSemana.equals("x") || diaSemana.equals("j") || diaSemana.equals("v")) {

            System.out.println("madrugas");

        } else if (diaSemana.equals("s") || diaSemana.equals("d")) {

            System.out.println("es finde,no madrugas");
            if (diaSemana.equals("d")) {
                System.out.println("vas a misa");
            }

        } else {
            System.out.println("dia introducido incorrecto");
        }

        switch (diaSemana) {
            case "l":
                System.out.println("madrugas");
                break;
            case "m":
                System.out.println("madrugas");
                break;
            case "x":
                System.out.println("madrugas");
                break;
            case "j":
                System.out.println("madrugas");
                break;
            case "s":
                System.out.println("finde");
                break;
            default:
                System.out.println("dia introducido incorrecto");

        }

        // OTRA FORMA, PARA NOTA
        switch (diaSemana) {
            case "l":
            case "m":
            case "x":
            case "j":
                System.out.println("madrugas");
                break;
            case "s":
                System.out.println("finde");
                break;
            default:
                System.out.println("dia introducido incorrecto");

        }

    }
}
