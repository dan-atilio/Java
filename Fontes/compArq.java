import java.util.List;
import java.util.ArrayList;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Formatter;

public class compArq { 
	public static List <String> oPalavrasArq1 = new ArrayList<String>();
	
	//Funcao que carrega as palavras do Arquivo 1 para a Lista Encadeada (juntamente com a funcao addPalavra)
	private static void carregaPalavras() {
		String LinAtu = "";
		File fArq = new File("arquivo1.txt");
		String palavra = "";
		
		if (fArq.exists()){
			try{
				FileReader     fReader = new FileReader("arquivo1.txt");
				BufferedReader rLeitor = new BufferedReader(fReader);
				
				while ((LinAtu=rLeitor.readLine())!=null){
					if (LinAtu.contains(" ")) {
						while (LinAtu.contains(" ")){
							palavra = LinAtu.substring(0,LinAtu.indexOf(" "));
							LinAtu = LinAtu.substring(LinAtu.indexOf(" ")+1,LinAtu.length());
							addPalavra(palavra);
							
							if (!(LinAtu.contains(" "))) {
								addPalavra(LinAtu);
							}
						}
					}
					else{
						addPalavra(LinAtu);
					}
				}
			}
			catch(Exception eEx){
				System.out.println("Houveram erros no carregamento dos dados: "+eEx);
			}
		}
	}
	
	//Funcao que compara a lista encadeada do Arquivo 1, com o Arquivo 2
	private static void comparaArq2() {
		int fim = oPalavrasArq1.size();
		int atu = 0;
		String LinAtu = "";
		File fArq = new File("arquivo2.txt");
		String palavra = "";
		
		if (fArq.exists()){
			try{
				FileReader     fReader = new FileReader("arquivo2.txt");
				BufferedReader rLeitor = new BufferedReader(fReader);
				
				while ((LinAtu=rLeitor.readLine())!=null){
					for(atu=0;atu<fim;atu++){
						if (LinAtu.contains(oPalavrasArq1.get(atu))) {
							System.out.println("Palavra do Arquivo 1 encontrada no Arquivo 2: "+oPalavrasArq1.get(atu));
						}
					}
				}
			}
			catch(Exception eEx){
				System.out.println("Houveram erros no carregamento dos dados: "+eEx);
			}
		}
	}
	
	//funcao criada para adicionar as palavras lidas na lista encadeada referente ao Arquivo 1
	private static void addPalavra(String palavra){
		int fim = oPalavrasArq1.size();
		int atu = 0;
		Boolean adicionar = true;
	    
		if(fim == 0)
			adicionar = true;
		else
			for(atu=0;atu<fim;atu++){
				if ( (oPalavrasArq1.get(atu).toUpperCase().trim().equals(palavra.toUpperCase().trim())) ){
					adicionar = false;
				}
			}
		
		if (adicionar)
			oPalavrasArq1.add(palavra);
	}
	
	//funcao principal
	public static void main(String[] args) { 
		carregaPalavras();
		comparaArq2();
	} 
}