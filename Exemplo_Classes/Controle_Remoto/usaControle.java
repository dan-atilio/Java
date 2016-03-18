import java.util.Scanner; 
import java.util.Formatter; 

public class usaControle { 

    public static void main(String[] args) { 
    int nOpc=-1; 
    Scanner sLer = new Scanner(System.in);
    //objeto Controle
    ControleRemoto cont[]=new ControleRemoto[1];   
    //inicia no canal 1, volume 20
    cont[0]=new ControleRemoto(1,20); 

    while(true){ 
      pintaMenu(); 
      nOpc = sLer.nextInt(); 
      if(nOpc==0) 
       break; 

      System.out.printf("\n\n"); 
      switch (nOpc) { 
       case 1: 
        cont[0].mudaCanal(1); 
       break; 
       case 2: 
        cont[0].mudaCanal(0); 
       break; 
       case 3: 
        System.out.printf("\nInsira o canal: "); 
        cont[0].setCanal(sLer.nextInt()); 
       break; 
       case 4: 
        cont[0].mudaVolume(1); 
       break; 
       case 5: 
        cont[0].mudaVolume(0); 
       break; 
       case 6: 
        System.out.printf("Volume: %d\n",cont[0].getVolume()); 
        System.out.printf("Canal: %d\n",cont[0].getCanal()); 
        //esperando 2 segundos
        try { Thread.sleep (2000); }
        catch (InterruptedException ex) {}
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
    System.out.printf("\n  1- + Canal "); 
    System.out.printf("\n  2- - Canal "); 
    System.out.printf("\n  3- Buscar canal "); 
    System.out.printf("\n  4- + Volume "); 
    System.out.printf("\n  5- - Volume "); 
    System.out.printf("\n  6- Mostrar dados "); 
    System.out.printf("\n  0- Sair "); 
    System.out.printf("\n > Resposta: "); 
  } 
}