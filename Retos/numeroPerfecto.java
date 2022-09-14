package Retos;

import java.util.Scanner;

public class numeroPerfecto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int sumaDiv = 0;

        do {
            System.out.println("Ingrese un numero positivo: ");
            num = sc.nextInt();
        }while (num < 0);

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumaDiv = sumaDiv + i;
            }
        }

        if (sumaDiv == num) {
            System.out.println("El numero es perfecto");
        }else{
            System.out.println("El numero no es perfecto");
        }
    }
}
