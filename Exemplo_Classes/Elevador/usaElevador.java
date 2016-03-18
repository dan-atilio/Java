import java.util.Scanner; 
import java.util.Formatter; 

public class usaElevador { 

    public static void main(String[] args) { 
    int nOpc=-1, nTot, nCap, nAux; 
    Scanner sLer = new Scanner(System.in); 
    //objeto Elevador
    Elevador elev[]=new Elevador[1]; 

    elev[0]=new Elevador(0,0,0,0); 

    //Inicializando (capacidade total e andares)
    System.out.printf("Capacidade total? R: "); 
    nCap=sLer.nextInt(); 
    System.out.printf("Quantos andares? R: "); 
    nTot=sLer.nextInt(); 
    elev[0].Inicializa(nCap,nTot); 

    while(true){ 
      pintaMenu(); 
      nOpc = sLer.nextInt(); 
      if(nOpc==0) 
        break; 

      System.out.printf("\n\n"); 
      switch (nOpc) { 
       case 1: 
        System.out.printf("Num de pessoas atualmente: "); 
        nAux=sLer.nextInt(); 
        if(nAux<elev[0].getCapac()) 
         elev[0].setPes(nAux); 
       break; 
       case 2: 
        //só sobe se o andar atual for menor que o total
        if (elev[0].getAtual()<elev[0].getTotal()) 
         elev[0].Sobe(); 
       break; 
       case 3: 
        //só desce se o andar atual for maior que o terreo
        if (elev[0].getAtual()>0) 
         elev[0].Desce(); 
       break; 
       case 4: 
        //só entra, se não tiver atingido a capacidade
        if (elev[0].getPessoas()<elev[0].getCapac()) 
         elev[0].Entra(); 
       break; 
       case 5: 
        //só sai, se houverem pessoas (>0)
        if (elev[0].getPessoas()>0) 
         elev[0].Sai(); 
       break; 
       case 6: 
        System.out.printf("Quantidade de Pessoas: %d\n",elev[0].getPessoas()); 
        System.out.printf("Capacidade Suportada: %d\n",elev[0].getCapac()); 
        System.out.printf("Andar Atual: %d\n",elev[0].getAtual()); 
        System.out.printf("Quantidade de Andares: %d\n",elev[0].getTotal()); 
        //espera 2 segundos
        try { Thread.sleep (2000); }
        catch (InterruptedException ex) {}
       break; 
       default: 
        System.out.printf("\n --> Valor Incorreto <--"); 
       break; 
      } 
    } 
    System.out.printf("\n\nPrograma Finalizado!\n\n"); 
  } 

  //função eu mostra menu
  private static void pintaMenu(){ 
    System.out.printf("\n\n > Menu "); 
    System.out.printf("\n  1- Numero de pessoas "); 
    System.out.printf("\n  2- Sobe de Andar "); 
    System.out.printf("\n  3- Desce de Andar "); 
    System.out.printf("\n  4- Entra Pessoa "); 
    System.out.printf("\n  5- Sai Pessoa "); 
    System.out.printf("\n  6- Mostrar dados "); 
    System.out.printf("\n  0- Sair "); 
    System.out.printf("\n > Resposta: "); 
  } 
}