package entities;

public class PessoaFisica extends Pessoa {

	private Double gastoSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double calculoImposto() {

		double calcImposto = 0.0;

		if (getRendaAnual() > 20000.0) {
			calcImposto = getRendaAnual() * 0.25;
		} else {
			calcImposto = getRendaAnual() * 0.15;
		}
		
		if (getGastoSaude() > 0.0) {
			calcImposto -= getGastoSaude() * 0.5;
		}

		return calcImposto;

	}

}
