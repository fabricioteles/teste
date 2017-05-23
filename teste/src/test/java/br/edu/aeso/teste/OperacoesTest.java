package br.edu.aeso.teste;

import org.junit.Assert;
import org.junit.Test;

import br.edu.aeso.teste.Operacoes;

public class OperacoesTest {

	@Test
	public void somaTest() {
		Operacoes op = new Operacoes(3,3);
		int ret = op.soma();
		Assert.assertEquals(4, ret);
	}
	
	@Test
	public void subTest() {
		Operacoes op = new Operacoes(5,3);
		int ret = op.subtracao();
		Assert.assertEquals(2, ret);
	}
	
	@Test
	public void divTest(){
		Operacoes op = new Operacoes(5, 2);
		double ret = op.divisao();
		Assert.assertEquals(2,5, ret);
	}
	
	@Test
	public void mulTest(){
		Operacoes op = new Operacoes(5, 5);
		double ret = op.multiplicacao();
		Assert.assertEquals(10.0, ret);
	}

}
