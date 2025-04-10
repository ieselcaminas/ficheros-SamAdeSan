package Ejercicios.Ejercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        File f = File.listRoots()[0];
        while (opcion != -1){
            int contador = 0;
            System.out.println("Ingrese una opción: ");
            System.out.println("0 - Directorio Padre.");
            for (File file : f.listFiles()) {
                System.out.println(contador++ + " - " + file.getName());
            }
            System.out.println("Introduzca - para salir.");
            opcion = sc.nextInt();
        }
    }
}
