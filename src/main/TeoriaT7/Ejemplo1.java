package TeoriaT7;

import java.io.File;
import java.util.Objects;

/**
 * La clase {@code Ejemplo1} muestra cómo listar los archivos y directorios
 * del directorio actual utilizando la clase {@link File} de Java.
 *
 * <p>El programa imprime por consola todos los nombres de ficheros y carpetas
 * que se encuentran en el directorio desde el cual se está ejecutando la aplicación.</p>
 *
 * <p>Un uso habitual de este ejemplo es familiarizarse con la API de entrada/salida
 * de archivos de Java.</p>
 *
 * @author Samu
 */
public class Ejemplo1 {

	/**
	 * Método principal que ejecuta el programa.
	 *
	 * <p>Este método crea un objeto {@code File} apuntando al directorio actual (".")
	 * y luego lista todos los archivos y subdirectorios dentro de él. Utiliza {@link Objects#requireNonNull(Object)}
	 * para asegurarse de que el listado no sea nulo antes de recorrerlo e imprimir los nombre, pero también se puede
	 * poner {@code f.list()} aunque podría dar un error</p>
	 *
	 * @param args Argumentos de línea de comandos (no utilizados en este ejemplo).
	 */
	public static void main(String[] args) {
		// Abre el directorio actual '.'
		File f = new File(".");

		System.out.println(
				"────────────────────────────────────────────────────────" +
				"| Lista de ficheros y directorios del directorio actual |" +
				"────────────────────────────────────────────────────────"
		);

		// Recorre la lista de ficheros (recordad que un directorio es un tipo especial de fichero)
		for (String e : Objects.requireNonNull(f.list())) {
			System.out.println(e);
		}
	}
}
