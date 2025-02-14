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

        int frecuencia = 0;
        boolean opcionValida = false;
        // Menú para seleccionar la frecuencia de capitalización
        while (!opcionValida) {
            System.out.println("Seleccione la frecuencia de capitalización:");
            System.out.println("1. Mensual");
            System.out.println("2. Trimestral");
            System.out.println("3. Semestral");
            System.out.println("4. Anual");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    frecuencia = 12;
                    opcionValida = true;
                    break;
                case 2:
                    frecuencia = 4;
                    opcionValida = true;
                    break;
                case 3:
                    frecuencia = 2;
                    opcionValida = true;
                    break;
                case 4:
                    frecuencia = 1;
                    opcionValida = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        // esta parte la agregamos para el Cálculo del monto final
        double tasaDecimal = interes / 100;
        double montoFinal = capitalInicial * Math.pow(1 + (tasaDecimal / frecuencia), frecuencia * anio);
        System.out.printf("El monto final después de %d años es: %.2f%n", anio, montoFinal);

        sc.close();
    }
            
}
