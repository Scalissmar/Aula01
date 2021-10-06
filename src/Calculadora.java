import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Programa calculadora");
		Scanner leitor = new Scanner(System.in);
		//int valor1,valor2,soma;
		int valor1;
		int valor2;
		int soma;
		int subtracao;
		double divisao;
		int multiplicacao;
		
		System.out.println("Digite o primeiro valor");
		valor1 = leitor.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = leitor.nextInt();
		
		soma = valor1 + valor2;
		System.out.println("A soma é " + soma);
		
		subtracao = valor1 - valor2;
		System.out.println("A diferença é " + subtracao);
		multiplicacao = valor1 * valor2;
		System.out.println("A multiplicação é " + multiplicacao);
		divisao = (double)valor1 / (double)valor2;
		System.out.println("A divisão é " + divisao);
		
		
	}

}
