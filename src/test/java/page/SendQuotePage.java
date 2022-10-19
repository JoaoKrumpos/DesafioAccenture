package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import runner.RunTests;

public class SendQuotePage extends RunTests {

    /* construção dos elementos da Sendquote*/
    private By Email = By.name("E-Mail");
    private By Phone = By.name("Phone");
    private By Username = By.name("Username");
    private By Password = By.name("Password");
    private By Confirm_Password = By.name("Confirm Password");
    private By BotaoSendEmail = By.name("Send E-Mail");
    private By MensageAlertConfirm = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");
    private By Validandopagina = By.xpath ("/html/head/link[7]/html/head/link[7]");

/* seleciona os campos drop e envia os dados esperados*/
    public void PreencherFormularioSendQuotePage() {
        getDriver().findElement(Email).sendKeys("joaok@hotmail.com");
        getDriver().findElement(Phone).sendKeys("05511958111473");
        getDriver().findElement(Username).sendKeys("joaok");
        getDriver().findElement(Password).sendKeys("DeuseFiel2022");
        getDriver().findElement(Confirm_Password).sendKeys("DeuseFiel2022");
        //driver.findElement(By.cssSelector("//*[@id=xLoaderQuote]/p"))

    }
/* metodo para clicar no botão next */
    public void ClicarNoBotaoSend() {
        getDriver().findElement(BotaoSendEmail).click();


    }
/* pega a mensagem de validação "sendin email" para validação*/
    public String MensagemDeConfirmacao() {
        return getDriver().findElement(MensageAlertConfirm).getText();

    }
/* verifica se a pagina carregou*/


}
