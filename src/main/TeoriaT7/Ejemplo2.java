package TeoriaT7;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/**
 * La clase {@code Ejemplo2} permite al usuario introducir una ruta de directorio
 * desde consola, y luego muestra todos los ficheros y subdirectorios que contiene.
 *
 * <p>Utiliza la clase {@link File} para acceder al sistema de archivos y
 * {@link BufferedReader} para leer la entrada del usuario desde la consola.</p>
 *
 * <p>Este ejemplo sirve para practicar la lectura desde consola y la exploración de directorios.</p>
 *
 * @author Samu
 */
public class Ejemplo2 {

	/**
	 * Método principal que ejecuta el programa.
	 *
	 * <p>Solicita al usuario que introduzca una ruta de directorio mediante entrada por consola,
	 * y luego muestra por pantalla la lista de ficheros y carpetas contenidos en esa ruta.</p>
	 *
	 * <p>En caso de que la ruta no exista o no se pueda acceder, el método {@code requireNonNull}
	 * lanzará una excepción.</p>
	 *
	 * @param args Argumentos de línea de comandos (no utilizados).
	 * @throws IOException Si ocurre un error al leer desde la consola.
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Introduce un directorio: ");

		// Lee la ruta introducida por el usuario
		String ent = new BufferedReader(new InputStreamReader(System.in)).readLine();
		File f = new File(ent);

		System.out.println(
				"──────────────────────────────────────────────────────────" +
				" Lista de ficheros y directorios del directorio: " + ent +
				"──────────────────────────────────────────────────────────"
		);

		// Recorre la lista de ficheros (si no es nulo) y los imprime
		for (String e : Objects.requireNonNull(f.list())) {
			System.out.println(e);
		}
	}
}
