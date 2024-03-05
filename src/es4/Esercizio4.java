package es4;
import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserisci un intero: ");
    int num = scanner.nextInt();
    System.out.println(printNumber(num));
}
public static String printNumber(int number) {
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
        return ("Conto alla rovescia terminato!");
}
}
