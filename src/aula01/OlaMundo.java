package aula01;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
		
	
		
		Character letraInicialAnimal='D';
		
		String minhaString="Target";
		String minhaString1="Target Trust";
		Double wrapper=2.0;
		double primitivo=2.0;
		
		byte b=1;
		wrapper =(double) b;
		
		
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
		
		System.out.println(meuBoolean);
		
		
		
		
		
		
	
		
		
	}
	
}