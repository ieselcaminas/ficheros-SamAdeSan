package EstructurasJSONconGSON;

import com.google.gson.Gson;

public class EmpleadoToJSON {
    public static void main(String[] args) {
        Empleado e = new Empleado(1, "Samuel", 10, 18, 1200.00);
        final Gson gson = new Gson();
        final String repJSON = gson.toJson(e);
        System.out.println(repJSON);
    }
}
