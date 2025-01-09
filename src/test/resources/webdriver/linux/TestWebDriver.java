import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriver {

    public static void main(String[] args) {
        // Configura el path del chromedriver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Inicializa el WebDriver para Chrome
        WebDriver driver = new ChromeDriver();

        // Abre una página web
        driver.get("https://www.google.com");

        // Verifica el título de la página para asegurarse de que WebDriver se ha inicializado correctamente
        System.out.println("Título de la página: " + driver.getTitle());

        // Cierra el navegador
        driver.quit();
    }
}
