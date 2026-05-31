package Caso01;

import java.util.Scanner;

public class Calculadora {

    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double resultado = 0;
        boolean operacionValida = true;

        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                } else {
                    resultado = dividir(num1, num2);
                }
                break;
            default:
                System.out.println("Opción no válida.");
                operacionValida = false;
                break;
        }

        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
