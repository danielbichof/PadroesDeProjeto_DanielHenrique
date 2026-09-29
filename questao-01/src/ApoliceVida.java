public class ApoliceVida extends  Apolice{
    public final double TAXA_ANUAL = 0.03;

    private double capitalSegurado;
    private String cpf;
    private String RH;

    public ApoliceVida(String segurado, double capitalSegurado, String cpf, String RH) {
        super(segurado);
        this.capitalSegurado = capitalSegurado;
        this.cpf = cpf;
        this.RH = RH;
    }

    @Override
    public double calcularPremioMensal() {
        return this.capitalSegurado * TAXA_ANUAL / 12.0;
    }

    @Override
    public String emitir() {
        return "";
    }
}
