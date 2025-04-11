package EstructurasJSONconGSON;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JSONListaDeObjetos_Empleados {
    public static void main(String[] args) {
        final String emp1 =
                "\"num\": 1,\n" +
                "    \"nombre\": \"Samuel\",\n" +
                "    \"departamento\": 10,\n" +
                "    \"edad\": 19,\n" +
                "    \"sueldo\": 1500.00";
        final String emp2 =
                "\"num\": 2,\n" +
                "    \"nombre\": \"Juan Antonio\",\n" +
                "    \"departamento\": 20,\n" +
                "    \"edad\": 19,\n" +
                "    \"sueldo\": 1200.00";
        final String empleadosJSONc = "[" + emp1 + "," + emp2 + "]";
        final Gson gson = new Gson();
        final Type listType = new TypeToken<ArrayList<Empleado>>(){}.getType();
        final List<Empleado> empleados = gson.fromJson(empleadosJSONc, listType);
        for (Empleado emp : empleados){
            emp.display();
        }
    }
}
