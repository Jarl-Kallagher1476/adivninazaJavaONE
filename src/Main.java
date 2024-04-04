import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Crea un programa que simule un juego de adivinanzas.
        El programa debe generar un número aleatorio entre 0 y 100,
        y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos.
        En cada intento, el programa debe informar si el número ingresado por el usuario
        es mayor o menor que el número generado.
*/

/*      Para generar un número aleatorio en Java:
             new Random().nextInt(100);
        Utiliza el Scanner para obtener los datos del usuario.
        Utiliza una variable para contar los intentos.
        Utiliza un bucle para controlar los intentos.
        Utiliza la instrucción ‘break;’para salir del bucle.
*/
        Scanner teclado = new Scanner(System.in);
        int numGenerado = new Random().nextInt(100);
        int intentos = 5;

        
        System.out.println("Adivina el número entre 0 y 100");

        for (int i = 1; i <= intentos; i++) {
            System.out.println("Escribe un número: ");
            int numUser = Integer.parseInt(teclado.nextLine());
            if (numUser == numGenerado) {
                System.out.println("Felicidades el numero es el correcto, lo hiciste en " + i + (i == 1 ?" intento":" intentos"));
                break;
            } else if (numUser < numGenerado) {
                System.out.println("El numero es mayor");
            } else if (numUser > numGenerado) {
                System.out.println("El numero es menor");
            }
            if (i == intentos){
                System.out.println("Lo siento solo tenias 5 intentos, el numero generado era: " + numGenerado);
            }

        }





    }
}