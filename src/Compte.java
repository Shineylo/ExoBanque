public class Compte {

    private String numero;
    private double solde;
    private Personne titulaire;

    public Compte(String numero, double solde, Personne titulaire) {
        this.numero = numero;
        this.solde = solde;
        this.titulaire = titulaire;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }

    public void depot(double montant){
        if(montant >0) {
            this.solde += montant;
            System.out.println("Nouveau solde : " + getSolde() + " euros");
        }else{
            System.out.println("Montant négatif");
        }
    }

    public void retrait(double montant) {
        this.setSolde(this.getSolde() - montant);
    }
}
