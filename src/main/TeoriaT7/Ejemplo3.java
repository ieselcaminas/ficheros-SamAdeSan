package TeoriaT7;

import java.io.File;
import java.io.IOException;

/**
 * La clase {@code Ejemplo3} muestra las diferentes formas de representar
 * la ruta de un fichero en Java utilizando la clase {@link File}.
 *
 * <p>Este ejemplo es útil para comprender la diferencia entre:
 * <ul>
 *   <li>Nombre del fichero</li>
 *   <li>Ruta relativa</li>
 *   <li>Ruta absoluta</li>
 *   <li>Ruta canónica</li>
 * </ul>
 * La ruta canónica es especialmente importante ya que elimina referencias como {@code ".."} o {@code "."}.
 * </p>
 *
 * <p>En este caso se crea un objeto {@code File} apuntando a un fichero dentro de una carpeta,
 * con una parte de la ruta que retrocede un nivel (`../`).</p>
 *
 * @author Samu
 */
public class Ejemplo3 {

	/**
	 * Método principal que ejecuta el programa.
	 *
	 * <p>Crea un objeto {@code File} con una ruta que incluye una referencia hacia atrás en el sistema de archivos,
	 * y luego muestra por consola:
	 * <ul>
	 *   <li>El nombre del fichero</li>
	 *   <li>La ruta tal como se especificó</li>
	 *   <li>La ruta absoluta desde el sistema operativo</li>
	 *   <li>La ruta canónica que resuelve los elementos relativos como {@code ".."}</li>
	 * </ul>
	 * </p>
	 *
	 * @param args Argumentos de línea de comandos (no utilizados).
	 * @throws IOException Si ocurre un error al obtener la ruta canónica.
	 */
	public static void main(String[] args) throws IOException {
		File f = new File("archivos/../archivos/fichero1.txt");

		System.out.println(
				"Nombre del fichero: " + f.getName() + "\n" +
				"Ruta del fichero: " + f.getPath() + "\n" +
				"Ruta absoluta del fichero: " + f.getAbsolutePath() + "\n" +
				"Ruta canónica del fichero: " + f.getCanonicalPath()
		);
	}
}
