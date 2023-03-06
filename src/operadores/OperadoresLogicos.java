package operadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		/* Os operadores logicos são utilizados para 
		 * realizar a verificacao das condicoes em true ou 
		 * false*/
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		//a condicao 1 e a condicao 2 tem de ser verdadeiras
		if (condicao1 && condicao2) {
			System.out.println("as duas condicoes sao verdadeiras");
		}
		
		else {
			System.out.println("as duas condicoes não sao verdadeiras");
		}
		
		if (condicao1 && (7 > 4)) {
			System.out.println("as duas condicoes sao verdadeiras");
		}
		
		else {
			System.out.println("as duas condicoes não sao verdadeiras");
		}
		
		// a condicao 1 ou a condicao 2 tem de ser verdadeira
		if (condicao1 || condicao2) {
			System.out.println("as duas condicoes sao verdadeiras");
		}
		
		else {
			System.out.println("as duas condicoes não sao verdadeiras");
		}
	}
}
