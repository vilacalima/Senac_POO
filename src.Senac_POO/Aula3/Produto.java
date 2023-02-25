package Aula3;

public class Produto {
	
	/* Atributos */
	String nome;
	double preco, valorPago, desconto;
	int quantidade;
	
	/* Métodos */
	
	public void iniciarValor(String n, int q, double p) {
		nome = n;
		preco = p;
		quantidade = q;
		
		calcularValorTotal();
	}
	
	void calcularValorTotal() {
		
		valorPago = preco * quantidade;
		
		calcularDesconto();
	}
	
	void calcularDesconto() {
		
		if(quantidade > 50) {
			desconto = valorPago * 0.25;
		} else if(quantidade >=21 && quantidade <=50) {
			desconto = valorPago * 0.20;
		} else if(quantidade >= 11 && quantidade <= 20) {
			desconto = valorPago * 0.10;
		} else if(quantidade < 10) {
			desconto = 0;
		}  
		
		mostrarProduto();
	}
	
	void mostrarProduto() {
		
		System.out.println("Descricao produto: "
						+ "\n Nome do Produto: " + nome
						+ "\n Quantidade Escolhida: " + quantidade
						+ "\n Valor Pago: " + (valorPago - desconto) 
						+ "\n Desconto: " + desconto);
	}
}
