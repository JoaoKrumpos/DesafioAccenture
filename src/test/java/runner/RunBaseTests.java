package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RunBaseTests {



    /*configuração do driver */

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getDriver() {

        return driver;

    }

    /*metodo que inicia os navegadores chrome ou firefox */
    public static WebDriver iniciaDriver(String browser) {


        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                wait = new WebDriverWait(driver, 15);
                break;
            case "firefox":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                break;
            default:
                throw new IllegalArgumentException("Navegador não encontrado. Informe um navegador valido");


        }
        return driver;

    }
}