package Caso05;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaEstudiantes {

    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();
        int cantidad = 0;
        boolean cantidadValida = false;

        while (!cantidadValida) {
            try {
                System.out.print("Ingrese la cantidad de estudiantes a registrar: ");
                cantidad = scanner.nextInt();
                if (cantidad <= 0) {
                    System.out.println("Error: La cantidad debe ser mayor a cero.");
                } else {
                    cantidadValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                scanner.next();
            }
        }

        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            boolean nombreValido = false;
            while (!nombreValido) {
                try {
                    System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
                    String nombre = scanner.nextLine().trim();

                    if (nombre.isEmpty()) {
                        throw new IllegalArgumentException("El nombre no puede estar vacío.");
                    }

                    if (nombre.matches(".*\\d.*")) {
                        throw new IllegalArgumentException("El nombre no puede contener números.");
                    }

                    estudiantes.add(nombre);
                    nombreValido = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        System.out.println("\nLista completa de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }

        scanner.close();
    }
}
