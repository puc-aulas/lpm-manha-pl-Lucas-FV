public class EstudandoGrafos {

    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("Cidade do Cabo");
        grafo.adicionarVertice("Joanesburgo");
        grafo.adicionarVertice("Nairobi");
        grafo.adicionarVertice("Paris");
        grafo.adicionarVertice("Mumbai");
        
        grafo.adicionarAresta(1270.0, "Cidade do Cabo", "Joanesburgo");
        grafo.adicionarAresta(3900.0, "Cidade do Cabo", "Nairobi");
        grafo.adicionarAresta(8900.0, "Cidade do Cabo", "Paris");
        grafo.adicionarAresta(1270.0, "Joanesburgo", "Cidade do Cabo");
        grafo.adicionarAresta(4700.0, "Joanesburgo", "Nairobi");
        grafo.adicionarAresta(6500.0, "Joanesburgo", "Mumbai");
        grafo.adicionarAresta(3900.0, "Nairobi", "Cidade do Cabo");
        grafo.adicionarAresta(4700.0, "Nairobi", "Joanesburgo");
        grafo.adicionarAresta(8900.0, "Paris", "Cidade do Cabo");
        grafo.adicionarAresta(6500.0, "Mumbai", "Joanesburgo");
        
        grafo.buscaEmLargura();
        grafo.grafoConexo();
    }

}
