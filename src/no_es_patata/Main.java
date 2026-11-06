package no_es_patata;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de lineas: ");
        int inputUser = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < inputUser; i++){
            System.out.println("Introduce una palabra: ");
            String linea = sc.nextLine();
            if(linea.toLowerCase().equals("patata")){
                System.out.println("Es patata");
            }else{
                System.out.println("No es patata");
            }
        }
    }
}
