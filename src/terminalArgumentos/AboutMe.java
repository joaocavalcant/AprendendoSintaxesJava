package terminalArgumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
	public static void main(String[] args) {
		//criando o objeto scanner que vai obter os dados digitados
		//pelo usuario
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	
		System.out.println("Digite seu nome");
		String nome = scanner.next();
		
		System.out.println("Digite seu sobrenome");
		String sobrenome = scanner.next();
		
		System.out.println("Digite sua idade");
		String idade = scanner.next();

		System.out.println("Digite sua altura");
		String altura = scanner.next();
		
		System.out.println("Olá eu me chamo " + nome + " " + sobrenome);
		
		System.out.println("Tenho " + idade + " anos");
		
		System.out.println("E tenho " + altura + " m de altura");
		
	
	
	
	}
}
