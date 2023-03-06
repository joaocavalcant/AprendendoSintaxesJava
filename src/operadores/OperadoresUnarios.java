package operadores;

import java.util.Iterator;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int numero = 5;
		
		numero = - numero;
		
		System.out.println( numero);
		
		numero = + numero * -1;
		
		System.out.println(numero);
		
		/* Para realizar o incremento do valor de uma var
		 * iavel dentro do sysout devemos colocar o operador
		 * unario de incremento ++ antes do nome da variavel*/ 
		
		System.out.println(++ numero);
		
		/* Para realizar o decremento do valor de uma var
		 * iavel dentro do sysout devemos colocar o operador
		 * unario de decremento -- antes do nome da variavel*/
		
		System.out.println(-- numero);
		
		/*Para modificar o valor definido de uma variavel booleana 
		 * utilizamos o '!' antes assim, mesmo que ela seja
		 * definida como true ela terá seu valor modificado 
		 * para false*/
		
		boolean variavel = true;
		
		System.out.println(!variavel);
		
		System.out.println(variavel);
		
		/*Porém ela só sera modificada uma unica vez, para
		 * tornar essa variavel false devemos definir o valor dela
		 * igual a ela mesma com o unario '!' na frente*/
		
		variavel = !variavel;
		
		System.out.println(variavel);
		
	
	}
}
