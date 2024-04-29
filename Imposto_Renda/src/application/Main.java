package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aliquota_IRPF;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário (bruto): ");
		double salarioBruto = sc.nextDouble();
		System.out.println("Digite o número de dependentes: ");
		int dependentes = sc.nextInt();
		
		double imposto = Aliquota_IRPF.aliquota(salarioBruto, dependentes);
		
		if (imposto == 0.00 ) {
			System.out.println("VOCÊ ESTÁ ISENTO");
		}
		else {
		System.out.printf("O IMPOSTO A SER PAGO É R$ %.2f%n", imposto);
		}
		sc.close();
		
		
	}

}
