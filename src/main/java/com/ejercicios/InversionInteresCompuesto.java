package com.ejercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class InversionInteresCompuesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("######.00");

        System.out.println("------------------------------------------------------------------\n-----------\tCalculo de interes Compuesto \t\t---------- \n------------------------------------------------------------------");

        System.out.print("Ingrese El monto de su Inversión Inicial: ");
        double capitalInicial = sc.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double interes = sc.nextDouble();

        System.out.print("Ingrese los años de la inversión: ");
        int anio = sc.nextInt();

        System.out.println("-------------------\n|  1. Mensual     |\n-------------------\n|  2. Trimestral  |\n-------------------\n|  3. Semestral   |\n-------------------\n|  4. Anual       |\n-------------------");
        int frecuenciaCapitalizacion = sc.nextInt();

        // Convertir la tasa de interés a decimal
        double r = interes / 100;

        // Calcular el crecimiento de la inversión año tras año
        for (int i = 1; i <= anio; i++) {
            double nuevoSaldo = capitalInicial * Math.pow(1 + r / frecuenciaCapitalizacion, frecuenciaCapitalizacion * i);
            double interesGanado = nuevoSaldo - capitalInicial;

            System.out.println("Año: " + i);
            System.out.println("Capital inicial: " + df.format(capitalInicial));
            System.out.println("Interés ganado en el año: " + df.format(interesGanado));
            System.out.printf("Nuevo saldo después del interés: " + df.format(nuevoSaldo));
            System.out.println();

            // Actualizar el capital inicial para el próximo año
            capitalInicial = nuevoSaldo;
        }

        sc.close();
    }
}