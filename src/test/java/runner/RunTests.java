package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;



/*configuração de execução dos cenarios de testes do cucumber*/

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/reports/cucumber" ,"json:target/reports/cucumberj"},
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = "@Formulariodesafio"

)
/* metodo que encerra a execução após todos os cenarios */
public class RunTests extends RunBaseTests {

    @AfterClass
    public static void stop() {
        getDriver().quit();


    }
}
