import javax.swing.*;
import java.util.Formatter; //formatar arquivo
 
public class criaTxt{
   
  public static void main(String[] args){
    String nomeArq="gerado.txt";
    //tentando criar arquivo
    try
    {
      Formatter saida = new Formatter(nomeArq);
      saida.format("Arquivo gerado automaticamente!\n\n...www.terminaldeinformacao.com...");
      saida.close();
      JOptionPane.showMessageDialog(null,"Arquivo '"+nomeArq+"' criado!","Arquivo",1);
    }
    //mostrando erro em caso se nao for possivel gerar arquivo
    catch(Exception erro){
      JOptionPane.showMessageDialog(null,"Arquivo nao pode ser gerado!","Erro",0);
    }
  } 
}