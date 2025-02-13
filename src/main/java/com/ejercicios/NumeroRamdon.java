package com.ejercicios;

import java.util.Scanner;
import java.util.Random;

public class NumeroRamdon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroRamdon = random.nextInt(100) + 1;
        int adivinar = 0;
        int adivinanza;

        System.out.println("Adivina el numero secreto");
        System.out.println("Tengo un numero entre el 1 y el 100 ¿cual crees que será?");
        System.out.println(numeroRamdon);

        do {
            System.out.print("Ingresa tu adivinanza: ");
            adivinanza = sc.nextInt();
            adivinar++;
            
            if (adivinanza < numeroRamdon) {
                System.out.println("El número es mayor. ¡Intenta de nuevo!");
            } else if (adivinanza > numeroRamdon) {
                System.out.println("El número es menor. ¡Intenta de nuevo!");
            } else {
                System.out.println("¡Felicitaciones! ¡Has adivinado el número!");
                System.out.println("Lo lograste en " + adivinar + " intentos.");
            }
        } while (adivinanza != numeroRamdon);
        
        sc.close();
    }
}
