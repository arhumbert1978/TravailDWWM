package Pal1drome;
import java.util.*;

public class Pal1drome_test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String mot;
	
		Scanner sc = new Scanner(System.in);
		
		boolean test=true;
				
		String mot2;
		
		
		
		
		int debut;
		int fin;
		
		int taille;
		
		System.out.println("Nous allons tester un mot pour voire si il est un palindrome");
		System.out.println("------------------------------------------------------------");
		System.out.println("----------Veuillez saisir un mot s'il vous plait?-----------");
		
		mot=sc.nextLine();
		
		debut=0;
		fin=mot.length()-1;
		
		while (debut<fin && test==true) 
		{
		if (mot.charAt(debut)!=mot.charAt(fin))
		{
			
			test=false;
			
		}
			debut++;
			fin--;
			
		}
		if (test==true)
		{
			System.out.println("C'est un palindrome!");
		} else
		{
			System.out.println("Ce n'est pas un palindrome!");

		}
		
	}

}
