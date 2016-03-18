import java.util.Scanner; 
import java.util.Formatter; 

public class usaMaior { 

    public static void main(String[] args) { 
      int nAux,nMaior; 
      Scanner sLer = new Scanner(System.in); 
      //Objeto MaiorNum, 10 posições
      MaiorNum num[]=new MaiorNum[10]; 

      //Inicializando valores (0)
      for (nAux=0;nAux<=9;nAux++){ 
        num[nAux]=new MaiorNum(0); 
      } 

      //Inserindo valores
      for (nAux=0;nAux<=9;nAux++){ 
        System.out.printf("\nInsira o valor %d: ",nAux+1); 
        num[nAux].setValor(sLer.nextInt()); 
      } 

      nMaior=num[0].getValor(); 
      //Procurando o maior valor
      for (nAux=1;nAux<=9;nAux++){ 
        if(num[nAux].getValor() > nMaior){ 
          nMaior=num[nAux].getValor(); 
        } 
      } 

      System.out.printf("\n\nMaior valor encontrado: %d",nMaior); 

      //Esperando 2 segundos
      try { Thread.sleep (2000); }
      catch (InterruptedException ex) {}

      System.out.printf("\n\nPrograma Finalizado!\n\n"); 
  } 
}