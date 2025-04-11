package EstructurasJSONconGSON;

import com.google.gson.Gson;

import java.util.Properties;

public class JSONenProperties {
    public static void main(String[] args) {
        final String json = "{" +
                "\"num\":1,\n" + "  " +
                "\"nombre\": \"Samuel\",\n" + "  " +
                "\"departamento\": 10,\n" + "  " +
                "\"edad\": 32,\n" + "  " +
                "\"sueldo\": 1000.0}";
        final Gson gson = new Gson();
        final Properties prop = gson.fromJson(json, Properties.class);
        System.out.println(
                prop.getProperty("num") + "\n" +
                prop.getProperty("nombre") + "\n" +
                prop.getProperty("departamento")  + "\n" +
                prop.getProperty("edad")  + "\n" +
                prop.getProperty("sueldo")
        );
    }
}
