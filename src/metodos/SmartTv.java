package metodos;

public class SmartTv {
	
	// a classe possui 3 caracteristicas que são a nivel da classe
	
	//Toda a classe pode ter acesso a todos esses atributos
	
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void aumentarVolume() {
		volume ++;
	}
	
	public void diminuirVolume() {
		volume --;
	}
	
	public void mudarCanal (int novoCanal) {
		canal = novoCanal;
	}
	
	public void aumentarCanal() {
		canal++;
	}

	public void diminuirCanal() {
		canal--;
	}
	
	
	
	
}
