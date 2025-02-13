package com.ejercicios;

import java.util.Scanner;

public class Subcadena {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese una cadena que contenga letras de la a-z y A-Z");
        String CadenaOriginal = sc.nextLine();

        System.out.println("Ingrese el indice de 'Start': ");
        int start = sc.nextInt();

        System.out.println("Ingrese el indice 'End': ");
        int end = sc.nextInt();

        if (start >= 0 && end <= 100 || start <= 0 && end >= 100) {
            System.out.println("La sucadena que usted pidio es: " + CadenaOriginal.substring(start, end - 1));
        } else {
            System.out.println("Los parametros ingresados no son validos");
        }

        sc.close();
    }
}
