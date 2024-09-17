import io.restassured.path.json.JsonPath;
import java.io.File;

/**
 * Esta clase lo que hace es obtener los parametros de datos.json
 */

public class Datos {
    public JsonPath datos;

    public Datos() {
        datos = new JsonPath(new File("resource/datos.json"));
    }

    //Obtiene los datos del json dependiendo del parametro y la posicion que se le pase
    public String getDatos(String parametro,String dato, int posicion) {
        String salida = datos.get(parametro+"["+posicion+"]."+dato);
        return salida;
    }
}
