+===================================================+
| Autor:     Terminal de Informacao                 |
| Site:      www.terminaldeinformacao.com           |
| Data:      09/03/2013                             |
| Descricao: Funcoes de Exemplo em Java             |
+===================================================+

public class Aluno { 
  //Variaveis globais 
  private String cMatricula, cNome, cEmail, cCurso, cFone, cCelular, cEndereco; 

  //Classe principal 
  public Aluno(String cMat, String cNom, String cEma, String cCur, String cFon, String cCel, String cEnd) { 
    this.cMatricula = cMat; 
    this.cNome      = cNom; 
    this.cEmail     = cEma; 
    this.cCurso     = cCur; 
    this.cFone      = cFon; 
    this.cCelular   = cCel; 
    this.cEndereco  = cEnd; 
  } 

  //Get - Matricula 
  public String getMat()    { 
    return this.cMatricula;} 
  //Get - Nome 
  public String getNom()    { 
    return this.cNome;} 
  //Get - Email 
  public String getEma()    { 
    return this.cEmail;} 
  //Get - Curso 
  public String getCur()    { 
    return this.cCurso;} 
  //Get - Fone 
  public String getFon()    { 
    return this.cFone;} 
  //Get - Celular 
  public String getCel()    { 
    return this.cCelular;} 
  //Get - Endereco 
  public String getEnd()    { 
    return this.cEndereco;} 

  //Set - Matricula 
  public void setMat(String cM){ 
    this.cMatricula = cM;} 
  //Set - Nome 
  public void setNom(String cN){ 
    this.cNome = cN;} 
  //Set - Email 
  public void setEma(String cE){ 
    this.cEmail = cE;} 
  //Set - Curso 
  public void setCur(String cC){ 
    this.cCurso = cC;} 
  //Set - Fone 
  public void setFon(String cF){ 
    this.cFone = cF;} 
  //Set - Celular 
  public void setCel(String cT){ 
    this.cCelular = cT;} 
  //Set - Endereco 
  public void setEnd(String cR){ 
    this.cEndereco = cR;} 

}