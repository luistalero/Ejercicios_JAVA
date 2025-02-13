package com.ejercicios;

import java.util.Scanner;

public class PrestamoBancario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto de su Prestamo: ");
        double monto = sc.nextDouble();

        System.out.println("Ingrese la tasa de interés anual: ");
        double interes = sc.nextDouble();

        System.out.println("Ingrese el plazo de págo para el prestamo(en años): ");
        int anios = sc.nextInt();

        System.out.println(monto);
        System.out.println(interes);
        System.out.println(anios);
    }
}
