package b03;

public class Main03b {

	public static void main(String[] args) {
		//Instanciando um objeto da classe 'Caneta' a partir de seu construtor.
		Caneta c1 = new Caneta("Bic", "Vermelho", 1.5, 100, true);
		
		//A partir daqui, veremos que simplesmente podemos acessar
		//os atributos setados como 'public', como modelo e cor. E
		//ponta, carga e tampada não. Observe:
		
		c1.modelo = "Faber Castell";	//Acessando e modificando o atributo fora do escopo
										//da classe de origem.
		
		c1.cor = "Azul";				//Acessando e modificando o atributo fora do escopo
										//da classe de origem.
		
		System.out.println(c1.toString());			//Executando este syso até este momento, mostrará
													//que as alterações e acessos as informações, uma vez 
													//públicas, são totalmente possíveis.
		
		//A partir daqui, fazer um acesso de elementos internos privados
		//não serão permitidos. Isso porque a visibilidade desses elementos são 
		//visíveis apenas para sua classe de origem.
		
		//Essa lógica também é a mesma para os métodos de classe.
		
//		c1.ponta = 1.5;			//A própria IDE avisará que não é possível realizar
								//acesso a um elemento não visível fora de sua classe.
		
//		c1.carga = 80;		//Já com protected, apesar de estar visível apenas para sua
								//classe de origem e de quem o herda, é totalmente possível
								//realizar a conversão. Isso porque o arquivo Main, onde 
								//criamos a instância 'c1', possui acesso aos componentes 
								//definidos da classe, isso inclui as variáveis definidas 
								//como protegidas.
		
		//Método Setter: uma vez que tampada está como private, não podemos mudar seu estado
		//diretamente no arquivo Main, por conta da sua visibilidade.
		
		//Mas os métodos 'tampar()' e 'destampar()', no arquivo fonte da classe Caneta, está
		//configurado como 'public', o que significa que podemos alterar o estado e atributos
		//privados das nossas instâncias através destes métodos!
		
		c1.destampar();
		c1.escrever();
	}

}
