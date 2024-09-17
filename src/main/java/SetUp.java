import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SetUp {

    public ChromeDriver _driver = new ChromeDriver();

    //Inicializa el driver
    @BeforeTest
    public void setUp() throws Exception{
        try{
            _driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromeDriver/chromedriver.exe");
            _driver.manage().window().maximize();
        }
        catch (Exception e){
            System.out.println("Hubo un problema al inicializar el driver. " + e.getMessage());
        }
    }

    //Cierra el driver
   @AfterTest
    public void closeDriver() throws Exception{
        try{
            _driver.quit();
        }
        catch (Exception e){
            System.out.println("Hubo un problema al cerrar el driver. " + e.getMessage());
        }
    }
}
