package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 05;
		d1.mes = "Janeiro";
		d1.ano = 2001;
		
		Data d2 = new Data();
		d2.dia = 19;
		d2.mes = "Fevereiro";
		d2.ano = 2002;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}
}
