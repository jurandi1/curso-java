package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; //sempre colocar a letra L para definir o tipo long
		
		// Tipos numéricos reais
		float salario = 11_445.44F; //sempre colocar a letra F para definir o tipo float
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // || true
		
		// Tipo caractere
		char status = 'A'; //ativo
		
		// Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println("Número de viagens: " + numeroDeVoos / 2);
		
		// Pontos por Real
		System.out.println("Pontos por Real: " + pontosAcumulados / vendasAcumuladas);
		
		// id
		System.out.println("O funcionário de id: " + id + " ganha R$" + salario);

		// Férias?
		System.out.println("Férias? " + estaDeFerias);
		
		//Ativo?
		System.out.println("Ativo? " + status);
		
	}

}
