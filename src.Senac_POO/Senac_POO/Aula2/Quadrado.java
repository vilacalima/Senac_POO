package Senac_POO.Aula2;

import java.util.Scanner;

public class Quadrado {
	
	//Definindo o atributo
	double lado, area;
	
	//void para não ter retorno
	//Método não recebe nada 
	void entrarLado() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lado: ");
		lado = input.nextDouble();
	}
	
	//Método para calcular a área
	public void calcularArea() {
		entrarLado();
		
		area = lado * lado;
		System.out.println("Area: " + area);
	}
}
