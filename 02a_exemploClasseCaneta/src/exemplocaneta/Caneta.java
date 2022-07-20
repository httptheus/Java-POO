package exemplocaneta;

public class Caneta {
	String modelo = "Bic";		//Características/Atributos de classe.
	String cor = "Azul";		//Características/Atributos de classe.
	double ponta = 0.8;			//Características/Atributos de classe.
	int carga = 100;			//Características/Atributos de classe.
	boolean tampada = false;	//Características/Atributos de classe.
	
	//Todas as características ditam o estado atual de um objeto instanciado, o que pode mudar
	//conforme a execução de um programa.
	
	public boolean escrever() { //Ações de objeto (método)
		if (tampada == true ) {
			System.out.println("A caneta de modelo " + modelo + " de cor " + cor + " está escrevendo.");
			return true;
		} else {
			System.out.println("Impossível escrever: a caneta deve estar destampada.");
			return false;
		}
	
	}
}
