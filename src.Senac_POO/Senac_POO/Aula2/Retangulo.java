package Senac_POO.Aula2;

import java.util.Scanner;

public class Retangulo {

	double base, altura, area;
	
	void entrarBaseAltura() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Base: ");
		base = input.nextDouble();
		
		System.out.println("Altura: ");
		altura = input.nextDouble();
	}
	
	public void calcularAreaRetangulo() {
		entrarBaseAltura();
		area = base*altura;
		System.out.println("Area retangulo: " + area);
	}
}
