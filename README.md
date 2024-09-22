# HelloCep
> Desenvolvimento Web II
> > Algoritmo de consulta CEP via API ViaCep
> > > Utilizando Eclipse IDE

- **Método ReplaceAll:** Parâmetros `regex` (que busca por espaços e hífens) e `replacement` (substitui os espaços e hífens por uma string vazia).
  - O `ReplaceAll` não altera a string (strings em java são imutáveis), a substituição acontece em uma nova string retornada.
- **Construção de Variável:** Construímos uma variável string `url` onde atribuímos um valor que resulta da concatenação do valor da variável `cep` com duas partes da URL.
- **Client HTTP:** Criação de objeto `HttpCliente` chamado `client`, usado para enviar requisição HTTP (chamadas a serviço web).
- **Request HTTP:** Criação de objeto `HttpRequest` chamado `req` utilizando método `newBuilder` (cria novo `construtor`), passando a URI construída como parâmetro, o método `build()` torna a requisição imutável.
- **Response HTTP:** Objeto `HttpResponse<string>` chamado `res` onde armazena a resposta da requisição `req` enviada por meio do HTTP `client`, o método `send` é responsável por executar a requisição.
- **Método BodyHandlers.ofString():** Função da classe BodyHandlers que faz parte do pacote HTTP, método estático que retorna um manipulador de corpo de resposta `HttpResponse.BodyHandler` convertendo o corpo da resposta em string, 
