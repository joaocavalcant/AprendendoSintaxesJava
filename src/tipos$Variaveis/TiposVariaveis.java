package tipos$Variaveis;

public class TiposVariaveis {
	public static void main(String[] args) {
		double salarioMinimo = 2500;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;
		
		/*-----------Constantes---------------*/
		
		/* As constantes são valores armazenados em memória
		 * que não podem ser modificados depois de declarados
		 * em Java esses valores são representados pela palavra
		 * reservada "final" todas as contantes são 
		 * representadas totalmente em letra maiuscula
		 */
		
		/* representacao de uma variavel*/
		int numero = 5;
		
		numero = 10;
		
		System.out.println(numero);
		
		final double VALOR_DE_PI = 3.14;
		
		
	}
}
