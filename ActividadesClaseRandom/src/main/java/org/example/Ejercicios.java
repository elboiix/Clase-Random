package org.example;
import java.util.Random;
import java.util.Scanner;
public class Ejercicios {
    public void Ejercicio1(){

        Scanner entrada = new Scanner(System.in);
        Random Aleatorio = new Random();

        int dado1, dado2, suma;

        dado1 = Aleatorio.nextInt(6) + 1;

        System.out.println("Dado 1: " + dado1);

        dado2 = Aleatorio.nextInt(6) + 1;

        System.out.println("Dado 2: " + dado2);

        suma = dado1 + dado2;

        System.out.println("Suma: " + suma);

    }
    public void Ejercicio2(){

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        String contraseña = "", CaracterString, caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int NumCaracter;

        for(int i = 0; i < 12; i++){

            NumCaracter = aleatorio.nextInt(61);
            char Caracter = caracteres.charAt(NumCaracter);
            CaracterString = Character.toString(Caracter);

            contraseña += CaracterString;

        }
        System.out.println("Contraseña = " + contraseña);

    }
    public void Ejercicio3(){

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int min, max, cantidad, num;
        String lista = "";

        System.out.println("Introduce el rango minimo:");
        min = entrada.nextInt();

        while(true){
            System.out.println("Introduce el rango maximo:");
            max = entrada.nextInt();

            if (max > min){
                break;
            }else{
                System.out.println("Error al introducir el rango maximo, vuelve a intentarlo...");
            }
        }

        System.out.println("Introduce la cantidad de números aleatorios:");
        cantidad = entrada.nextInt();

        for(int i = 0; i < cantidad; i++){

            num = aleatorio.nextInt(max - min + 1) + min;

            lista = lista + num + " ";
        }
        System.out.println("Numeros generados: " + lista);

    }
    public void Ejercicio4(){

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        String contraseña = "", CaracterString, caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int NumCaracter, num_caracteres;

        num_caracteres = aleatorio.nextInt(8 - 6 + 1) + 6;

        for(int i = 0; i < num_caracteres; i++){

            NumCaracter = aleatorio.nextInt(61);
            char Caracter = caracteres.charAt(NumCaracter);
            CaracterString = Character.toString(Caracter);

            contraseña += CaracterString;

        }
        System.out.println("Contraseña = " + contraseña);

    }
}
