package Aula3;

public class Equacao2Grau {

	double a, b, c, delta, x1, x2;
	
	public void calcularDelta(double pa, double pb, double pc) {
		
		a = pa;
		b = pb;
		c = pc;
		
		delta = Math.pow(-b, 2) - 4*a*c;
	}
	
	public void calcularRaiz() {
		
		if(delta>=0) {
			x1 = (-b + Math.sqrt(delta)) / 2*a;
			x2 = (-b - Math.sqrt(delta)) / 2*a;
			
			System.out.println("As raízes da equação são " + x1 + " e " + x2);
		} else
			System.out.println("Não existem raizes reais");
	}
}
