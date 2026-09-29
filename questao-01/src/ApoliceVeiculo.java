public class ApoliceVeiculo extends Apolice {
    private static final double TAXA_ANUAL = 0.08;

    private double valorFipe;
    private String CNH;
    private String CRLV;


    public ApoliceVeiculo(String segurado, double valorFipe, String cnh, String crlv) {
        super(segurado);
        this.valorFipe = valorFipe;
        this.CNH = cnh;
        this.CRLV = crlv;
    }

    @Override
    public double calcularPremioMensal() {
        return this.valorFipe * TAXA_ANUAL / 12.0;
    }

    @Override
    public String emitir() {
        return "CNH, CRLV";
    }
}
