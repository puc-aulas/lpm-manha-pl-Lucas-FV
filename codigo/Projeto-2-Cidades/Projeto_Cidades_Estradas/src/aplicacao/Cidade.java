package aplicacao;

import java.util.Scanner;

public class Cidade {

	private int id;
	private String nome;
	Estrada [] estradas;
	
	Scanner scan = new Scanner(System.in);
	
	public void cadastrarInteressadas (String [] interessadas) {
		int quantPessoas = interessadas.length;
		
		System.out.println("Quantas pessoas voce gostaria de cadastrar? ");
		int novasPessoas = scan.nextInt();
		
		int tamanho = novasPessoas + quantPessoas;
		
		for(int i = quantPessoas; i <= tamanho; i++) {
			
			interessadas[i] = scan.next();
			
		}
	}
	
	
	public Estrada[] getEstradas() {
		return estradas;
	}
	
	public void setEstradas(Estrada[] estradas) {
		this.estradas = estradas;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVisitacao() {
		return visitacao;
	}
	
	public void setVisitacao(String visitacao) {
		this.visitacao = visitacao;
	}

	public String [] getInteressadas() {
		return interessadas;
	}

	public void setInteressadas(String [] interessadas) {
		this.interessadas = interessadas;
	}
	
	
}
