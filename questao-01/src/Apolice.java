public abstract class Apolice {
    protected String segurado;

    public Apolice(String segurado) {
        this.segurado = segurado;
    }

    public abstract double calcularPremioMensal();
    public abstract String emitir();
}
