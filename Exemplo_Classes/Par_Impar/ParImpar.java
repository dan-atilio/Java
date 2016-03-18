public class ParImpar {
  //Variaveis globais
  private int nVal;

  //Classe principal
  public ParImpar(int x) {
    this.nVal = x;
  }

  //Get Valor
  public float getVal1()    {
    return this.nVal;}

  //Get Resultado
  public String getResul(){
    String cRetorno = "";
    //se o resto da divisão for 0
    if(this.nVal % 2 == 0)
      cRetorno = "Par";
    else
      cRetorno = "Impar";
    return cRetorno;
  }

  //Set
  public void setVal1(int n)    {
    this.nVal = n;}

}