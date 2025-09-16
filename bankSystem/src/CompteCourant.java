import java.util.HashMap;

public class CompteCourant extends Compte {

    private double decouvert = 0;
    public static HashMap<String, CompteCourant> currentaccounts = new HashMap<>();


    public void retirer(){

    }
    public void calculerInteret() {

    }

    public CompteCourant(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
        this.solde = 23.3;
    }

    public void afficherDetails() {

    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }



    public static void create (CompteCourant object) {
        currentaccounts.put(code , object);
        System.out.println(currentaccounts.toString());
    }

    @Override
    public String toString() {
        return

                ", code=" + code + " ,decouvert=" + decouvert +
                ", solde=" + solde + "||" ;
    }
}
