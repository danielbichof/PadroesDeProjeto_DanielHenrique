public class ApoliceImovel extends Apolice {
    public final double TAXA_ANUAL = 0.15;

    private double vlrImovel;
    public ApoliceImovel(String segurado, double valorImovel) {
        super(segurado);
        this.vlrImovel = valorImovel;
    }

    @Override
    public double calcularPremioMensal() {
        return this.vlrImovel * TAXA_ANUAL / 12.0;
    }

    @Override
    public String emitir() {
        return "Imovel. Segurado: " + this.segurado + " Premio mensal: " + calcularPremioMensal();
    }
}
