public class Courant extends Compte{

    private double ligneDeCredit = 0;


    public Courant(String numero, double solde, double ligneDeCredit, Personne titulaire) {
        super(numero,solde,titulaire);
        this.ligneDeCredit = Math.abs(ligneDeCredit);
    }

    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit) {
        this.ligneDeCredit = ligneDeCredit;
    }

    public void retrait(double montant){
        if(getSolde()-montant > 0-ligneDeCredit){
            super.retrait(montant);
            System.out.println("Nouveau solde : "+getSolde()+" euros");
        }else{
            System.out.println("Retrait Impossible pour cause de solde insuffisant");
        }
    }
}
