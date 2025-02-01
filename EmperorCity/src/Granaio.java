public class Granaio {
    private int LimiteRisorse;
    private int RisorseProdotteOgniGiorno;
    private int RisorseTotali;

    public Granaio(int LimiteRisorse, int RisorseProdotteOgniGiorno) {
        this.LimiteRisorse = LimiteRisorse;
        this.RisorseProdotteOgniGiorno = RisorseProdotteOgniGiorno;
        RisorseTotali = 0;
    }

    public void Produci throws MassimoRisorseSuperatoException {
        if (RisorseProdotteOgniGiorno > LimiteRisorse) {
            throw new MassimoRisorseSuperatoException("Limite massimo di produzione superato: " + LimiteRisorse + " Risorse da produrre: " + RisorseProdotteOgniGiorno);
        } else {
            RisorseTotali = RisorseTotali + RisorseProdotteOgniGiorno;
            System.out.print("Risorse prodotte: +" + RisorseProdotteOgniGiorno);
        }
    }

    public int StampaRisorseTotali () {
        return RisorseTotali ;
    }
}
