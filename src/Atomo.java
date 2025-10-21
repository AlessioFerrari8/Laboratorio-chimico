public abstract class Atomo {
    protected  int numeroAtomico;
    protected double pesoAtomico;
    protected String simbolo;
    protected int numeroOssidazione;
    

    public Atomo() {

    };

    public Atomo(int numeroAtomico, double pesoAtomico, String simbolo, int numeroOssidazione) {
        this.numeroAtomico = numeroAtomico;
        this.pesoAtomico = pesoAtomico;
        this.simbolo = simbolo;
        this.numeroOssidazione = numeroOssidazione;
    }

    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(int numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public double getPesoAtomico() {
        return pesoAtomico;
    }

    public void setPesoAtomico(double pesoAtomico) {
        this.pesoAtomico = pesoAtomico;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getNumeroOssidazione() {
        return numeroOssidazione;
    }

    public void setNumeroOssidazione(int numeroOssidazione) {
        this.numeroOssidazione = numeroOssidazione;
    }

    public boolean isCompatibile(Atomo altro) {
        return altro instanceof Atomo;
    }
    

    

}

