package com.ejercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cualquier numero: ");
        int numero = sc.nextInt();

        sc.close();

        if (numero % 2 == 0) {
            System.out.println("Este numero es Par");
        } else {
            System.out.println("este numero es Impar");
        }
    }
}
