package divisible_1_a_10;

import java.util.Scanner;

public class Main {
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int MAX = 10;

        System.out.println("Introduce un numero y veremos si es divisible: ");
        int numero = sc.nextInt();


        for(int i = 1; i < MAX; i++){
            if(numero % i != 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("SI");
    }
}
