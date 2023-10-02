package aplicacao;

public class Estrada {

	private int id;
	private int distancia;
	Cidade[] cidade;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public String getVisitacao() {
		return visitacao;
	}
	public void setVisitacao(String visitacao) {
		this.visitacao = visitacao;
	}
	public Cidade[] getCidade() {
		return cidade;
	}
	public void setCidade(Cidade[] cidade) {
		this.cidade = cidade;
	} 
	
}
