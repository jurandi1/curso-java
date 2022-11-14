package classe;

public class Data {
	
	int dia;
	String mes;
	int ano;
	
	Data() {
//		dia = 1;
//		mes = "Janeiro";
//		ano = 1970;
		this(05, "Janeiro", 2001);
	}
	
	
	public Data(int dia, String mes, int ano) {
		this.dia = dia; // usando o this para acesar a variável da instância
		this.mes = mes;
		this.ano = ano;
	}


	//Principal
	String obterDataFormatada() {
		final String formato = "%d de %s de %d \n";
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
	
}
