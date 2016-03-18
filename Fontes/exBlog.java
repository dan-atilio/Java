//bibliotecas
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.MaskFormatter;
 
//classe exBlog extendida de JFrame, implementando ActionListener
public class exBlog extends JFrame implements
 ActionListener{
 
  //Variáveis
  private JLabel lblEst,lblNome,lblSex,lblNiv,lblCPF,lblInt;
  private JTextField texNome;
  private JFormattedTextField texCPF;
  private ButtonGroup gruSex;
  private JRadioButton radMasc, radFem;
  private JComboBox cmbNiv;
  private JCheckBox chkIng, chkMat, chkPro, chkLog;
  private JButton btnGrav;
 
  //Iniciando o exBlog
  public exBlog(){
    setLayout(null);
 
    //Label Estudante
    lblEst = new JLabel("Estudante: ");
    lblEst.setForeground(Color.BLUE);
    lblEst.setBounds(120,5,100,20);
    add(lblEst);
 
    //Label Nome
    lblNome = new JLabel("Nome: ");
    lblNome.setBounds(10,35,100,20);
    add(lblNome);
 
    //Text Nome
    texNome = new JTextField("");
    texNome.setBounds(10,65,300,20);
    add(texNome);
 
    //Label Sexo
    lblSex = new JLabel("Sexo: ");
    lblSex.setBounds(10,95,100,20);
    add(lblSex);
 
    //Radio Masculino
    radMasc = new JRadioButton("Masculino");
    radMasc.setBounds(10,125,120,20);
    radMasc.setForeground(Color.BLUE);
    radMasc.setBackground(Color.WHITE);
    radMasc.setSelected(true);
 
    //Radio Feminino
    radFem = new JRadioButton("Feminino");
    radFem.setBounds(200,125,120,20);
    radFem.setForeground(Color.BLUE);
    radFem.setBackground(Color.WHITE);
 
    //Grupo de Botões
    gruSex = new ButtonGroup();
    gruSex.add(radMasc);
    gruSex.add(radFem);
    add(radMasc);
    add(radFem);
 
    //Label Nível
    lblNiv = new JLabel("Nível Estudantil: ");
    lblNiv.setBounds(10,155,200,20);
    add(lblNiv);
 
    //Combo Nível
    cmbNiv = new JComboBox();
    cmbNiv.setBackground(Color.WHITE);
    cmbNiv.addItem("Básico Completo");
    cmbNiv.addItem("Médio Completo");
    cmbNiv.addItem("Superior Completo");
    cmbNiv.addItem("Doutorado e/ou Mestrado Completo");
    cmbNiv.setBounds(10,185,300,20);
    add(cmbNiv);
 
    //Label CPF
    lblCPF = new JLabel("CPF: ");
    lblCPF.setBounds(10,215,100,20);
    add(lblCPF);
 
    //Campo com máscara - CPF
    try {
      MaskFormatter mk= new MaskFormatter("###.###.###-##");       
      mk.setPlaceholderCharacter('_');
      /*  ou, pode setar os caracteres que irá receber 
        MaskFormatter mk= new MaskFormatter("***.***.***-**");
        mk.setPlaceholderCharacter('_');
        mk.setValidCharacters("ABC0123456.");
      */
      texCPF = new JFormattedTextField(mk); 
      texCPF.setBounds(10,245,300,20);
      add(texCPF);
    }
    catch(Exception e){}
 
    //Label Interesses
    lblInt = new JLabel("Interesses: ");
    lblInt.setBounds(10,275,100,20);
    add(lblInt);
 
    //Check Inglês
    chkIng = new JCheckBox("Inglês");
    chkIng.setBounds(10,305,120,20);
    chkIng.setForeground(Color.BLUE);
    chkIng.setBackground(Color.WHITE);
    add(chkIng);
 
    //Check Matemática
    chkMat = new JCheckBox("Matemática");
    chkMat.setBounds(170,305,120,20);
    chkMat.setForeground(Color.BLUE);
    chkMat.setBackground(Color.WHITE);
    add(chkMat);
 
    //Check Programação
    chkPro = new JCheckBox("Programação");
    chkPro.setBounds(10,335,120,20);
    chkPro.setForeground(Color.BLUE);
    chkPro.setBackground(Color.WHITE);
    add(chkPro);
 
    //Check Lógica
    chkLog = new JCheckBox("Lógica");
    chkLog.setBounds(170,335,120,20);
    chkLog.setForeground(Color.BLUE);
    chkLog.setBackground(Color.WHITE);
    add(chkLog);
 
    //Botão Ok
    btnGrav = new JButton("Ok");
    btnGrav.setBounds(110,385,120,40);
    btnGrav.setMnemonic('O');
    btnGrav.setToolTipText("Ok...");
    btnGrav.setForeground(Color.RED);
    btnGrav.addActionListener(this);
    add(btnGrav);
  }
 
  //Função responsável pelos cliques
  public void actionPerformed(ActionEvent acesso){
    String  sSexo="";
    String  sNivel="";
    String  sExec="";
    Boolean bChave=true;
    //se o acesso for via botão gravar-ok
    if(acesso.getSource() == btnGrav){
      //pegando o nivel de escolaridade
      sNivel=cmbNiv.getSelectedItem().toString();
      //verificando os radios
      if(radFem.isSelected())
        sSexo="F";
      if(radMasc.isSelected())
        sSexo="M";
 
      //montando a frase que será mostrada
      sExec="Nome = '"+texNome.getText()+"'\n"+
            "Sexo = '"+sSexo+"'\n"+
            "Nivel= '"+sNivel+"'\n"+
            "CPF  = '"+texCPF.getText()+"'\n"+
            "-----------------------------\n"+
            "Interesses:\n"+
            "Inglês? "+chkIng.isSelected()+"\n"+
            "Matemática? "+chkMat.isSelected()+"\n"+
            "Programação? "+chkPro.isSelected()+"\n"+
            "Lógica? "+chkLog.isSelected();
 
      //mostrando a frase
      JOptionPane.showMessageDialog(null,sExec,"Atenção",1);
 
      //se a chave for verdadeira, chama função limpaDados
      if(bChave){
        limpaDados();
      }
      //Muda o foco do componente
      texNome.grabFocus();
 
    }
  }
 
  //Função principal que irá criar a janela
  public static void main(String arg[])
  {
    exBlog ex = new exBlog();
    ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ex.getContentPane().setBackground(Color.WHITE);
    //ícone na mesma pasta do código fonte
    ex.setIconImage(new ImageIcon("ico.png").getImage());
    ex.setTitle("Estudantes...");
    //tira o maximizar e alteração do tamanho
    ex.setResizable(false);
    ex.setSize(350,480);
    ex.setVisible(true);
    ex.setLocationRelativeTo(null);
  }
 
  //função que limpa o programa e deixa ele como executado da primeira vez
  private void limpaDados(){
    texNome.setText("");
    texCPF.setText("");
    radMasc.setSelected(true);
    chkIng.setSelected(false);
    chkMat.setSelected(false);
    chkPro.setSelected(false);
    cmbNiv.setSelectedIndex(0);
  }
 
}