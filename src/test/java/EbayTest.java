import org.testng.annotations.Test;

public class EbayTest extends SetUp{

    @Test
    public void precioArticulo() throws Exception {
        Datos datos = new Datos();

        String parametro = "Ebay";
        int posicion = 0;
        String articulo = datos.getDatos(parametro,"search", posicion);

        Ebay ebay = new Ebay(_driver);

        System.out.println("--- Inicio Test Ebay ----");

        //Ingresa a la pagina web
        ebay.ingresarEbay();

        //Busca un articulo para comprar
        ebay.buscarArticulo(articulo);

        //Obtiene el precio del articulo
        String precio = ebay.obtenerPrecio();

        //Ingresa al primero que encuentra
        ebay.abrirArticulo();

        System.out.println("El precio del articulo es: " + precio);

        System.out.println("--- Fin Test Ebay ----");

    }
}
