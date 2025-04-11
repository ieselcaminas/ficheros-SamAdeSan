package TeoriaT7;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
/**
 * La clase {@code Ejemplo4} permite al usuario introducir un directorio y luego muestra
 * los ficheros y subdirectorios dentro de él. No se imprimen los ficheros o directorios
 * ocultos.
 *
 * <p>Este ejemplo utiliza métodos para leer la entrada del usuario, verificar si el directorio
 * existe y luego mostrar el contenido del directorio. También maneja excepciones en caso de
 * que el directorio no exista.</p>
 *
 * @author Samu
 * @
 */
public class Ejemplo4 {
    /**
     * Solicita al usuario que introduzca el nombre de un fichero o directorio desde la consola.
     *
     * <p>Este método lee una línea de la entrada estándar (consola) y devuelve el valor introducido.</p>
     *
     * @return El nombre del fichero o directorio introducido por el usuario.
     * @throws IOException Si ocurre un error al leer la entrada del usuario.
     */
    private static String nombreDeFichero() throws IOException {
        String fichero = new BufferedReader(new InputStreamReader(System.in)).readLine();
        return fichero;
        // También se puede simplificar con: return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
    /**
     * Imprime el nombre y tamaño de un fichero o indica si es un directorio.
     *
     * <p>Este método verifica si el fichero o directorio es visible (no oculto) antes de imprimir
     * su información. Si es un fichero, se muestra su nombre junto con su tamaño. Si es un directorio,
     * se indica que es un directorio.</p>
     *
     * @param e El objeto {@code File} que se quiere imprimir.
     */
    private static void imprimirFichero(File e) {
        // No imprime los ficheros/directorios ocultos
        if (!e.isHidden()) {
            if (e.isFile()) {
                System.out.println(e.getName() + " " + e.length());
            }
            if (e.isDirectory()) {
                System.out.println(e.getName() + " <Directorio>");
            }
        }
    }

    /**
     * Muestra la lista de ficheros y directorios contenidos dentro de un directorio.
     *
     * <p>Este método recibe un directorio como parámetro, verifica si existe y si es un directorio,
     * y luego imprime la lista de ficheros y subdirectorios. Si el directorio no existe o no es un directorio,
     * se muestra un mensaje de error.</p>
     *
     * @param f El objeto {@code File} que representa el directorio a explorar.
     * @throws IOException Si ocurre un error al obtener la ruta canónica del directorio.
     */
    private static void imprimirDirectorio(File f) throws IOException {
        if (f.exists()) {
            if (f.isDirectory()) {
                System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());
                System.out.println("---------------------------------------------------");
                for (File e : Objects.requireNonNull(f.listFiles())) { // También se puede hacer uso de f.listFiles()
                    imprimirFichero(e);
                }
            } else {
                System.out.println("No es un directorio");
            }
        } else {
            System.out.println("No existe el directorio");
        }
    }

    /**
     * Método principal que ejecuta el programa.
     *
     * <p>Este método solicita al usuario un directorio y luego imprime la lista de ficheros y subdirectorios
     * dentro de él, utilizando los métodos auxiliares {@link #nombreDeFichero()} y {@link #imprimirDirectorio(File)}.</p>
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     * @throws IOException Si ocurre un error al leer desde la consola o al obtener la ruta canónica de un directorio.
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Introduce un directorio:");

        // Solicita al usuario el nombre del directorio
        String ent = nombreDeFichero();

        File f = new File(ent);
        try {
            imprimirDirectorio(f);
        } catch (IOException e) {
            System.out.println("No existe el directorio");
        }
    }
}
