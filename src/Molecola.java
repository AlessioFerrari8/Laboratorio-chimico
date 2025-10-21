
import java.util.ArrayList;


public class Molecola {
    private String nome;
    private boolean ione;
    private Composto composto;
    private ArrayList<Atomo> atomi;

    public Molecola(String nome, boolean ione, Composto composto, ArrayList<Atomo> atomi) {
        this.nome = nome;
        this.ione = ione;
        this.composto = composto;
        this.atomi = atomi;
    }

    public double getPesoMolecolare() {
        double somma = 0.0;
        for (Atomo a : atomi) {
            somma += a.getPesoAtomico();
        }
        return somma;
    }

    public void impostaIone() {
        
    }

    
}
