package br.uern.di.poo.exemplos.testerestservice;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class TesteAPIBook {
	
	private static final String BOOK_URL = "http://localhost:8080/book"; 
	
	private static void cadastraLivro(String jsonString) {
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(
				URI.create(BOOK_URL))
				.header("content-type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(jsonString))
				.build();
		try {
		    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			System.out.println("Novo livro cadastrado: \n" + response.body());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	private static String obtemTodosLivros() {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
		    .uri(URI.create(BOOK_URL))
		   .build();
		try {
		    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		    return response.body().toString();
		} catch (IOException | InterruptedException e) {
		    e.printStackTrace();
		} 
		return "";
	}

	private static String obtemLivro(Long bookId) {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
		    .uri(URI.create(BOOK_URL+"/" +bookId))
		   .build();
		try {
		    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		    return response.body().toString();
		} catch (IOException | InterruptedException e) {
		    e.printStackTrace();
		} 
		return "";
	}
	public static void main(String[] args) {
		
		String livro1 = "{\"title\": \"Java Como programar\"," +
			"\"author\": \"Paul e Harvey Deitel\"," +
			"\"year\": 2010}";
		
		String livro2 = "{\"title\": \"Core Java: Volume 1: Fundamentos\"," +
				"\"author\": \"Cay S. Horstman, Gary Cornell\"," +
				"\"year\": 2009}";
		
		String livro3 = "{\"title\": \"Use a Cabeça! Java\"," +
				"\"author\": \"Kathy Sierra & Bert Bates \"," +
				"\"year\": 2010}";
				
		cadastraLivro(livro1);
		cadastraLivro(livro2);
		cadastraLivro(livro3);
		
		System.out.println("Lista de todos os livros:\n");
		String livros[] = obtemTodosLivros().split("}");
		for(String livro:livros)
			System.out.println(livro);
		
		Long id = 1L;
		System.out.println("Obtendo livro com id " + id + ":\n");
		System.out.println(obtemLivro(id));
		
		id = 100L;
		System.out.println("Obtendo livro com id " + id + ":\n");
		System.out.println(obtemLivro(id));		
	}
}
