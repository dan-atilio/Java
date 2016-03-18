import javax.swing.*;
import java.io.*;
/*  //ou usar lib por lib
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;*/
 
public class leTxt{
 
  public static void main(String[] args){
    String mostra="";
    String nomeArq="arquivo.txt"; //Nome do arquivo, pode ser absoluto, ou pastas /dir/teste.txt
    String linha="";
    File arq = new File(nomeArq);
 
    //Arquivo existe
    if (arq.exists()){
      mostra="Arquivo - '"+nomeArq+"', aberto com sucesso!\n";
      mostra+="Tamanho do arquivo "+Long.toString(arq.length())+"\n";
      //tentando ler arquivo
      try{
        mostra+="Conteudo:\n";
        //abrindo arquivo para leitura
        FileReader reader = new FileReader(nomeArq);
        //leitor do arquivo
        BufferedReader leitor = new BufferedReader(reader);
        while(true){
          linha=leitor.readLine();
          if(linha==null)
            break;
          mostra+=linha+"\n";
        }
      }
      catch(Exception erro) {}
      JOptionPane.showMessageDialog(null,mostra,"Arquivo...",1);
    }
    //Se nao existir
    else
      JOptionPane.showMessageDialog(null,"Arquivo nao existe!","Erro",0);
  }
}