public class Metallo extends Atomo {

    public Metallo() {
    }

    public Metallo(int numeroAtomico, double pesoAtomico, String simbolo, int numeroOssidazione) {
        super(numeroAtomico, pesoAtomico, simbolo, numeroOssidazione);
    }

    @Override
    public double getPesoAtomico() {
        return super.getPesoAtomico();
    }

    @Override
    public boolean isCompatibile(Atomo altro) {
        return super.isCompatibile(altro);
    }

    

    
}
