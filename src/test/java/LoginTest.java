import org.testng.annotations.*;

public class LoginTest extends SetUp {

    @Test
    public void LoginTestNegativo() throws Exception {
        Datos datos = new Datos();
        String parametro = "Gmail";
        int posicion = 0;
        String email = datos.getDatos(parametro,"mail",posicion);
        String pass = datos.getDatos(parametro,"passwordWrong",posicion);

        Login login = new Login(_driver);

        System.out.println("");
        System.out.println("--- Inicio Test Login Negativo ----");

        //ingresa a la pagina
        login.ingresarGmail();

        //loguea el usuario
        login.loguearUsuario(email, pass);

        if (login.verificarPantallaIngreso() == true){
            System.out.println("Login EXITOSO");
        }
        else{
            System.out.println("No se realizo el Login, password incorrecta");
        }

        System.out.println("--- Fin Test Login Negativo ----");
        System.out.println("");

    }

    @Test
    public void LoginTestPositivo() throws Exception {
        Datos datos = new Datos();

        String parametro = "Gmail";
        int posicion = 0;
        String email = datos.getDatos(parametro,"mail", posicion);
        String pass = datos.getDatos(parametro,"password", posicion);
        Login login = new Login(_driver);

        System.out.println("--- Inicio Test Login Positivo ----");

        //Ingresa a la pagina de Gmail
        login.ingresarGmail();

        //inicia sesion
        login.loguearUsuario(email, pass);

        //Verifica el inicio de sesion
        if (login.verificarPantallaIngreso() == true) {
            System.out.println("Login EXITOSO");
        } else {
            System.out.println("No se realizo el Login, password incorrecta");
        }

        System.out.println("--- Fin Test Login Positivo ----");
        System.out.println(" ");
    }
}
