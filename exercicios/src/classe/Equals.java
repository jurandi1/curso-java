package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Jurandi Junior";
		u1.email = "jurandijr20@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Jurandi Junior";
		u2.email = "jurandijr20@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		//System.out.println(new Date());
	}
}
