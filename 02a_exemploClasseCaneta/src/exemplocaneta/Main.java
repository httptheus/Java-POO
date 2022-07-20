package exemplocaneta;

public class Main {

	public static void main(String[] args) {
		
		Caneta caneta1 = new Caneta(); //Criando uma instância de objeto da classe Caneta.
									   //caneta1 é uma variável do tipo Caneta recebendo as propriedades da classe 'Caneta'.	
		
		caneta1.tampada = false; //Atribuindo um novo valor para o atributo 'tampada'. (diferente do que está na classe modelo)
		caneta1.escrever(); //O método escrever da instância é chamado. Retornará 'false', pois o atributo tampada está setado como 'false'
							//o que implicará que o teste lógico do método retornará o resultado de falso.
	}

}
