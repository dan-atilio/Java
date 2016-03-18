public class ControleRemoto { 
    //Variaveis globais 
    private int nCanal, nVolume; 

    //Classe principal 
    public ControleRemoto(int nC, int nV) { 
      this.nCanal   = nC; 
      this.nVolume  = nV; 
    } 

    //Get - Canal 
    public int getCanal()    { 
      return this.nCanal;} 
    //Get - Volume 
    public int getVolume()    { 
      return this.nVolume;} 

    //Set - Canal 
    public void setCanal(int nCa){ 
     if((nCa>=1)||(nCa<=200)){ 
      this.nCanal = nCa;} 
    } 

    //Muda Canal 
    public void mudaCanal(int nTipo){ 
      //+ (Aumenta Canal)
      if(nTipo==1){ 
       //se for menor que 200, aumenta
       if(this.nCanal<200){ 
        this.nCanal+=1;} 
       //volta pro 1
       else{ 
        this.nCanal=1;} 
      } 
      //- (Diminui Canal)
      else { 
       //se for maior que 1, diminui
       if(this.nCanal>1){ 
        this.nCanal-=1;} 
       //volta pro 200
       else{ 
        this.nCanal=200;}  
      } 
    } 

    //Muda Volume 
    public void mudaVolume(int nTipo){ 
     //+ (Aumenta Volume)
     if(nTipo==1){ 
      //se for menor que 100
      if(this.nVolume<100){ 
       this.nVolume++;} 
     } 
     //- (Diminui Volume)
     else{ 
      //se for maior que 0
      if(this.nVolume>0){ 
       this.nVolume--;} 
    } 
  } 

}