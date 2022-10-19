package steps;


import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;


import org.junit.Assert;
import page.*;
import runner.RunTests;
import support.ScreenshotUtils;


public class DesafioSteps extends RunTests {

    /*Pages instanciadas dos formularios*/
    EnterVechileDataPage enterVechileDataPage = new EnterVechileDataPage();
    EnterInsurantDataPage enterInsurantDataPage = new EnterInsurantDataPage();
    EnterProductDataPage enterProductDataPage = new EnterProductDataPage();
    SelectPriceOptionPage selectPriceOptionPage = new SelectPriceOptionPage();
    SendQuotePage sendQuotePage = new SendQuotePage();


    /* primeiro precisamos abrir o navegador e passar a URL desejada instanciado a page e chamando o método de acesar pagina*/
    @Dado("^que eu esteja na pagina \"([^\"]*)\"$")
    public void que_eu_esteja_na_pagina(String URL) throws Exception {
        enterVechileDataPage.AcessarPagina();
    }

    /* quando a pagina for carregada devemos preencher todos os formularios corretamente como o do veículo , aasegurado
    e produto desejado após selecionada a opção do plano e enviar a cotação por email
     */
    @Quando("preencher os formularios de cotacao de sguro de forma correta")
    public void preencher_os_formularios_de_cotacao_de_sguro_de_forma_correta() {

                            /*Formulario EnterVechileData
        primeiramente verifica se o formulario carregou , em seguida realiza o preenchimento */
        if (enterVechileDataPage.VerificaOCarregamentoDaVechile() == true) {
            enterVechileDataPage.PreencherFormularioEnterVechileData();
            enterVechileDataPage.ClicarNoBotaoNext();
        } else
            throw new PendingException("Formulario Vechile Data não carregou da forma correta");


                             /*Formulario EnterInsurantData
        primeiramente verifica se o formulario carregou , em seguida realiza o preenchimento */
        if (enterInsurantDataPage.VerificaOCarregamentoInsurant() == true) {
            enterInsurantDataPage.PreencherFormularioInsurantData();
            enterInsurantDataPage.ClicarNoBotaoNext();
        } else
            throw new PendingException("Formulario Insurant Data não carregou da forma correta");

                                     /*Formulario ProductData
        primeiramente verifica se o formulario carregou , em seguida realiza o preenchimento*/
        if (enterProductDataPage.VerificaOCarregamentoDaProduct() == true) {
            enterProductDataPage.PreencherFormularioEnterProductData();
            enterProductDataPage.ClicarNoBotaoNext();
        } else
            throw new PendingException("Formulario Product Data não carregou da forma correta");

                                      /*Formulario Price option
        seleciona o preço e clica no botão next */

        selectPriceOptionPage.SelectPriceOption();
        selectPriceOptionPage.ClicarNoBotaoNext();


                                     /*Formulario Sendquote
        primeiramente verifica se o formulario carregou ,em seguida realiza o preenchimento */

        sendQuotePage.PreencherFormularioSendQuotePage();
        sendQuotePage.ClicarNoBotaoSend();




    }

    /*formulario enviado , uma mensagem de confirmação deve surgir na tela */
    @Então("^Uma mensagem de \"([^\"]*)\" deve aparecer na tela no final do preenchimento$")
    public void uma_mensagem_de_deve_aparecer_na_tela_no_final_do_preenchimento(String alertaesperado) {


        SendQuotePage sendQuotePage = new SendQuotePage();
        Assert.assertEquals(alertaesperado, sendQuotePage.MensagemDeConfirmacao());
    }


    /* caso algum cenario falhe desdea primeira etapa um print será tirado e anexado no relatorio di cucumber*/
    @After
    public void takeScreenhot(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenshotUtils.Adicionandscreenshot(scenario);

        }

    }

}