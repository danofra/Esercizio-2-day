package es3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci una stringa ( :q per uscire): ");
            String inputString = scanner.nextLine();
            if (inputString.equals(":q")) {
                System.out.println("Uscita dal programma");
                break;
            }
            stampaCaratteriSeparati(inputString);
        }
        scanner.close();
    }

    public static void stampaCaratteriSeparati(String inputString) {
        String[] caratteri = inputString.split("");
        String result = new String();
        for (int i = 0; i < caratteri.length; i++) {
            result += (caratteri[i]);
            if (i < caratteri.length - 1) {
                result += (",");
            }
        }
        System.out.println("Caratteri separati dalla virgola: " + result);
    }

}
