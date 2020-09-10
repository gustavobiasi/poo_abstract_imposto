package entities;

public abstract class Pessoa {
	
	private String nome;
	private Double rendaAnual;
	
	public Pessoa(){
		
	}

	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double calculoImposto();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(nome + ": $ " + String.format("%.2f", calculoImposto()));
		
		return sb.toString(); 
	}
	
	
}
