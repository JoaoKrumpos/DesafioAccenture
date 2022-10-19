$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/DesafioAccenture.feature");
formatter.feature({
  "name": "formularios do desafio accenture",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Formulariodesafio"
    }
  ]
});
formatter.scenario({
  "name": "Aparecimento da mensagem de email enviado com sucesso",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Formulariodesafio"
    }
  ]
});
formatter.step({
  "name": "que eu esteja na pagina \"http://sampleapp.tricentis.com/101/app.php\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "DesafioSteps.que_eu_esteja_na_pagina(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher os formularios de cotacao de sguro de forma correta",
  "keyword": "Quando "
});
formatter.match({
  "location": "DesafioSteps.preencher_os_formularios_de_cotacao_de_sguro_de_forma_correta()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: Element \u003clabel class\u003d\"ideal-radiocheck-label\"\u003e is not reachable by keyboard\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LP1389\u0027, ip: \u0027192.168.138.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_311\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 102.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20220705093820, moz:geckodriverVersion: 0.32.0, moz:headless: false, moz:processID: 16140, moz:profile: C:\\Users\\JOAO~1.KRU\\AppData..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, moz:windowless: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 6e5ddcb8-5ac5-49c5-8672-34080f22a15e\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat page.EnterInsurantDataPage.PreencherFormularioInsurantData(EnterInsurantDataPage.java:35)\r\n\tat steps.DesafioSteps.preencher_os_formularios_de_cotacao_de_sguro_de_forma_correta(DesafioSteps.java:54)\r\n\tat ✽.preencher os formularios de cotacao de sguro de forma correta(src/test/resources/features/DesafioAccenture.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Uma mensagem de \"Sending e-mail success!\" deve aparecer na tela no final do preenchimento",
  "keyword": "Então "
});
formatter.match({
  "location": "DesafioSteps.uma_mensagem_de_deve_aparecer_na_tela_no_final_do_preenchimento(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});