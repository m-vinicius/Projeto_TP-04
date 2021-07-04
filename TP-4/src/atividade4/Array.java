package atividade4;

public class Array {
	public int [] arrayA = new int[10];	// Atributo arrayA
	public int [] arrayB = new int[10];    // Atributo arrayB
	
	//métodos get
	public int [] getArrayA(){
		return this.arrayA;
	}
	
	public int [] getArrayB() {
		return this.arrayB;
	}
	//métodos set
	
	public void SetArrayA (int[] arrayA) {
		this.arrayA = arrayA;
	}
	
	public void SetArrayB (int [] arrayB) {
		this.arrayB = arrayB;
	}
	
	//métodos para alterar o valor da posição dos arrays
	
	public void setArrayANaPosicao(int valor, int posicao) {
		arrayA[posicao] = valor;
		
		//Verificação entrada arrayA
		if (posicao < 0 || posicao > 9) {
			System.out.println("Essa posição está fora do arrayA");
			return;
			}
	}
	
	public void setArrayBNaPosicao(int valor, int posicao) {
		arrayB[posicao] = valor;
		
		//Verificção entrada arrayB
		if (posicao < 0 || posicao > 9) {
			System.out.println("Essa posição está fora do arrayB");
			return;
			}
	}
	
	//Método que calcula e imprime a divisão de dois números
	
	
	public void calcula(int a, int b) {
		//Tratamento de exceção
		try {
		int r = a/b; // r = resultado!!
		System.out.println("Valor da divisão:" + r);
		}catch (ArithmeticException e){
			System.out.println("Não pode ser dividido por 0.");	
			}
			
	}
	
	public void CalculaDivisaoArrays() {
		
	}
	
	
	}

