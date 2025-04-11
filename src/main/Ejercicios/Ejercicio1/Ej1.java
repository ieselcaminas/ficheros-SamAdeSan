package Ejercicios.Ejercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        File f = File.listRoots()[0];
        while (opcion != -1){
            int contador = 0;

            System.out.println("0 - Directorio Padre.");
            for (File file : Objects.requireNonNull(f.listFiles())) {
                System.out.println(contador++ + " - " + file.getName());
            }
            System.out.println("Ingrese una opción: " + "\n\tIntroduzca [-1] para salir.:" +
                    "\n→\t");
            opcion = sc.nextInt();
            try {
                if (Objects.requireNonNull(f.listFiles())[opcion - 1].canRead()) {
                    f = Objects.requireNonNull(f.listFiles())[opcion - 1];
                } else {
                    System.out.println("No se puede leer el archivo/directorio. No tienes permisos de lectura del archivo/directorio.");
                    sc.nextLine();
                    sc.nextLine();
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("No es válido el carácter introducido.\nIntroduzca un número válido.\n\t Pulse [Enter] para continuar.");
                sc.nextLine();
                sc.nextLine();
            }
        }
    }
}
