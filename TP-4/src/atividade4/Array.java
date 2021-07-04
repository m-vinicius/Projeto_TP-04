package atividade4;

public class Array {
	public int [] arrayA = new int[10];	// Atributo arrayA
	public int [] arrayB = new int[10];    // Atributo arrayB
	
	//m�todos get
	public int [] getArrayA(){
		return this.arrayA;
	}
	
	public int [] getArrayB() {
		return this.arrayB;
	}
	//m�todos set
	
	public void SetArrayA (int[] arrayA) {
		this.arrayA = arrayA;
	}
	
	public void SetArrayB (int [] arrayB) {
		this.arrayB = arrayB;
	}
	
	//m�todos para alterar o valor da posi��o dos arrays
	
	public void setArrayANaPosicao(int valor, int posicao) {
		arrayA[posicao] = valor;
		
		//Verifica��o entrada arrayA
		if (posicao < 0 || posicao > 9) {
			System.out.println("Essa posi��o est� fora do arrayA");
			return;
			}
	}
	
	public void setArrayBNaPosicao(int valor, int posicao) {
		arrayB[posicao] = valor;
		
		//Verific��o entrada arrayB
		if (posicao < 0 || posicao > 9) {
			System.out.println("Essa posi��o est� fora do arrayB");
			return;
			}
	}
	
	//M�todo que calcula e imprime a divis�o de dois n�meros
	
	
	public void calcula(int a, int b) {
		//Tratamento de exce��o
		try {
		int r = a/b; // r = resultado!!
		System.out.println("Valor da divis�o:" + r);
		}catch (ArithmeticException e){
			System.out.println("N�o pode ser dividido por 0.");	
			}
			
	}
	
	public void CalculaDivisaoArrays() {
		
	}
	
	
	}

