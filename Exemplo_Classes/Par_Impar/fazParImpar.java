import java.util.Scanner;
import java.util.Formatter;

public class fazParImpar {

  public static void main(String[] args) {
    int nOpc=-1;
    float nA, nB, nResul;
    Scanner sLer = new Scanner(System.in);
    ParImpar oParImpar[]=new ParImpar[1];

    oParImpar[0]=new ParImpar(0);

    System.out.printf("Iniciando...");
    while(true){
      //esperando 2 segundos
      try { Thread.sleep (2000); }
      catch (InterruptedException ex) {}
      pintaMenu();
      nOpc = sLer.nextInt();
      if(nOpc==0)
        break;

      oParImpar[0].setVal1(nOpc);

      System.out.println("\nValor "+oParImpar[0].getVal1()+" = "+oParImpar[0].getResul());

    }
    System.out.printf("\n\nPrograma Finalizado!\n\n");
  }

  private static void pintaMenu(){
    System.out.printf("\n\n > Menu ");
    System.out.printf("\n  x - Insira o valor do numero ");
    System.out.printf("\n  0 - Sair do Programa ");
    System.out.printf("\n > Resposta: ");
  }
}