import java.util.Scanner;

public class Desafio1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub	
		System.out.println("Somos uma ONG 'BRISA'" );
		System.out.println("Precisamos de sua ajuda, gostaria de fazer uma doação ?");
		//String sim;
		//sim = ("OTIMO");
		//String nao;
		//nao = ("Obrigado do mesmo jeito , tenha um bom dia");
		
		Scanner leitor = new Scanner(System.in);
		String ans;
		ans = leitor.next();
		leitor.close();
		
		if ( "Yes" .equalsIgnoreCase(ans) ) 
		{
			System.out.println("OTIMO, voce disse " + ans);
			System.out.println("Digite o valor desejado : ");
			Scanner leitor1 = new Scanner(System.in);
			int money = leitor1.nextInt();
			double conver = (double)money * 5;
			System.out.println("Voce doou " + conver + " em BRL");
			leitor1.close();		
		} 
		else 
		{
			System.out.println("Obrigado do mesmo jeito , tenha um bom dia");
		}	
		
		}
		
	}
