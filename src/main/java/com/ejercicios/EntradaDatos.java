package com.ejercicios;

import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        sc.close();

        System.out.print("Bienvenido " + nombre + ", Usted tiene " + edad + " años");
    }
}
