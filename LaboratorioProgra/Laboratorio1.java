// Universidad del Valle de Guatemala
//Nombre: María José Yee Vidal      Carnet: 231193
//Materia: Programación Orientada a Objetos     Sección: 11
//Fecha: (07:20) 04/08/2023  —  (11:40) 06/08/2023
// Descripción: intento de un programa inspirado del juego PIG
// Recursos utilizados: https://youtube.com/playlist?list=PLQ6XF9VLkn722up31DKabzE3jE8ae9mn1

import java.util.Scanner;
import java.util.Random;

public class opciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String turno = "";
        // while (!turno.equals("1") && !turno.equals("2")) {
        // System.out.println("Si desea lanzar el dado ingrese: 1; si desea saltar
        // turno, ingrese: 2. ");
        // turno = scanner.nextLine();
        // }

    }}

    System.out.println("REGLAS. En cada turno, cada jugardor tira el dado hasta que saca un 1 o el jugador decide plantarse. Si saca un 1, el jugardor pierde los puntos conseguidos y tira el turno pasa al siguiente jugador. Si el jugador decide plantarse, suma a su marcador todos los puntos que ha consiguido con el dad en ese turno.");

    String p1 = player1;
    String p2 = player2;
    int puntaje1 = score1.get(p1);
    int puntaje2 = score2.get(p2);
    Random rand = new Random();

    while(puntaje1<100&&puntaje2<100);System.out.println("Turno de: "+p1+". Puntaje: "+puntaje1);System.out.println();

    do
    {
        System.out.println("Si desea lanzar el dado ingrese: 1; si desea saltar turno, ingrese: 2.");
        turno = scanner.next().charAt(0);
    }while(!turno.equals("1")&&!turno.equals("2"));

    if(turno==1){
        dado1=rand.nextInt(6);
        dado2=rand.nextInt(6);

        System.out.println("Valor del dado 1: "+ dado1);
        System.out.println("Valor del dado 2: "+ dado2);

        if(dado1==1||dado2==1){
            puntaje1 = puntaje1 * 0
            }
        else{
            puntaje1 = puntaje1 + dado1 + dado2
        }
    }

    if(turno==2){
        System.out.println("Turno de: " + p2 + ". Puntaje: " + puntaje2);
        System.out.println();

        dado1=rand.nextInt(6);
        dado2=rand.nextInt(6);

        System.out.println("Valor del dado 1: "+ dado1);
        System.out.println("Valor del dado 2: "+ dado2);

        if(dado1==1||dado2==1){
            puntaje2 = puntaje2 * 0
            }
        else{
            puntaje2 = puntaje2 + dado1 + dado2
        }
    }

// Nota1. No me permite probar el código por un error de compilación, muy
// probablemente no funcione D: