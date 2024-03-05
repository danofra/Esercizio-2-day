package es2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un intero: ");
        int num = scanner.nextInt();
        System.out.println(printNumber(num));
        scanner.close();
    }

    public static String printNumber(int number) {
        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return "Uno";
            case 2:
                return "Due";
            case 3:
                return "Tre";
            default:
                return "Valore non valido, inserire un numero compreso tra 0 e 3.";
        }
    }
}
