//Bibliotecas
import java.util.Scanner;
import java.util.Formatter;
 
//Exemplo de Try
public class exemploTry {
 
 //Programa Principal
 public static void main(String[] args) {
  Scanner sLer = new Scanner(System.in);
  int nOpc=-1;
  String cLido="";
 
  //Enquanto for diferente de 0
  while(nOpc!=0){
   //Função que mostra o menu
   pintaMenu();
   //Tente
   try{
    //Ler como string
    cLido = sLer.nextLine();
    //Converter para numérico
    nOpc = Integer.parseInt(cLido);
    //Se for 1, mostra mensagem
    if(nOpc==1)
     System.out.printf("\n\n\t-> Mensagem <-\n\n");
    //Senão se for diferente de 0
    else if (nOpc!=0)
     System.out.printf("\n\n\t-> Número Inválido <-\n\n");
   }
   //Se não conseguiu passar pelo try
   catch(Exception eExc){
    //Zerando a opção
    nOpc=-1;
    //Mostrando erro</span>
    System.out.printf("\nErro de atribuição em variável int!\n");
    System.out.printf("Descrição:\n");
    System.out.printf("\t"+eExc+"\n\n");
   }
  }//While
 }//Main
 
 //Função que mostra Menu
 private static void pintaMenu(){
  System.out.printf("\n\n > Menu ");
  System.out.printf("\n\t 1- Mostrar Mensagem ");
  System.out.printf("\n\t 0- Sair ");
  System.out.printf("\n > Resposta: ");
 }
 
}//Class