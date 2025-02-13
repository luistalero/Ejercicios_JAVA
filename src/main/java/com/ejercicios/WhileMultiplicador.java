package com.ejercicios;

import java.util.Scanner;

public class WhileMultiplicador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero a multiplicar: ");
        int numero = sc.nextInt();

        int contador = 1;

        while (contador <= 10) {
            int resultado = numero * contador;
            System.out.println(numero + " * " + contador + " = " + resultado );
            contador++;

            sc.close();
        }
    }
}
