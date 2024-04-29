package entities;

public class Aliquota_IRPF {
	
	public static final double VALOR_DEPENDENTE = 189.59;
	
	public static double deducaoDependente(double salarioBruto, int numeroDependente) {
		return salarioBruto - numeroDependente * VALOR_DEPENDENTE;
	}
	public static double aliquota(double salarioBruto, int numeroDependente) {
		double deducao = deducaoDependente(salarioBruto, numeroDependente);
		if (deducao <= 1903.98) {
			return 0.00;
		} 
		else if (deducao <= 2826.65) {
			return deducao * 0.075 - 142.80;
		}
		else if (deducao <= 3751.05) {
			return deducao * 0.15 - 354.80;
		}
		else if (deducao <= 4664.68) {
			return deducao * 0.225 - 636.13;
		}
		else {
			return deducao * 0.275 - 869.36;
		}
	}
}
