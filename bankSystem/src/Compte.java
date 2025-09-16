import java.util.ArrayList;

public abstract class Compte {
    protected static int shifres = 10000;

    public static String code;

    protected double solde ;


    public Compte(double solde) {
        generateCode();
        this.solde = solde;
    }

    public void generateCode() {
        code = "CPT-"+(++shifres);
    }


    public static ArrayList<Operation> listOperations;


    public abstract void retirer();

    public abstract void calculerInteret();

    public abstract void afficherDetails();


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public ArrayList<Operation> getListOperations() {
        return listOperations;
    }

    public void setListOperations(ArrayList<Operation> listOperations) {
        this.listOperations = listOperations;
    }


}
