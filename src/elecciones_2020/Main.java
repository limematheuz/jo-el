package elecciones_2020;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de votos: ");
        int votosBiden = sc.nextInt();

        System.out.println("Introduce el numero de votos: ");
        int votosDrump = sc.nextInt();

        if (votosBiden > votosDrump) {
            System.out.println("Jiden");
        } else if (votosBiden == votosDrump) {
            System.out.println("NO");
        } else {
            System.out.println("Drump");

        }

        System.out.println("El numero de votos de Jiden es: " + votosBiden);
        System.out.println("El numero de votos de Drump es: " + votosDrump);
    }
}
