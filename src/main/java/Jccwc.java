package com.mariandotg.exercises;

public class Jccwc {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Verifica que se hayan pasado al menos dos argumentos
        if (args.length >= 2) {
            System.out.println(args[0] + " " + args[1]);
        } else {
            System.out.println("Por favor, proporciona al menos dos argumentos.");
        }
    }
}
