+===================================================+
| Autor:     Terminal de Informacao                 |
| Site:      www.terminaldeinformacao.com           |
| Data:      09/03/2013                             |
| Descricao: Funcoes de Exemplo em Java             |
+===================================================+

public class Elevador { 
  //Variaveis globais 
  private int nAtual, nTotal, nCapac, nPessoas; 

  //Classe principal 
  public Elevador(int nA, int nT, int nC, int nP) { 
    this.nAtual   = nA; 
    this.nTotal   = nT; 
    this.nCapac   = nC; 
    this.nPessoas = nP; 
  } 

  //Get - Capacidade 
  public int getCapac()    { 
    return this.nCapac;} 
  //Get - Pessoas presentes 
  public int getPessoas()    { 
    return this.nPessoas;} 
  //Get - Total de andares 
  public int getTotal()    { 
    return this.nTotal;} 
  //Get - Andar Atual 
  public int getAtual()    { 
    return this.nAtual;} 

  //Set - Pessoas Presentes 
  public void setPes(int nPe){ 
    this.nPessoas = nPe;} 

  //Inicializa 
  public void Inicializa(int nCap,int nTot){ 
    this.nTotal   = nTot; 
    this.nCapac   = nCap; 
  } 

  //Entra pessoa 
  public void Entra(){ 
    this.nPessoas+=1; 
  } 

  //Sai pessoa 
  public void Sai(){ 
    this.nPessoas-=1; 
  } 

  //Sobe de andar 
  public void Sobe(){ 
    this.nAtual+=1; 
  } 

  //Desce de andar 
  public void Desce(){ 
    this.nAtual-=1; 
  } 

}