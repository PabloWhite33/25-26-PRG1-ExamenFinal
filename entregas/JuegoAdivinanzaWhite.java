import java.util.Scanner;

public class JuegoAdivinanzaWhite {
    public static void main(String[] args) {

        System.out.println("Juego de Adivinanza - Adivina el Numero Secreto");
        
        int numeroSecreto;
        int numero;
        int intentos; 
        int intentosMaximos;
        int numeroMaximo;
        int opcion;
        boolean adivinado = false;

        Scanner scanner = new Scanner(System.in);      

        System.out.println("JUEGO DE ADIVINANZA"); 
        System.out.println("Selecciona la dificultad:");
        System.out.println("1. Facil (1-50, 10 intentos)");
        System.out.println("2. Normal (1-100, 7 intentos)");
        System.out.println("3. Dificil (1-200, 8 intentos)");
        System.out.print("Opcion: ");
        opcion = scanner.nextInt();

        if (opcion == 1) {
            numeroMaximo = 50;
            intentosMaximos = 10;
        } else if (opcion == 2) {
            numeroMaximo = 100;
            intentosMaximos = 7;
        } else if (opcion == 3) {
            numeroMaximo = 200;
            intentosMaximos = 8;
        } else {
            System.out.println("Opcion no valida, usando dificultad Normal.");
            numeroMaximo = 100;
            intentosMaximos = 7;
        }

        numeroSecreto = (int)(Math.random() * numeroMaximo) + 1;
        intentos = 0;

        System.out.println("Adivina el numero entre 1 y" + numeroMaximo);


        while ((intentos < maxIntentos) && (!adivinado)) {

            System.out.println("Intento " + (intentos + 1) + " de " + maxIntentos);
            System.out.println("1. Adivinar numero");
            System.out.println("2. Pedir pista");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();

            if (opcion == 2) {

                if (numeroSecreto % 2 == 0) {
                    System.out.println("PISTA: El numero es PAR");
                } else {
                    System.out.println("PISTA: El numero es IMPAR");
                }

            } else if (opcion == 1) {

                System.out.print("Ingrese un numero: ");
                numero = entrada.nextInt();
                intentos++;

                if (numero == numeroSecreto) {
                    adivinado = true;
                    System.out.println("¡Felicidades! Adivinaste el numero.");
                } else if (numero < numeroSecreto) {
                    System.out.println("El numero secreto es MAYOR.");
                } else {
                    System.out.println("El numero secreto es MENOR.");
                }

            } else {
                System.out.println("Opcion invalida.");
            }

        }

        if (!adivinado) {
            System.out.println();
            System.out.println("¡Se acabaron los intentos!");
            System.out.println("El numero era: " + ns);
        }

        System.out.println(); 
        System.out.println("Historial de Intentos");
        for (int k = 0; k < idx; k++) {
            System.out.println((k + 1) + ". " + histN[k] + " -> " + histP[k]);
        }
        if (idx == 0) {
            System.out.println("(No hubo intentos)");
        }

        System.out.println(); 
        System.out.println("Fin del juego");
        sc.close();
    }
}
