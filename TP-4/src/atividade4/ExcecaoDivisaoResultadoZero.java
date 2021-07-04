package atividade4;

public class ExcecaoDivisaoResultadoZero extends Array{
	
	public void calcula(int a, int b) {
		int r = a/b;
		if(r == 0) {
			throw new ArithmeticException("Resultado 0 não é permitido!");
		}
	}

}
