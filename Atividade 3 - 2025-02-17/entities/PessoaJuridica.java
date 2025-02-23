package entities;

public class PessoaJuridica extends Contribuinte {
    int numeroFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double calcularImposto() {
        double taxaImposto = (numeroFuncionarios > 10) ? 0.14 : 0.16;
        return getRendaAnual() * taxaImposto;
    }
}
