package b03;

public class Main03b {

	public static void main(String[] args) {
		//Instanciando um objeto da classe 'Caneta' a partir de seu construtor.
		Caneta c1 = new Caneta("Bic", "Vermelho", 1.5, 100, true);
		
		//A partir daqui, veremos que simplesmente podemos acessar
		//os atributos setados como 'public', como modelo e cor. E
		//ponta, carga e tampada n�o. Observe:
		
		c1.modelo = "Faber Castell";	//Acessando e modificando o atributo fora do escopo
										//da classe de origem.
		
		c1.cor = "Azul";				//Acessando e modificando o atributo fora do escopo
										//da classe de origem.
		
		System.out.println(c1.toString());			//Executando este syso at� este momento, mostrar�
													//que as altera��es e acessos as informa��es, uma vez 
													//p�blicas, s�o totalmente poss�veis.
		
		//A partir daqui, fazer um acesso de elementos internos privados
		//n�o ser�o permitidos. Isso porque a visibilidade desses elementos s�o 
		//vis�veis apenas para sua classe de origem.
		
		//Essa l�gica tamb�m � a mesma para os m�todos de classe.
		
//		c1.ponta = 1.5;			//A pr�pria IDE avisar� que n�o � poss�vel realizar
								//acesso a um elemento n�o vis�vel fora de sua classe.
		
//		c1.carga = 80;		//J� com protected, apesar de estar vis�vel apenas para sua
								//classe de origem e de quem o herda, � totalmente poss�vel
								//realizar a convers�o. Isso porque o arquivo Main, onde 
								//criamos a inst�ncia 'c1', possui acesso aos componentes 
								//definidos da classe, isso inclui as vari�veis definidas 
								//como protegidas.
		
		//M�todo Setter: uma vez que tampada est� como private, n�o podemos mudar seu estado
		//diretamente no arquivo Main, por conta da sua visibilidade.
		
		//Mas os m�todos 'tampar()' e 'destampar()', no arquivo fonte da classe Caneta, est�
		//configurado como 'public', o que significa que podemos alterar o estado e atributos
		//privados das nossas inst�ncias atrav�s destes m�todos!
		
		c1.destampar();
		c1.escrever();
	}

}
