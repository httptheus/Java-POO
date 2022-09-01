//Seguindo diagrama de classes da aula 03b e definindo a visibilidade.

package b03;

public class Caneta {	//Classe 'caneta'. O molde de inst�ncia de objetos 'caneta' no arquivo principal.
	public String modelo;					//Definindo visibilidade dos atributos seguindo o diagrama de classes.
	public String cor;						//Definindo visibilidade dos atributos seguindo o diagrama de classes.
	private double ponta;					//Definindo visibilidade dos atributos seguindo o diagrama de classes.
	protected int carga;					//Definindo visibilidade dos atributos seguindo o diagrama de classes.
	private boolean tampada;				//Definindo visibilidade dos atributos seguindo o diagrama de classes.
	
	@Override
	public String toString() {
		return "\nCaneta [modelo=" + modelo + ", cor=" + cor + ", carga=" + carga + ", tampada=" + tampada + "] \n";
	}
	
	//Definindo voisibilidades dos m�todos de classe. tampar() e destampar() s�o m�todos protegidos,
	//o que significa que s�o vis�vieis paenas para a classe de origem e seus herdeiros.
	
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
				System.out.println("A caneta de modelo '" + modelo + "', cor " + cor + " est� escrevendo! [Carga atual: " + carga + "%]");
			} else {
				System.out.println("[ERRO] Imposs�vel escrever. Verifique a carga da caneta e se ela est� destampada e tente novamente.");
			}	
		}

	}
	
	public void tampar() {
		if (this.tampada == false) {
			this.tampada = true;
		} else {
			System.out.println("A caneta j� est� tampada.");
		}
	}
	
	public void destampar() {
		if (this.tampada == true) {
			this.tampada = false;
		} else {
			System.out.println("A caneta j� est� destampada!");
		}
	}
}