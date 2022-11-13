package classe;

public class Data {
	
	int dia;
	String mes;
	int ano;
	
	Data() {
		dia = 1;
		mes = "Janeiro";
		ano = 1970;
	}
	
	
	public Data(int dia, String mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}


	//Principal
	String obterDataFormatada() {
		return String.format("%d de %s de %d \n", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
}
