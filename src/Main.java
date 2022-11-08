import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Banque BNP = new Banque("BNP");
        Personne Bryan = new Personne("Artiges","Bryan", LocalDate.of(1998,03,13));
        Epargne BE45 = new Epargne("13",5000.78,Bryan);

        BE45.retrait(50000);
        BE45.retrait(10);
    }
}
