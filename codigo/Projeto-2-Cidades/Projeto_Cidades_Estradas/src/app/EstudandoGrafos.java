package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EstudandoGrafos {

    public static void main(String[] args) throws FileNotFoundException {
    	
    	File file= new File("/Users/felip/OneDrive/Área de Trabalho/arquivo.txt");
    	Scanner scan = new Scanner(file);
        Grafo<String> grafo = new Grafo<String>();
        int numLinhas = 0;
        while(scan.hasNextLine()) {
        	numLinhas++;
        	System.out.println(scan.nextLine());
        }
        System.out.println(numLinhas);
        System.out.println("-------X------");
        String[] linhas = new String[numLinhas];
        String[][] dados = new String[numLinhas][2];
        
        file= new File("/Users/felip/OneDrive/Área de Trabalho/arquivo.txt");
    	scan = new Scanner(file);
        
        for (int i = 0; i< numLinhas; i++) {
        	linhas[i] = scan.nextLine();
		}
        
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
