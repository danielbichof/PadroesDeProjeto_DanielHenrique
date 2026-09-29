public class VidaFactory implements IApoliceFactory {
    private double capitalSegurado;
    private String cpf;
    private String RH;


    public VidaFactory(String segurado, double capitalSegurado, String cpf, String RH){
        this.capitalSegurado = capitalSegurado;
        this.cpf = cpf;
        this.RH = RH;
    }

    @Override
    public Apolice emitir() {
        return new ApoliceVida(segurado,);
    }
}
