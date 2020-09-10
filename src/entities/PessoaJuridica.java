package entities;

public class PessoaJuridica extends Pessoa {
	private Integer numFuncionarios;

	public PessoaJuridica(){
		super();
	}	

	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double calculoImposto() {
		
		double calcImposto = 0.0;

		if (numFuncionarios > 10) {
			calcImposto = getRendaAnual() * 0.14;
		} else {
			calcImposto = getRendaAnual() * 0.16;
		}

		return calcImposto;
	}	
	
}
