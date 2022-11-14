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
		return String.format("%d de %s de %d \n", this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
	
}
