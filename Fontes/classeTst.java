//Classe teste
public class classeTst{
  //Quando instanciando um io que pode chamar a Serializable, deve-se criar um endereço para o serialVersionUID (ex.: java.io.*)
  public static final long serialVersionUID = 100;
 
  //função principal que será carregada
  public static void main(String arg[]){
    System.out.printf("\n> Código: %d\n\n", serialVersionUID);
  }
}