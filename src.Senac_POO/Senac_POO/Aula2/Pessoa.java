package Senac_POO.Aula2;

import java.util.Scanner;

public class Pessoa {

	String nome;
	double idade, idadeComercial;
	
	void entrarNomeIdade() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome: ");
		nome = input.next();
		
		System.out.println("idade: ");
		idade = input.nextDouble();
	}
	
	public void calcularAniversario() {
		entrarNomeIdade();
		idadeComercial = idade * 360;
		System.out.println("A Idade calculada em dias do " + nome + " é " + idadeComercial);
	}
}
