package EstructurasJSONconGSON;

import com.google.gson.Gson;

public class JSONenObjeto {
    public static void main(String[] args) {
        final String json = "{" +
                "\"num\":1,\n" + "  " +
                "\"nombre\": \"Samuel\",\n" + "  " +
                "\"departamento\": 10,\n" + "  " +
                "\"edad\": 32,\n" + "  " +
                "\"sueldo\": 1000.0}";
        final Gson gson = new Gson();
        final Empleado empleado = gson.fromJson(json, Empleado.class);
        empleado.display();
    }
}
