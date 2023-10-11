package app;
import java.util.ArrayList;

public class Grafo<TIPO> {
	private ArrayList<Vertice<TIPO>> vertices;
	private ArrayList<Aresta<TIPO>> arestas;
	
	public Grafo() {
		this.vertices = new ArrayList<Vertice<TIPO>>();
		this.arestas = new ArrayList<Aresta<TIPO>>();
	}
	public void adicionarVertice (TIPO dado) {
		Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
		this.vertices.add(novoVertice);
	}
	public void adicionarAresta (Double peso,TIPO dadoInicio, TIPO dadoFim ) {
		Vertice<TIPO>inicio = this.getVertice(dadoInicio);
		Vertice<TIPO>fim = this.getVertice(dadoFim);
		Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
		inicio.adicionarArestaSaida(aresta);
		fim.adicionarArestaEntrada(aresta);
		this.arestas.add(aresta);
	}
	public Vertice<TIPO> getVertice(TIPO dado){
		Vertice<TIPO> vertice= null;
		for (int i = 0; i < this.vertices.size(); i++) {
			if(this.vertices.get(i).getDado().equals(dado)) {
				vertice = this.vertices.get(i);
				break;
			}
		}
		return vertice;
	}
	
    public void buscaEmLargura(){
    	System.out.println("Recomendacao de visitacao: ");
        ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>();
        ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>();
        Vertice<TIPO> atual = this.vertices.get(0);
        marcados.add(atual);
        fila.add(atual);
        while(fila.size() > 0){
            Vertice<TIPO> visitado = fila.get(0);
            for(int i=0; i < visitado.getArestasSaida().size(); i++){
                Vertice<TIPO> proximo = visitado.getArestasSaida().get(i).getFim();
                if (!marcados.contains(proximo)){ //se o vértice ainda não foi marcado
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
        System.out.println("-------------");
    }
    public void grafoConexo() {
   
    	Vertice<TIPO> atual = this.vertices.get(0);
    	ArrayList<Vertice<TIPO>> contidos = new ArrayList<Vertice<TIPO>>();
    	ArrayList<Vertice<TIPO>> naoContidos = this.vertices;
    	for(int i = 1; i< this.vertices.size(); i++) {
    		for (int j = 0; j < atual.getArestasSaida().size(); j++) {
    			if(this.vertices.get(i).getDado().equals(atual.getArestasSaida().get(j).getFim().getDado())) {
        			contidos.add(atual.getArestasSaida().get(j).getFim());
        		}
			}
    	}
    	naoContidos.removeAll(contidos);
    	if(naoContidos.size()>1) {
    		System.out.println("Grafo nao Conexo!!");
    		System.out.println("Cidades nao conectadas:");
        	for (int i = 1; i < naoContidos.size(); i++) {
        		System.out.println(naoContidos.get(i).getDado());
    		}
    	}else {
    		System.out.println("Grafo Conexo!!");
    	}
    	System.out.println("-------------");
    }
    
}
