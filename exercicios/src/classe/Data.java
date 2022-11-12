package classe;

public class Data {
	
	int dia;
	String mes;
	int ano;
	//Principal
	String obterDataFormatada() {
		return String.format("%d de %s de %d \n", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
}
