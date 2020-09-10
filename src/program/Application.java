package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de operações fiscais desejadas: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {			
			System.out.println("Operação fiscal #" + i + ": ");
			System.out.print("Individual ou Empresa (i/e)? ");
			char ind = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Imposto Anual: ");
			double rendaAnual = sc.nextDouble();
			
			if (ind == 'i') {
				System.out.print("Gastos com saúde: ");
				double gastoSaude = sc.nextDouble();
								
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));				
			} else {
				
				System.out.print("Número de funcionários: ");
				int numFuncionarios = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));				
			}
			
		}
		
		System.out.println();
		System.out.println("Taxas a serem pagas:");
		
		double sum = 0.0;
		for (Pessoa p : list) {
			System.out.println(p);
			
			sum += p.calculoImposto();
		}
		
		System.out.printf("Total Taxas: $ %.2f", sum );
		
		

	}

}
