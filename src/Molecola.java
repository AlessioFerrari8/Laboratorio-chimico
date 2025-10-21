
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
        int somma = 0;
        for (Atomo a : atomi) {
            somma += a.getNumeroOssidazione();
        }
        if (somma != 0) {
            this.ione = true;
        } else {
            this.ione = false;
        }
    }

    public boolean isNobile() {
        boolean trovato = false;
        for (Atomo a : atomi) {
            if ((a instanceof GasNobile)) {
                trovato = true;
                break;
            }
        }
        return trovato;
    }

    public boolean isAnidride() {
        boolean trovatoNonMetallo = false;
        boolean trovatoOssigeno = false;
        for (Atomo a : atomi) {
            if ((a instanceof NonMetallo)) {
                trovatoNonMetallo = true;
            }
            if ((a.getSimbolo().equals("O") )) {
                trovatoOssigeno = true;
            }
        }
        return trovatoNonMetallo && trovatoOssigeno;
    }

    
}
