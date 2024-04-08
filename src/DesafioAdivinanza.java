import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinanza {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroUsuario = 0;
        System.out.println(numeroAleatorio);
        System.out.println("Bienvenid@ al Juego del Número Secreto \n");

        for (int i = 0; i < 5 ; i++) {
            System.out.println((i+1) + " Ingresa un número del 1 al 100: ");
            numeroUsuario = teclado.nextInt();

            if (numeroUsuario != numeroAleatorio) {
                if (numeroUsuario > numeroAleatorio){
                    System.out.println("El número es MENOR. \n");
                }else {
                    System.out.println("El número es MAYOR. \n");
                }
            } else {
                System.out.println("EXCELENTE!, el número aleatorio es: " + numeroAleatorio );
                System.out.println("Número de intentos: " + (i+1));
                break;
            }

            if (i == 5) {
                System.out.println("LLEGO AL NÚMERO MÁXIMO DE INTENTOS. \n");
            }

        }
    }
}