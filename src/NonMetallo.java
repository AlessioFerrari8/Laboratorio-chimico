public class NonMetallo extends Atomo {

    public NonMetallo() {
    }

    public NonMetallo(int numeroAtomico, double pesoAtomico, String simbolo, int numeroOssidazione) {
        super(numeroAtomico, pesoAtomico, simbolo, numeroOssidazione);
    }

    @Override
    public double getPesoAtomico() {
        return numeroAtomico * simbolo.length();
    }

    @Override
    public boolean isCompatibile(Atomo altro) {
        return super.isCompatibile(altro);
    }

    



    
}
