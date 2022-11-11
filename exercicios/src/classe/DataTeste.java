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
		
		System.out.printf("Primeira data: %d de %s %d \n", d1.dia, d1.mes, d1.ano);
		System.out.printf("Segunda data: %d de %s %d ", d2.dia, d2.mes, d2.ano);
		
	}
}
