#language:pt
#enconding: UTF-8
@Formulariodesafio
Funcionalidade: formularios do desafio accenture

  Cenario: Aparecimento da mensagem de email enviado com sucesso

    Dado que eu esteja na pagina "http://sampleapp.tricentis.com/101/app.php"
    Quando preencher os formularios de cotacao de sguro de forma correta
    Então Uma mensagem de "Sending e-mail success!" deve aparecer na tela no final do preenchimento