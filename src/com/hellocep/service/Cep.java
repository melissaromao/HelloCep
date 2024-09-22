//pacote de classe
package com.hellocep.service;

//tratar erros de entrada e saída
import java.io.IOException;
//manipulação de URIs -> string que identifica recurso na internet
import java.net.URI;
//tratar erros de sintaxe de URIs
import java.net.URISyntaxException;
//requisições http
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
//leitura de entradas
import java.util.Scanner;

public class Cep {

	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		System.out.println("------------- Hello World! ----------------");
		System.out.println("| Busca de Código de Endereçamento Postal | ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu CEP:");
        String cep = sc.nextLine();
        //remove espaços em branco e hífens na entrada de cep do usuário -> apenas os números vão permanecer
        cep = cep.replaceAll("[\\s-]", "");

        //constrói a url da api viacep
        String url = "https://viacep.com.br/ws/"+cep+"/json";
        //cliente http para enviar requisição
        HttpClient client = HttpClient.newBuilder().build();
        //objeto request com a URI construída que representa a requisição enviada
        HttpRequest req = HttpRequest.newBuilder(new URI(url)).build();
        //envia a requisição e armazena a resposta na variável res, bodyHandlers.ofString (resposta deve ser tratada como string)
        HttpResponse<String> res = client.send(req, BodyHandlers.ofString());
        //exibe corpo da resposta no console -> cep consultado em formato json
        System.out.println(res.body());
        //liberando recursos scanner
        sc.close();
	}
}