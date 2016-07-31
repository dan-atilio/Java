public class Despertador { 
    private int ativado, hora, minuto;
	
	//Cria o despertador
    public Despertador() { 
      this.hora    = 0; 
      this.minuto  = 0; 
	  this.ativado = 0;
    } 

	//Pega a hora
    public int getHora()    { 
      return this.hora;} 
	
	//Pega os minutos
	public int getMinutos()    { 
      return this.minuto;} 
	  
	//Pega se está ativado
	public int getAtivado()    { 
      return this.ativado;} 
	
	//Seta as horas
	public void setHora(int hor){
		if ((hor < 0) || (hor >= 24)){
			System.out.printf("> Hora invalida!\n");
		}
		else
			this.hora = hor;
	}
	
	//Seta os minutos
	public void setMinuto(int min){
		if ((min < 0) || (min >= 60)){
			System.out.printf("> Minutos invalida!\n");
		}
		else
			this.minuto = min;
	}
	
	//Ativa / Desativa despertador
	public void ativa(){
		if (this.ativado == 0)
			this.ativado = 1;
		else
			this.ativado = 0;
	}
	
	//Consulta o estado do despertador
	public void consulta(){
		String texto = "Despertador ";
		
		if (this.ativado == 1)
			texto += "ATIVADO!    ";
		else
			texto += "DESATIVADO! ";
		
		texto += "Hora: "+    Integer.toString(this.hora)+"; ";
		texto += "Minutos: "+ Integer.toString(this.minuto)+"\n";
		System.out.printf(texto);
	}
}