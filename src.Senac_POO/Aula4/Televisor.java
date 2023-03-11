package Aula4;

public class Televisor {

	int canal = 1; // inicia em 1 e vai até 16
	int volume; // inicia em 0 e vai até 10 
	boolean ligado; // inicia em desligado ou false
			
	void aumentarVolume() {
		// Aumenta em 1 o volume 
		if(volume >= 0 && volume <= 10) {
			volume++;
		} else {
			System.out.println("Impossivel aumentar \n");
		}
	}
	void reduzirVolume() {
		// Diminui em 1 o volume
		if(volume >= 1 && volume <= 10) {
			volume--;
		} else {
			System.out.println("Impossivel reduzir \n");
		}
	}
	void subirCanal() {
		// Aumenta em 1 o canal
		if(canal >= 1 && canal <= 10) {
			canal++;
		} else {
			System.out.println("Impossivel subir canal \n");
		}
	}
	void descerCanal() {
		// Diminui em 1 o canal
		if(canal > 1 && canal <= 10) {
			canal--;
		} else {
			System.out.println("Impossivel subir canal \n");
		}
	}
	void ligarTelevisor() {
		// Liga a televisão
		if(ligado == false) {
			ligado = true;
		} else {
			System.out.println("Televisor já ligado \n");
		}
	}
	void desligarTelevisor() {
		// Desliga a televisão 
		if(ligado == true) {
			ligado = false;
		} else {
			System.out.println("Televisor já ligado \n");
		}
	}
	void mostraStatus() {
		// Dizer qual o canal, o volume e se o televisor está ligado
		System.out.println("\n Canal: " + canal 
						+ "\n Volume: " + volume
						+ "\n Está Ligado ? " + ligado);
	}
}
