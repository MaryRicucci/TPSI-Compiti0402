public class Caserma {
  private int CapienzaCaserma ;
  private int nSoldati ;
  public Caserma (int CapienzaCaserma) {
    nSoldati = 0 ;
    this.CapienzaCaserma = CapienzaCaserma ;
  }
  public boolean AddestraSoldati (int n) throws AddestramentoFallitoException {
    boolean ad = true ;
    if (n>CapienzaCaserma){
      ad = false ;
      throw new AddestramentoFallitoException ("Non è stato possibile addestrare i soldati");
    }
    else {
      nSoldati = nSoldati + n ;
      ad = true ; 
         }
    return ad ;
  }

  public String FaiRonde() {
    return "i soldati stanno svolgendo una ronda";
  }
 //Nel main se viene lanciata l'eccezione, modificare le risorse del Granaio
  public String SedaRivolta () throws RivoltaAvvenutaException {
    String r ;
    if (NSoldati <=20) {
       nSoldati = nSoldati / 2 ;
      r = "" ;
      throw new RivoltaAvvenutaException ("Spiacente, truppe insufficienti."+nSoldati+"\nNon è stato possibile sedare la rivolta");
  }
    else {
      nSoldati = nSoldati - 20 ;
      r= "Sono stati inviati: "+20+" soldati per sedare la rivolta\nRivolta sedata con successo!" ;
    }
      return r ;
  }
  // Nel main se viene lanciata l'eccezione, azzerare le risorse del Granaio
  public String DifendiCitta () throws InvasioneAvvenutaConSuccesso{
    String m;
    if (nSoldati <= 40) {
      nSoldati = 0 ;
      m = "";
      throw new InvasioneAvvenutaConSuccessoException ("Spiacente, non è stato possibile difendere la città, i soldati sono insufficienti: "+nSoldati';
    }
    else {
      nSoldati = nSoldati - 40 ;
      m = "Sono stati inviati: "+40+" soldati per difendere la città\nLa città è stata difesa con successo";
    }
    return m ;
  }
      
    
    

  

  
  
