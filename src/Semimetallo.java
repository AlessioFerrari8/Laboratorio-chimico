public class Semimetallo extends Atomo {
    public Semimetallo() {
    }
    public Semimetallo(int numeroAtomico, double pesoAtomico, String simbolo, int numeroOssidazione) {
        super(numeroAtomico, pesoAtomico, simbolo, numeroOssidazione);
    }
    @Override
    public double getPesoAtomico() {
        return numeroAtomico / 2.0;
    }

    @Override
    public boolean isCompatibile(Atomo altro) {
        return super.isCompatibile(altro);
    }


}
