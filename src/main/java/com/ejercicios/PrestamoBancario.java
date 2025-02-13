package com.ejercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PrestamoBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#####0.00");

        // Solicitar datos al usuario
        System.out.println("Calculadora de Préstamo Bancario");
        System.out.println("--------------------------------");
        
        System.out.print("Ingrese el monto del préstamo en pesos: ");
        double prestamo = sc.nextDouble();
        
        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaAnual = sc.nextDouble();
        
        System.out.print("Ingrese el plazo del préstamo en años: ");
        int años = sc.nextInt();

        // Cálculos iniciales
        double tasaMensual = tasaAnual / (12 * 100); 
        int totalPagos = años * 12;
        
        double cuotaMensual = prestamo * (tasaMensual * Math.pow(1 + tasaMensual, totalPagos))
                / (Math.pow(1 + tasaMensual, totalPagos) - 1);

        System.out.println("\nTABLA DE AMORTIZACIÓN");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s%n",
                "Cuota", "Saldo Inicial", "Cuota Mensual", "Interés", "Capital", "Saldo Final");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");

        double saldo = prestamo;
        
        for (int mes = 1; mes <= totalPagos; mes++) {
            double interesPagado = saldo * tasaMensual;
            double capitalPagado = cuotaMensual - interesPagado;
            double nuevoSaldo = saldo - capitalPagado;
            
            System.out.printf("%-10d $%-14s $%-14s $%-14s $%-14s $%-14s%n",
                    mes,
                    df.format(saldo),
                    df.format(cuotaMensual),
                    df.format(interesPagado),
                    df.format(capitalPagado),
                    df.format(nuevoSaldo));
            
            saldo = nuevoSaldo;
        }

        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nRESUMEN DEL PRÉSTAMO:");
        System.out.println("Monto del préstamo: $" + df.format(prestamo));
        System.out.println("Tasa de interés anual: " + tasaAnual + "%");
        System.out.println("Plazo: " + años + " años");
        System.out.println("Cuota mensual: $" + df.format(cuotaMensual));
        System.out.println("Total a pagar: $" + df.format(cuotaMensual * totalPagos));
        
        sc.close();
    }
}