//Seguindo diagrama de classes da aula 03b e definindo a visibilidade.

package b03;

public class Caneta {	//Classe 'caneta'. O molde de instância de objetos 'caneta' no arquivo principal.
	public String modelo;					//Definindo visibilidade dos atributos seguindo o diagrama de classes.
	public String cor;						//Definindo visibilidade dos atributos seguindo o diagrama de classes.
	private double ponta;					//Definindo visibilidade dos atributos seguindo o diagrama de classes.
	protected int carga;					//Definindo visibilidade dos atributos seguindo o diagrama de classes.
	private boolean tampada;				//Definindo visibilidade dos atributos seguindo o diagrama de classes.
	
	@Override
	public String toString() {
		return "\nCaneta [modelo=" + modelo + ", cor=" + cor + ", carga=" + carga + ", tampada=" + tampada + "] \n";
	}
	
	//Definindo voisibilidades dos métodos de classe. tampar() e destampar() são métodos protegidos,
	//o que significa que são visívieis paenas para a classe de origem e seus herdeiros.
	
	public Caneta(String modelo, String cor, double ponta, int carga, boolean tampada) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampada = tampada;
	}
	
	public void escrever() {
		if (this.tampada == false) {
			if (this.carga > 0) {
				this.carga -= 20;
				System.out.println("A caneta de modelo '" + modelo + "', cor " + cor + " está escrevendo! [Carga atual: " + carga + "%]");
			} else {
				System.out.println("[ERRO] Impossível escrever. Verifique a carga da caneta e se ela está destampada e tente novamente.");
			}	
		}

	}
	
	public void tampar() {
		if (this.tampada == false) {
			this.tampada = true;
		} else {
			System.out.println("A caneta já está tampada.");
		}
	}
	
	public void destampar() {
		if (this.tampada == true) {
			this.tampada = false;
		} else {
			System.out.println("A caneta já está destampada!");
		}
	}
}