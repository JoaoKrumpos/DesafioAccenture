package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import runner.RunTests;

public class SelectPriceOptionPage extends RunTests {
    /* construção dos elementos Price Option*/
    private By PriceUltimate = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span");
    private By ValidacaoAlertPrice = By.xpath("#selectpriceoption");
    private By NextSendQuota = By.id("nextsendquote");

    /* metodo que espera o select box carregar para clicar*/
    public void SelectPriceOption() {


        wait.until(ExpectedConditions.elementToBeClickable(PriceUltimate)).click();/*seleionada apenas 1*/


    }


    /* metodo que espera o carregamento do botão next para clicar*/
    public void ClicarNoBotaoNext() {
        // getDriver().findElement(NextSendQuota).click();
        wait.until(ExpectedConditions.elementToBeClickable(NextSendQuota)).click();


    }


}
