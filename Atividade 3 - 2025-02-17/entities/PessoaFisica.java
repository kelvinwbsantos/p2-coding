package entities;

public class PessoaFisica extends Contribuinte {
    private double gastosComSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double calcularImposto() {
        double imposto = 0;

        if (getRendaAnual() < 20000.00) {
            imposto = getRendaAnual() * 0.15;
        } else {
            imposto = getRendaAnual() * 0.25;
        }

        if (gastosComSaude > 0) {
            imposto -= gastosComSaude * 0.50;
        }

        return imposto;
    }
}
