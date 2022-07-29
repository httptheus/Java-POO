package b02;

public class Caneta {
	private String modelo;
	private String cor;
	private int carga;
	private boolean tampada;
	
	@Override
	public String toString() {
		return "\nCaneta [modelo=" + modelo + ", cor=" + cor + ", carga=" + carga + ", tampada=" + tampada + "] \n";
	}

	public Caneta(String modelo, String cor, int carga, boolean tampada) {
		this.modelo = modelo;
		this.cor = cor;
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
	
	public void recarregarTinta(int valorRecarga) {
		System.out.println("Recarregando caneta! [+" + valorRecarga + "]");
		this.carga += valorRecarga;
	}
}
