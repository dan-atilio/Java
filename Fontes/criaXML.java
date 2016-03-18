import javax.swing.*;
import java.util.Formatter; //para formatar arquivo
 
public class criaXML{
   
  public static void main(String[] args){
    String nomeArq="gerado.xml";
    String texto="";
    //tentando criar arquivo
    try
    {
      Formatter saida = new Formatter(nomeArq);
      texto="<?xml version='1.0' encoding='ISO-8859-1' ?>\n"+
          "<cadastros>\n";
      for (int indice=1; indice<=5; indice++){
        "  <aluno>\n";
        "    <matricula>0000"+
        Integer.toString(indice)+"</matricula>\n";
        "  </aluno>\n";
      }
      "</cadastros>";
      saida.format(texto);
      saida.close();
      JOptionPane.showMessageDialog(null,"Arquivo '"+nomeArq+"' criado!","Arquivo",1);
    }
    //mostrando erro em caso se nao for possivel gerar arquivo
    catch(Exception erro){
      JOptionPane.showMessageDialog(null,"Arquivo nao pode ser gerado!","Erro",0);
    }
  }
   
}