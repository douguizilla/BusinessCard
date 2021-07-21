# Business Card

Este aplicativo foi desenvolvido em kotlin para android apenas para fins didáticos através das aulas de um [Bootcamp](https://web.digitalinnovation.one/track/inter-android-developer?tab=path). Sua funcionalidade é criar cartões de visita simples, permitindo que o usuário insira nome, telefone, email, empresa e defina a cor do cartão através de um valor hex (a definição de cor ainda está em andamento, pretendo colocar um seletor de cores para facilitar a escolha do usuário).

Foram utilizados conceitos como:

* MVVM
* Recycler view
* Room Database
* View binding

A tela principal ao iniciar o app pode ser vista abaixo:

![Main](https://github.com/douguizilla/BusinessCard/blob/master/appscreenshots/main.png)

Ao clicar no Float Action Button, será redirecionado para a tela de adição de cartão de visita:

![Add Business Card](https://github.com/douguizilla/BusinessCard/blob/master/appscreenshots/addCard.png)

O usuário deve preencher como no exemplo (com a cor em hexadecimal):

![Filled Add Business Card](https://github.com/douguizilla/BusinessCard/blob/master/appscreenshots/filledAddCard.png)

Ao confirmar, voltará para a tela principal com o cartão adicionado armazenado em memória (persistência) e exibido em tela. Fiz algumas inserções para mostrar como ficará ao adicionar mais de um cartão:

![Filled Main](https://github.com/douguizilla/BusinessCard/blob/master/appscreenshots/filledMain.png)

Ao clicar em um dos cartões uma imagem dele é gerada, salva em memória e, então, é oferecido o compartilhamento do cartão de visita através de apps terceiros:

![Share](https://github.com/douguizilla/BusinessCard/blob/master/appscreenshots/share.png)

Na memória:

![Saved Image](https://github.com/douguizilla/BusinessCard/blob/master/appscreenshots/savedImage.png)

Estou a disposição para novas ideias!

Entre em contato comigo pelo linkedin: [Douglas Gomes](https://www.linkedin.com/in/douglasgomesdepaula/)
