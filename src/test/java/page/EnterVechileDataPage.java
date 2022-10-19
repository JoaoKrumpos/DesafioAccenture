package page;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import runner.RunTests;

public class EnterVechileDataPage extends RunTests {


    /*construção dos elementos da pagina Vechile data*/
    private String URL = "http://sampleapp.tricentis.com/101/app.php";
    private By Make_Bmw = By.cssSelector("#make > option:nth-child(3)");
    private By Model_Motorcycle = By.cssSelector("#model > option:nth-child(5)");
    private By Cylinder_Capacity = By.name("Cylinder Capacity");
    private By Engine_Performance_kW = By.name("[kW]");
    private By Date_of_Manufacture = By.name("Date of Manufacture");
    private By Number_Of_Seats = By.cssSelector("#numberofseats > option:nth-child(3)");
    private By Right_Hand_Drive = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span");
    private By Number_Of_Seats_Motorcycle = By.cssSelector("#numberofseatsmotorcycle > option:nth-child(3)");
    private By Fuel_Type = By.cssSelector("#fuel > option:nth-child(5)");
    private By Payload = By.name("Payload");
    private By Total_Weight = By.name("Total Weight");
    private By List_Price = By.name("List Price");
    private By License_Plate_Number = By.name("License Plate Number");
    private By Annual_Mileage = By.name("Annual Mileage");
    private By Botao_Next_Enter_Vechile_Data = By.name("Next (Enter Insurant Data)");

/*metodo para acessar a url e escolher o navegador entre o chrome e firefox*/
    public void AcessarPagina() {
        iniciaDriver("firefox");
        getDriver().get(URL);


    }
/* metodo para preencher o formulario VechileData*/
    public void PreencherFormularioEnterVechileData() {
        getDriver().findElement(Make_Bmw).click();
        getDriver().findElement(Model_Motorcycle).click();
        getDriver().findElement(Cylinder_Capacity).sendKeys("1200");            /*capacidade entre 1 e 2.000*/
        getDriver().findElement(Engine_Performance_kW).sendKeys("1000");        /* dever ser numeros entre 1 e 2.000*/
        getDriver().findElement(Date_of_Manufacture).sendKeys("10/08/2022");     /*não pode se uma data futura ou de hoje*/
        getDriver().findElement(Number_Of_Seats).click();
        getDriver().findElement(Right_Hand_Drive).click();
        getDriver().findElement(Number_Of_Seats_Motorcycle).click();
        getDriver().findElement(Fuel_Type).click();
        getDriver().findElement(Payload).sendKeys("700");                          /* numero entre 1 e 1.000*/
        getDriver().findElement(Total_Weight).sendKeys("20000");                    /*peso entre 100 e 50.000*/
        getDriver().findElement(List_Price).sendKeys("10000");                      /*de 50 a 100.000*/
        getDriver().findElement(License_Plate_Number).sendKeys("ijk4636");           /*limite maximo da placa 10 caracteres*/
        getDriver().findElement(Annual_Mileage).sendKeys("500");                      /* numero entre 10 e 100.000*/


    }
/* metodo para clicar no botao next da pagina Vechile*/
    public void ClicarNoBotaoNext() {
        getDriver().findElement(Botao_Next_Enter_Vechile_Data).click();


    }
/* metodo que verufica se a pagina Vechile foi carregada*/
    public boolean VerificaOCarregamentoDaVechile() {

        if (getDriver().findElement(Botao_Next_Enter_Vechile_Data).isDisplayed()) {
            return true;
        } else

            return false;


    }
    }
