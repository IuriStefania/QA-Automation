import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuracion {

    public WebDriver _driver;
    private Datos datos;

    public Configuracion(ChromeDriver driver){
        _driver =  driver;
        datos = new Datos();
    }

    //carga la pagina de gmail en el navegador
    public void ingresarGmail(){
        _driver.get(datos.getDatos("Gmail","pageGmail",0));
    }

    //carga la pagina de ebay en el navegador
    public void ingresarEbay(){
        _driver.get(datos.getDatos("Ebay","pageEbay",0));
    }
}
