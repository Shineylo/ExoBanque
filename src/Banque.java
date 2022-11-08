import java.util.HashMap;

public class Banque {

    private String nom;
    private HashMap<String, Courant> listCompte = new HashMap<String, Courant>();

    public Banque(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public HashMap<String, Courant> getListCompte() {
        return new HashMap<String, Courant>(listCompte);
    }

    public void ajouter(Courant compte){
        if(!this.listCompte.containsKey(compte.getNumero())) {
            this.listCompte.put(compte.getNumero(), compte);
            System.out.println("Compte ajouté");
        }else{
            System.out.println("Compte existant");
        }
    }

    public void supprimer(String numero){
        if(listCompte.remove(numero) != null){
            System.out.println("Compte supprimé");
        }else{
            System.out.println("Numéros de compte inexistant");
        }
    }
}
