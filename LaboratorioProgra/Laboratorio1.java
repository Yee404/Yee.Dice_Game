// Universidad del Valle de Guatemala
//Nombre: María José Yee Vidal      Carnet: 231193
//Materia: Programación Orientada a Objetos     Sección: 11
//Fecha: (07:20) 04/08/2023  —  (11:40) 06/08/2023
// Descripción: intento de un programa inspirado del juego PIG
// Recursos utilizados: https://youtube.com/playlist?list=PLQ6XF9VLkn722up31DKabzE3jE8ae9mn1

import java.util.Scanner;
import java.util.Random;

public class Opciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String turno;
        String p1 = "Jugador 1";
        String p2 = "Jugador 2";
        int puntaje1 = 0;
        int puntaje2 = 0;
        int dado1, dado2;
        Random rand = new Random();

        while (puntaje1 < 100 && puntaje2 < 100) {
            System.out.println("Turno de: " + p1 + ". Puntaje: " + puntaje1);
            System.out.println();

            do {
                System.out.println("Si desea lanzar el dado ingrese: 1; si desea saltar turno, ingrese: 2.");
                turno = scanner.nextLine();
            } while (!turno.equals("1") && !turno.equals("2"));

            if (turno.equals("1")) {
                dado1 = rand.nextInt(6) + 1;
                dado2 = rand.nextInt(6) + 1;

                System.out.println("Valor del dado 1: " + dado1);
                System.out.println("Valor del dado 2: " + dado2);

                if (dado1 == 1 || dado2 == 1) {
                    puntaje1 = puntaje * 0;
                } else {
                    puntaje1 = puntaje1 + dado1 + dado2;
                }
            }

            if (puntaje1 >= 100) {
                break;
            }

            System.out.println("Turno de: " + p2 + ". Puntaje: " + puntaje2);
            System.out.println();

            do {
                System.out.println("Si desea lanzar el dado ingrese: 1; si desea saltar turno, ingrese: 2.");
                turno = scanner.nextLine();
            } while (!turno.equals("1") && !turno.equals("2"));

            if (turno.equals("1")) {
                dado1 = rand.nextInt(6) + 1;
                dado2 = rand.nextInt(6) + 1;

                System.out.println("Valor del dado 1: " + dado1);
                System.out.println("Valor del dado 2: " + dado2);

                if (dado1 == 1 || dado2 == 1) {
                    puntaje2 = puntaje * 0;
                } else {
                    puntaje2 = puntaje2 + dado1 + dado2;
                }
            }
        }

        if (puntaje1 >= 100) {
            System.out.println("Ha ganado el " + p1);
        } else {
            System.out.println("Ha ganado el " + p2);
        }
    }
}

// Nota1. No me permite probar el código por un error de compilación, muy
// probablemente no funcione D: