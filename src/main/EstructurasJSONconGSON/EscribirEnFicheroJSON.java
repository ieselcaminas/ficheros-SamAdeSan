package EstructurasJSONconGSON;

import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.List;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class EscribirEnFicheroJSON {

	public static void main(String[] args) throws IOException{
		final String empleado1JSON = "{" +
				"\"num\": 1,\n" +
				"\"nombre\": \"Samuel\",\n" +
				"\"departamento\": 10,\n" +
				"\"edad\": 19,\n" +
				"\"sueldo\": 1500.00" +
				"}";
		final String empleado2JSON = "{" +
				"\"num\": 2,\n" +
				"\"nombre\": \"Juan Antonio\",\n" +
				"\"departamento\": 20,\n" +
				"\"edad\": 19,\n" +
				"\"sueldo\": 1200.00\n" +
				"}";
		final String empleadosJSON = "[" + empleado1JSON + "," + empleado2JSON + "]";
		final Gson gson = new Gson();
		final Type tipoListaEmpleados = new TypeToken<List<Empleado>>(){}.getType();
		final List<Empleado> empleados = gson.fromJson(empleadosJSON, tipoListaEmpleados);
		final Writer w_json = new FileWriter("../empleados.json");

		final String repJSON = gson.toJson(empleados);

		w_json.write(repJSON);

		w_json.close();

		System.out.println(repJSON);
	}
}
