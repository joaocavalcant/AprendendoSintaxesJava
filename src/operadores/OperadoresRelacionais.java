package operadores;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		/*Os operadores relacionais são utilizados em 
		 * quesitos de comparação exemplo:
		 * == igual a 
		 * != diferente de 
		 * > maior que
		 * < menor que
		 * <= menor ou igual 
		 * >= maior ou igual
		 * */
		
		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
		
		if (numero1 < numero2) {
			System.out.println("a nossa condicao é verdadeira");
		} 
		
		else {
			System.out.println("a nossa condicao é falsa");
		}
		
		System.out.println("numero1 é igual a numero2? " + simNao);
	
		simNao = numero1 != numero2;
		
		System.out.println("numero1 é diferente de numero2? " + simNao);
		
		simNao = numero1 > numero2;
		
		System.out.println("numero1 é maior que numero2? " + simNao);
	}
}
