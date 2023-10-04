package aplicacao;

import java.util.ArrayList;

public class Cidade <TIPO>{

	private int id;
	private ArrayList<Cidade<TIPO>> arestaEntrada;
	private ArrayList<Cidade<TIPO>> arestaSaida;
	
	public Cidade(int valor) {
		this.id = valor;
		this.arestaEntrada = new ArrayList<Cidade<TIPO>>();
		this.arestaSaida = new ArrayList<Cidade<TIPO>>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void adicionarArestaEntrada(Cidade<TIPO> cidade) {
		this.arestaEntrada.add(cidade);
	}
	public void adicionarArestaSaida(Cidade<TIPO> cidade) {
		this.arestaSaida.add(cidade);
	}
}