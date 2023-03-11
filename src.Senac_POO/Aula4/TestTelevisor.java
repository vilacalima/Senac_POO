package Aula4;

import java.util.Scanner;

public class TestTelevisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Televisor televisor = new Televisor();
		boolean exit = false;
		
		do {
			System.out.println("Teste Televisor "
							+"\n 1 - Aumentar volume"
							+"\n 2 - Diminuir volume"
							+"\n 3 - Subir Canal"
							+"\n 4 - Descer Canal"
							+"\n 5 - Ligar Televisor"
							+"\n 5 - Desligar Televisor");
			
			int option = input.nextInt();
			if(option == 1) {
				televisor.aumentarVolume();
				televisor.mostraStatus();
			} else if(option == 2) {
				televisor.reduzirVolume();
				televisor.mostraStatus();
			} else if(option == 3) {
				televisor.subirCanal();
				televisor.mostraStatus();
			} else if(option == 4) {
				televisor.descerCanal();
				televisor.mostraStatus();
			}else if(option == 5) {
				televisor.ligarTelevisor();
				televisor.mostraStatus();
			}else if(option == 6) {
				televisor.desligarTelevisor();
				televisor.mostraStatus();
				exit = true;
			}
		} while(!exit);

	}

}
