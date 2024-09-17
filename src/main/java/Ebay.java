import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay extends Configuracion{

    private By barraBusqueda = By.cssSelector("input[type*='text']");
    private By botonBuscar = By.cssSelector("td[class*='gh-td gh-sch-btn'] input");

    private By articulo = By.cssSelector("div[class='srp-river-results clearfix'] li[data-view='mi:1686|iid:1'] div[class='s-item__image-section']");
    private By price = By.xpath("//*[@id='item48b0cdccd8']/div/div[2]/div[3]/div[1]/div[1]/span");


    public Ebay(ChromeDriver driver) {
        super(driver);
    }

    public void buscarArticulo(String elemento) throws Exception {
        try{
            WebElement barra = _driver.findElement(barraBusqueda);
            barra.click();
            barra.sendKeys(elemento);
            Thread.sleep(3000);

            WebElement buscar = _driver.findElement(botonBuscar);
            buscar.click();
        }
        catch (Exception e){
            throw new Exception("Hubo un error al buscar el articulo. " + e.getMessage());
        }

    }

    public void abrirArticulo() throws Exception {
        try{
            WebElement articuloBuscado = _driver.findElement(articulo);
            articuloBuscado.click();
            Thread.sleep(5000);
        }
        catch (Exception e){
            throw new Exception("No se pudo abrir el articulo. " + e.getMessage());
        }
    }

    public String obtenerPrecio() throws Exception {
        try{
            String precio = _driver.findElement(price).getText();
            return precio;
        }
        catch (Exception e){
            throw new Exception("No se pudo obtener el precio del articulo. " + e.getMessage());
        }

    }

}
