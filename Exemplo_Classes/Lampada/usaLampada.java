import java.util.Scanner; 
import java.util.Formatter; 

public class usaLampada { 

 public static void main(String[] args) { 
   int nOpc=-1; 
   //Declarando o Objeto Lampada
   Lampada lamp[]=new Lampada[1]; 
   Scanner sLer = new Scanner(System.in); 
   //Inicia a Lampada desligada
   lamp[0]=new Lampada(false); 

   System.out.printf("Iniciando..."); 
   while(true){ 
     pintaMenu(); 
     nOpc = sLer.nextInt(); 
     //Se for 0, encerra programa
     if(nOpc==0) 
       break; 

     //Verificando a opção
     switch (nOpc) { 
       case 1: 
         lamp[0].acende(); 
         break; 
       case 2: 
         lamp[0].apaga(); 
       break; 
       case 3: 
         lamp[0].mostraResultado(); 
       break; 
       default: 
         System.out.printf("\n --> Valor Incorreto"); 
         //esperando 2 segundos (delay)
         try { Thread.sleep (2000); }
         catch (InterruptedException ex) {}
       break;        
     } 
    } 
    System.out.printf("\n\nPrograma Finalizado!\n\n"); 
  } 

  //Função que cria o menu
  private static void pintaMenu(){ 
    System.out.printf("\n\n > Menu "); 
    System.out.printf("\n  1- Acender Lampada "); 
    System.out.printf("\n  2- Apagar Lampada "); 
    System.out.printf("\n  3- Mostrar Resultado "); 
    System.out.printf("\n  0- Sair "); 
    System.out.printf("\n > Resposta: "); 
  } 
}