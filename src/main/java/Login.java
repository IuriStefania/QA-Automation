import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends Configuracion {

    private static By user = By.cssSelector("div[class*='Xb9hP'] input[type*='email']");
    private static By pass = By.cssSelector("div[class*='Xb9hP'] input[type*='password']");
    private static By buttonSigMail = By.cssSelector("div[id*='identifierNext']");
    private static By buttonSigPass = By.cssSelector("div[id*='passwordNext']");

    private static By userIcon = By.cssSelector("a[href*='https://accounts.google.com/SignOutOptions?hl=en&continue=https://mail.google.com/mail/&service=mail&ec=GBRAFw']");
    private static By msjPassword = By.cssSelector("div[class*='Ly8vae uSvLId']");


    public Login(ChromeDriver driver){
        super(driver);
    }

    public void loguearUsuario(String mail, String contrasena) throws Exception {
        try{
            //ingresa el usuario
            WebElement usuario = _driver.findElement(user);
            usuario.click();
            usuario.sendKeys(mail);
            Thread.sleep(3000);

            //presiona el boton siguiente
            WebElement buttonMail = _driver.findElement(buttonSigMail);
            buttonMail.click();
            Thread.sleep(3000);

            //ingresa la contraseña
            WebElement password = _driver.findElement(pass);
            password.click();
            password.sendKeys(contrasena);
            Thread.sleep(3000);

            //presiona el boton siguiente
            WebElement buttonPass = _driver.findElement(buttonSigPass);
            buttonPass.click();
            Thread.sleep(3000);

        } catch(Exception e){
            throw new Exception("Hubo un error al loguearse. " + e.getMessage());
        }
    }

    //Verifica que se encuentre en la pantalla correcta
    public boolean verificarPantallaIngreso() throws Exception {
        try{
            //Esto indica ue se inicio sesion correctamente, esta presente la foto de perfil
            boolean estadoElemento = _driver.findElement(userIcon).isDisplayed();
            if(estadoElemento){
                return true;
            }
            return false;

        }
        catch(Exception e){
            //esto indica que la contraseña es incorrecta
            boolean wrong = _driver.findElement(msjPassword).isDisplayed();
            if (wrong){
                return false;
            }
            return true;
        }
    }
}
