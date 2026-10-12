package ok_boomer;

import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);



        System.out.println("Introduce tu edad entre el 1 y el 2020: ");
        int edad = sc.nextInt();

        if(edad >= 1945 && edad <= 1965){
            System.out.println("ok boomer");
        }else {
            System.out.println("nah");
        }
    }
}
