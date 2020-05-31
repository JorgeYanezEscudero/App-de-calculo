package CalculosMatematicos;

import java.util.LinkedList;

public class MetodosMatematicos {
	
	public static LinkedList<Integer> descomposicionfactoresprimos(int denom){
		
		int factor = 2;
		LinkedList<Integer> factores=new LinkedList<Integer>();
		
		// Ultimo factor que debemos probar.
		int factorLimite = (int)Math.sqrt(denom);
		
		while (factor <= factorLimite)
		{
			// si es divisible, se añade a la lista de factores primos y se realiza la división.
			while (denom % factor == 0 )
			{
				factores.add(new Integer(factor));
				denom = denom/factor;
			}
			
			// Si no es divisible, se pasa al siguiente factor.
			if (factor==2)
				factor++;
			else
				factor+=2;
		}
		
		// si no se ha logrado la descomposición total, añadimos el último valor que queda a la lista.
		if (denom!=1)
			factores.add(new Integer(denom));
		
		return factores;
	}

	public static Fraccion dividirFracciones(Fraccion a,Fraccion b){
		
		Fraccion resultado = new Fraccion();
		
		resultado.setNumerador(a.getNumerador() * b.getDenominador());
		resultado.setDenominador(a.getDenominador()*a.getNumerador());
		return resultado;
	}
	public static Fraccion  mutiplicarFracciones(Fraccion a,Fraccion b){
		
		Fraccion resultado = new Fraccion();
		
		resultado.setNumerador(a.getNumerador() * b.getNumerador());
		resultado.setDenominador(a.getDenominador()*b.getDenominador());
		return resultado;
	}
	
	public static int minimocomunmultiplo (int num1,int num2){
		
		int mcm=1,i=2;
		while(i!=num1||i!=num2){
			if(num1%i==0||num2%i==0){
				mcm=mcm*i;
				if(num1%i==0) 
					num1=num1/i;
	            if(num2%i==0)
	            	num2=num2/i;
			}
			else
				i++;
		}
		return mcm;
	}
}
