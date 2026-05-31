import Caso01.Calculadora;
import Caso02.Persona;
import Caso03.Operacion;
import Caso04.Contador;
import Caso05.ListaEstudiantes;

public class Main {
    public static void main(String[] args) {	

	//Modificando desde Dev
	//Nueva linea desde dev

        //Caso 1
         //Calculadora.iniciar();

        //Caso 2
         //Persona persona1 = new Persona("Juan", 25);
         //Persona persona2 = new Persona("María", 30);
         //persona1.mostrarDatos();
         //persona2.mostrarDatos();

        //Caso 3
         //Operacion operacion = new Operacion();
        // int sumaDosEnteros = operacion.sumar(5, 10);
         //double sumaDosDecimales = operacion.sumar(4.5, 3.2);
         //int sumaTresEnteros = operacion.sumar(3, 7, 12);
        // System.out.println("Suma de dos enteros (5 + 10): " + sumaDosEnteros);
        // System.out.println("Suma de dos decimales (4.5 + 3.2): " + sumaDosDecimales);
        // System.out.println("Suma de tres enteros (3 + 7 + 12): " + sumaTresEnteros);

        //Caso 4
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
         System.out.println("Cantidad de objetos Contador creados: " + Contador.getContador());

        //Caso 5
        //ListaEstudiantes.iniciar();
    }
}