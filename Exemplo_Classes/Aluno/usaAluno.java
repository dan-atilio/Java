import java.util.Scanner; 
import java.util.Formatter; 

public class usaAluno { 

  public static void main(String[] args) { 
    int    nAux; 
    Scanner sLer = new Scanner(System.in); 
    //Objeto Aluno, vetor de 5 posições
    Aluno alu[]=new Aluno[5]; 

    //zerando valores 
    for(nAux=0;nAux<=4;nAux++){ 
      alu[nAux]=new Aluno("","","","","","",""); 
    } 

    //lendo valores 
    for(nAux=0;nAux<=4;nAux++){ 
      System.out.printf("\nDados - aluno%d \n",nAux+1); 
      System.out.printf("Matricula: "); 
      alu[nAux].setMat(sLer.nextLine()); 
      System.out.printf("Nome: "); 
      alu[nAux].setNom(sLer.nextLine()); 
      System.out.printf("Email: "); 
      alu[nAux].setEma(sLer.nextLine()); 
      System.out.printf("Curso: "); 
      alu[nAux].setCur(sLer.nextLine()); 
      System.out.printf("Fone: "); 
      alu[nAux].setFon(sLer.nextLine()); 
      System.out.printf("Celular: "); 
      alu[nAux].setCel(sLer.nextLine()); 
      System.out.printf("Endereco: "); 
      alu[nAux].setEnd(sLer.nextLine()); 
    } 

    System.out.printf("\n\n\n"); 

    //mostrando valores 
    for(nAux=0;nAux<=4;nAux++){ 
     System.out.printf("\nAluno %d:\n",		nAux+1); 
     System.out.printf("Matricula: %s\n",	alu[nAux].getMat()); 
     System.out.printf("Nome: %s\n",		alu[nAux].getNom()); 
     System.out.printf("Email: %s\n",		alu[nAux].getEma()); 
     System.out.printf("Curso: %s\n",		alu[nAux].getCur()); 
     System.out.printf("Fone: %s\n",		alu[nAux].getFon()); 
     System.out.printf("Celular: %s\n",		alu[nAux].getCel()); 
     System.out.printf("Endereco: %s\n",	alu[nAux].getEnd()); 
      //esperando 2 segundos
     try { Thread.sleep (2000); }
     catch (InterruptedException ex) {}
    } 

    System.out.printf("\n\nPrograma Finalizado!\n\n"); 
    } 
}