package exemplocaneta;

public class Main {

	public static void main(String[] args) {
		
		Caneta caneta1 = new Caneta(); //Criando uma inst�ncia de objeto da classe Caneta.
									   //caneta1 � uma vari�vel do tipo Caneta recebendo as propriedades da classe 'Caneta'.	
		
		caneta1.tampada = false; //Atribuindo um novo valor para o atributo 'tampada'. (diferente do que est� na classe modelo [isso consta nas diferen�as mudan�as de estado que um objeto pode ter])
		caneta1.escrever(); //O m�todo escrever da inst�ncia � chamado. Retornar� 'false', pois o atributo tampada est� setado como 'false'
							//o que implicar� que o teste l�gico do m�todo retornar� o resultado de falso.
	}

}
