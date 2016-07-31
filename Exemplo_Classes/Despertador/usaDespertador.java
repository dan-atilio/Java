import java.util.Scanner; 
import java.util.Formatter; 

public class usaDespertador { 

  public static void main(String[] args) { 
    int nOpc=-1; 
    Scanner sLer = new Scanner(System.in);

    //Objeto meu despertador
    Despertador meuDespertador = new Despertador(); 

    while(true){ 
      pintaMenu(); 
      nOpc = sLer.nextInt(); 
      if(nOpc==0) 
       break; 

      System.out.printf("\n\n"); 
      switch (nOpc) { 
       case 1: 
        System.out.printf("\nInsira a hora: "); 
        meuDespertador.setHora(sLer.nextInt()); 
       break; 
       case 2: 
        System.out.printf("\nInsira os minutos: "); 
        meuDespertador.setMinuto(sLer.nextInt()); 
       break; 
       case 3: 
        meuDespertador.ativa(); 
       break; 
       case 4: 
        meuDespertador.consulta(); 
       break; 
       default: 
        System.out.printf("\n Valor Incorreto");
        //Esperando 2 segundos
        try { Thread.sleep (2000); }
        catch (InterruptedException ex) {}
       break; 
      }
    } 
    System.out.printf("\n\nPrograma Finalizado!\n\n"); 
  } 

  private static void pintaMenu(){ 
    System.out.printf("\n\n > Menu "); 
    System.out.printf("\n  1- Definir Hora "); 
    System.out.printf("\n  2- Definir Minutos "); 
    System.out.printf("\n  3- Ativar / Desativar "); 
    System.out.printf("\n  4- Consultar "); 
    System.out.printf("\n  0- Sair "); 
    System.out.printf("\n > Resposta: "); 
  } 
}