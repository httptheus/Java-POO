package exemplocaneta;

public class Caneta {
	String modelo = "Bic";		//Caracter�sticas/Atributos de classe.
	String cor = "Azul";		//Caracter�sticas/Atributos de classe.
	double ponta = 0.8;			//Caracter�sticas/Atributos de classe.
	int carga = 100;			//Caracter�sticas/Atributos de classe.
	boolean tampada = false;	//Caracter�sticas/Atributos de classe.
	
	public boolean escrever() { //A��es de objeto (m�todo)
		if (tampada == true ) {
			System.out.println("A caneta de modelo " + modelo + " de cor " + cor + " est� escrevendo.");
			return true;
		} else {
			System.out.println("Imposs�vel escrever: a caneta deve estar destampada.");
			return false;
		}
	
	}
}
