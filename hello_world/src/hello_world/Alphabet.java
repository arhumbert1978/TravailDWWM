package hello_world;

import java.util.Iterator;
import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) 
	{

	char alpha='a';
	String phrase;	
	//String repl;
	int Posfin;
	String chaine;	
	
	Scanner sc = new Scanner(System.in);
	int compteur=0;
	do {
	System.out.println("Veuillez saisir une phrase SVP");
	
	phrase=sc.nextLine();
	Posfin=phrase.length();
	chaine =phrase.substring(Posfin-1, Posfin);
	} while (phrase.length()<120 && chaine.equals("."));
	
	
	
	
	
	
	phrase=phrase.replace('�', 'e');
	phrase=phrase.replace('�', 'e');
	phrase=phrase.replace('�', 'e');
	phrase=phrase.replace('�', 'e');
	phrase=phrase.replace('�', 'a');
	phrase=phrase.replace('�', 'a');
	phrase=phrase.replace('�', 'a');
	phrase=phrase.replace('�', 'a');
	phrase=phrase.replace('�', 'o');
	phrase=phrase.replace('�', 'o');
	phrase=phrase.replace('�', 'i');
	phrase=phrase.replace('�', 'i');
	phrase = phrase.replaceAll("\\s+","");
	
	
	System.out.println(phrase);
	
	for (int i = 1; i < 27; i++) 
	{
		
		
		
		for (int j = 0; j < phrase.length(); j++) 
		{
		
			if (phrase.charAt(j)==alpha)
			{
			
				compteur++;
				
			}
		
		
		}

		System.out.println("Il y a "+compteur+" occurences de "+alpha+" dans la phrase.");
		alpha++;
		compteur=0;
	
	}
sc.close();
}
}
