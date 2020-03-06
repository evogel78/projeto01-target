package aula01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class OlaMundo {
	
static Boolean meuBoolean;
	
	public static void main (String[] args) {
		
		int codigoPedigree=12232;
		Integer CodigoPedigree=12232;
		float pesoAnimal=50.5f;
		double precoAnimal=1800.50d;
		short alturaAnimal=95;
		long comprimentoAnimal=120;
		byte idadeAnimal=127;
		boolean temDono=true;
		boolean temDono3=true;
		
		Character letraInicialAnimal='D';
		
		String minhaString="Target";
		String minhaString1="Target Trust";
		Double wrapper=2.0;
		double primitivo=2.0;
		
		byte b=1;
		wrapper =(double) b;
		
		/*
		System.out.println(codigoPedigree);
		System.out.println(pesoAnimal);
		System.out.println(precoAnimal);
		System.out.println(alturaAnimal);
		System.out.println(comprimentoAnimal);
		System.out.println(idadeAnimal);
		System.out.println(temDono);
		System.out.println(letraInicialAnimal);
		System.out.println(codigoPedigree + CodigoPedigree);
		System.out.println(minhaString);
		System.out.println(minhaString1);
		System.out.println(wrapper);
		System.out.println(primitivo);
		System.out.println(minhaString.substring(2));
		System.out.println(minhaString.indexOf("t"));
		System.out.println(minhaString.concat(" Trust"));
		System.out.println(minhaString1.substring(9));
		BigDecimal valorCheio=new BigDecimal("150.97");
		BigDecimal dezPorCentoDoValor=valorCheio.multiply(new BigDecimal("0.1"));
		System.out.println(dezPorCentoDoValor.setScale(2, RoundingMode.HALF_EVEN));
		System.out.println(meuBoolean); */
		/*Double r = om.soma(4d, 5d);
		System.out.println(r);
		r = om.subtracao(4d, 5d);
	    System.out.println(r);
		r = om.divisao(4d, 0d);
		System.out.println(r);
		om.imprimeNaTelaBoaNoite();
		om.imprimeNaTelaBoaNoite1("Boa noite 1 !");
		*/
		
		
		
		
		
		
		
		
		
					
		
		OlaMundo om = new OlaMundo();

		om.verificaAprovacao(om.calculaMedia(om.soma(om.soma(Double.valueOf(om.lerTeclado()), Double.valueOf(om.lerTeclado())), Double.valueOf(om.lerTeclado()))));
		
		
	}

	
	private void verificaAprovacao(Double media) {
		if (media>=7) {
			System.out.println("Média= " + media + " Resultado: APROVADO");
			return;
		}
		System.out.println("Média= " + media + " - Resultado: REPROVADO");
	}
	
	
	
	
	private void imprimeNaTelaBoaNoite1(String mensagem) {
	
		System.out.println(mensagem);
	}

	public Double soma(Double d1, Double d2) {
	
			return d1+d2;
	
	}
	
	public Double subtracao(Double d1, Double d2) {
		
		return d1-d2;
	}
	
	public Double calculaMedia(Double d1) {
		
	    BigDecimal bd = BigDecimal.valueOf(d1/3);
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
	    return bd.doubleValue();

	}
	
	public Double divisao(Double d1, Double d2) {
		
		return d1/d2;
	}
	
	private void imprimeNaTelaBoaNoite() {
		System.out.println("Boa noite!");
	}
	
	
	public String lerTeclado() {
		
		Scanner entradaConsole = new Scanner(System.in);
		
		return entradaConsole.next();
	
	}
	


}
		
		/* <modificador de acesso>
			-private
			-public
			-protected
			-package
			
		   <tipo de retorno>
		   
		   	<nome do method>
		
		*/
		
		
	
		
		

	

