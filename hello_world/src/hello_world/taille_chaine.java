package hello_world;
import java.util.*;
public class taille_chaine {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String phrase;
		String recherche;
		
		
		//int pos;
		int compt=0;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		char al='a';
		
		System.out.println("Bonjour, veuillez saisir une phrase?");
		phrase= sc.nextLine();
		
		//System.out.println("Veuillez saisir le caract?re recherch?.");
		//recherche = sc2.nextLine();
		
		char tat [] = new char[phrase.length()]; 
		
		
		//for (int i = 0; i < tat.length; i++)
		//{
		
		//tat[i]=phrase.charAt(i);	
		//System.out.print(i+" ");
		//System.out.print(tat[i]);
		//}
		for(int j=0;j<25;j++)
		for (int i = 0; i < tat.length; i++) 
		{
		
			if (tat[i]==al) 
			{
			
								compt++;
				
			}
			al++;
		}


	}
		
			
	}

