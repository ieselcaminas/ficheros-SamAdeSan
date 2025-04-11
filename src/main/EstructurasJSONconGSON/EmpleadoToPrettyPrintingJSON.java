package EstructurasJSONconGSON;

import com.google.gson.GsonBuilder;
import static java.lang.System.out;

public class EmpleadoToPrettyPrintingJSON {
    public static void main(String[] args) {
        out.println(
                new GsonBuilder().setPrettyPrinting().create()
                .toJson(
                        new Empleado(1, "Samuel", 10, 18, 1200.00)
                )
        );
    }
}
