import java.time.LocalDate;

public class Epargne extends Compte {
    private LocalDate dateDernierRetrait;

    public Epargne(String numero, double solde, Personne titulaire) {
        super(numero,solde,titulaire);
        this.dateDernierRetrait = null;
    }

    public LocalDate getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    public void setDateDernierRetrait(LocalDate dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
    }

    public void retrait(double montant){
        if(getSolde() > montant){
            super.retrait(montant);
            this.dateDernierRetrait = LocalDate.now();
            System.out.println("Nouveau solde : "+getSolde()+" euros");
            System.out.println(this.dateDernierRetrait);
        }else{
            System.out.println("Retrait Impossible pour cause de solde insuffisant");
        }
    }
}
