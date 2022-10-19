package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunTests;

public class EnterInsurantDataPage extends RunTests {
/* construção dos elementos da Insurant Data*/
    private By First_Name = By.name("First Name");
    private By Last_Name = By.name("Last Name");
    private By Dat_Of_Birth = By.name("Date of Birth");
    private By Gender = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
    private By Street_Address = By.name("Street Address");
    private By Country = By.cssSelector("#country > option:nth-child(32)");
    private By Zip_Code = By.name("Zip Code");
    private By City = By.name("City");
    private By Ocupation = By.cssSelector("#occupation > option:nth-child(3)");
    private By Hobbies = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[3]");
    private By WebSite = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[3]");
    private By Botao_Next_EnterInsurant_Data = By.name("Next (Enter Product Data)");

/* metodo para seleção dos campos e enviar dados esperados pelos campos*/
    public void PreencherFormularioInsurantData() {

        getDriver().findElement(First_Name).sendKeys("joao");     /* não pode conter caracteres numericos */
        getDriver().findElement(Last_Name).sendKeys("Krumpos");    /* não pode conter caracteres numericos */
        getDriver().findElement(Dat_Of_Birth).sendKeys("10/08/2002");    /*idade 18e 70 anos */
        getDriver().findElement(Gender).click();
        getDriver().findElement(Street_Address).sendKeys("Av Paulista, 362");
        getDriver().findElement(Country).click();
        getDriver().findElement(Zip_Code).sendKeys("06330140");          /*apenas caracteres numericos */
        getDriver().findElement(City).sendKeys("são paulo");
        getDriver().findElement(Ocupation).click();
        getDriver().findElement(Hobbies).click();
        getDriver().findElement(WebSite).sendKeys("https://www.accenture.com/br-pt");


    }
/*metodo para clicar no botão next da Enter insurant*/
    public void ClicarNoBotaoNext() {
        getDriver().findElement(Botao_Next_EnterInsurant_Data).click();


    }
/* verifica se a pagina foi carregada */
    public boolean VerificaOCarregamentoInsurant() {

        if (getDriver().findElement(Botao_Next_EnterInsurant_Data).isDisplayed()) {
            return true;

        } else
            return false;

    }

}
