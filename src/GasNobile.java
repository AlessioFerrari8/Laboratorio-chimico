public class GasNobile extends Atomo {
    public GasNobile() {
    }
    public GasNobile(int numeroAtomico, double pesoAtomico, String simbolo, int numeroOssidazione) {
        super(numeroAtomico, pesoAtomico, simbolo, numeroOssidazione);
    }
    @Override
    public double getPesoAtomico() {
        return 1.0 / numeroAtomico;
    }

    @Override
    public boolean isCompatibile(Atomo altro) {
        return super.isCompatibile(altro);
    }
    
}
