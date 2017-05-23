package br.edu.aeso.teste;

public class Operacoes {

	private int num1;
	private int num2;
	
	public Operacoes(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int soma() {
		return num1 + num2;
	}
	
	public int subtracao() {
		return num1 - num2;
	}
	
	public double divisao(){
		return num1 / num2;
	}
	
	public double multiplicacao(){
		return num1 * num2;
	}
	
}
