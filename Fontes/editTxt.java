import java.util.Formatter;
import java.io.*;
import java.util.Scanner; 

public class editTxt{

	public static void main(String[] args){
		String nomeArq = "gerado.txt";
		String conteudo = "";
		String linha = "";
		String linhaNova = "";
		File arq = new File(nomeArq);
		Scanner ler = new Scanner(System.in); 

		//se o arquivo existir, pega o conteúdo dele
		if (arq.exists()) {
			try {
				FileReader reader = new FileReader(nomeArq);
				BufferedReader leitor = new BufferedReader(reader);

				while(true) {
					linha=leitor.readLine();

					if(linha==null)
					break;

					conteudo += linha+"\n";
				}
			}
			catch(Exception erro) {}
		}
		
		//Nova linha
		System.out.printf("Insira a nova linha: \n> "); 
		linhaNova = ler.nextLine(); 
		conteudo += linhaNova+"\n";
		
		//Agora tenta salvar o conteúdo, incluindo o que o usuario digitar
		try {
			Formatter saida = new Formatter(nomeArq);
			saida.format(conteudo);
			saida.close();
			System.out.printf("Arquivo '"+nomeArq+"' gerado / atualizado!\n\n");
		}
		catch(Exception erro){
			System.out.printf("Arquivo '"+nomeArq+"' nao pode ser gerado / atualizado!\n\n");
		}
	} 
}