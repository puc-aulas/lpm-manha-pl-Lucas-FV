package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EstudandoGrafos {

    public static void main(String[] args) throws FileNotFoundException {
    	
    	File file= new File("/Users/felip/OneDrive/Área de Trabalho/arquivo.txt");
    	Scanner scan = new Scanner(file);
        Grafo<String> grafo = new Grafo<String>();
        
        String[] linhas = new String[5];
        String[][] dados = new String[5][2];
        for (int i = 0;i<linhas.length;i++) {
        	linhas[i] = scan.nextLine();
		}
        for (String string : linhas) {
			System.out.println(string);
		}
        
        System.out.println("-------X------");
        
        for (int i = 0; i < dados.length; i++) {
        	
			dados[i] = linhas[i].split(":");
			
			grafo.adicionarVertice(dados[i][0]);
			
		}
        for (int i = 0; i < dados.length; i++) {
        	
			dados[i] = linhas[i].split(":");
			
			String[] dadosEstradas1 = dados[i][1].split(",");
			
			for(int j = 0; j< dadosEstradas1.length;j++) {
								
				String[] dadosEstradas2 = dadosEstradas1[j].split("[()]");
				
				double distancia = Double.parseDouble(dadosEstradas2[1]);
				String inicio = dados[i][0];
				String fim = dadosEstradas2[0].trim();
				grafo.adicionarAresta(distancia, inicio, fim);
			}
		}
        
        grafo.buscaEmLargura();
        grafo.grafoConexo();
    }

}              
