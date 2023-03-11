package Aula5;

import java.util.Scanner;

public class Midia {

	private int codigo;
	private double preco;
	private  String nome;
	
	/*
	 * Get and Set
	 * */
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/* 
	 * Construtor Midia
	 * */
	public Midia() { }

	/* 
	 * Construtor Midia
	 * @param int c
	 * @param double p
	 * @param String n 
	 * */
	public Midia(int c, double p, String n){
		this.codigo = c;
		this.preco = p;
		this.nome = n;
	}
	
	/* 
	 * Retorna uma String com o nome da Classe
	 * */
	private String getTipo() {
		return "MIDIA";
	}
	
	/* 
	 * Retorna uma String com as informações contidas nos atributos
	 * */
	private String getDetalhe() {
		
		String detalhe = "\n Código: " + getCodigo()
						+ "\n Nome: " + getNome()
						+ "\n Preço: " + getPreco();
		return detalhe;
	}
	
	/* 
	 * Imprime as informações contidas nos campos da classe
	 * */
	public void imprimeDado() {
		System.out.println("\n ------------------ Dados da " + getTipo() + " ------------------");
		
		System.out.println(getDetalhe());
		
		System.out.println("\n ------------------------------------------------------");
	}
	
	/* 
	 * Insere os dados necessários para preencher os atributos da classe - utilize a classe Scanner
	 * */
	public void insereDado() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o código: ");
		setCodigo(input.nextInt());
		
		System.out.println("Insira o nome: ");
		setNome(input.next());;
		
		System.out.println("Insira o preço: ");
		setPreco(input.nextDouble());;
	}
}
