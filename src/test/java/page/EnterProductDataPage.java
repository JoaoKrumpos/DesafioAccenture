package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunTests;

public class EnterProductDataPage extends RunTests {

/*construção dos elementos Enter Product Page */
    private By StartDate = By.name("Start Date");
    private By Insurancesum = By.cssSelector("#insurancesum > option:nth-child(3)");
    private By MeritRating = By.cssSelector("#meritrating > option:nth-child(18)");
    private By DamageInsurance = By.cssSelector("#damageinsurance > option:nth-child(3)");
    private By OptionalProducts = By.cssSelector("section:nth-of-type(3)  p > label:nth-of-type(2) > .ideal-check");
    private By CourtesyCar = By.cssSelector("#courtesycar > option:nth-child(2)");
    private By Botao_Next_Product_Data = By.name("Next (Select Price Option)");


    public void PreencherFormularioEnterProductData() {
        getDriver().findElement(StartDate).sendKeys("10/08/2030");/* deve conter pelo menos 1 mes da data atual*/
        getDriver().findElement(Insurancesum).click();
        getDriver().findElement(MeritRating).click();
        getDriver().findElement(DamageInsurance).click();
        getDriver().findElement(OptionalProducts).click();
        getDriver().findElement(CourtesyCar).click();


    }
/*metodo para clicar no botão nex Product Page*/
    public void ClicarNoBotaoNext() {
        getDriver().findElement(Botao_Next_Product_Data).click();


    }
/* verifica se a pagina foi carregada*/
    public boolean VerificaOCarregamentoDaProduct() {

        if (getDriver().findElement(Botao_Next_Product_Data).isDisplayed()) {
            return true;

        } else
            return false;
    }
}
