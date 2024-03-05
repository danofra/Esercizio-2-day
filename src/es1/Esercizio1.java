package es1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa:");
        String inputString = scanner.nextLine();
        if (isEven(inputString.length())) {
            System.out.println("Il numero dei caratteri della Stringa è dispari");
        }else{
            System.out.println("Il numero dei caratteri della Stringa è pari");
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Inserisci un anno:");
        int inputyear = scanner.nextInt();
        if (isBisestile(inputyear)) {
            System.out.println("L'anno inserito è bisestile");
        }else{
            System.out.println("L'anno inserito non è bisestile");
        }
}
/* primo metodo */
    public static Boolean isEven(int num) {
            if (num % 2 == 0) {
                return false;
            }else{
                return true;
            }
    }
    /*secondo metodo*/
    public static Boolean isBisestile(int num) {
        if (num % 4 == 0 || (num % 100 == 0 && num % 400 == 0)) {
            return true;
        }else{
            return false;
        }
    }
    }




