package EstructurasJSONconGSON.APIJSON;
import com.google.gson.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeerAPI {

    public static void main (String[] args)  throws IOException{
        final Gson gson = new Gson();
        final InputStream f = Files.newInputStream(Paths.get("../json/empleados.json"));
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f));
        bufferedReader.close();
    }
}
