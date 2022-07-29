package b02;

public class b02Main {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("Bic", "Vermelho", 40, false);
		
		System.out.println(c1.toString());
		c1.escrever();
		System.out.println(c1.toString());
		
		System.out.println(c1.toString());
		c1.escrever();
		System.out.println(c1.toString());
		
		System.out.println(c1.toString());
		c1.escrever();
		System.out.println(c1.toString());
		
		//Atributo carga igual a zero. Caíra em 'false' no teste lógico do método.
		System.out.println(c1.toString());
		c1.escrever();
		System.out.println(c1.toString());
		
		//Recarregando a tinta da caneta e escrevendo.
		c1.recarregarTinta(100);
		System.out.println(c1.toString());
		c1.escrever();
	}

}
