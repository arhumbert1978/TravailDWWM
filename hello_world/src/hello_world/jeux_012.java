package hello_world;
import java.util.*;
public class jeux_012 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int compt=0;
		int nbutil;
		int nbordi;
		int pts;
		int ptsordi;
		int resultat;
		
		Random ran= new Random();
		
		
		do {
			
			System.out.println("Bonjour veuillez saisir le chiffre 0,1 ou 2.");
			Scanner sc = new Scanner(System.in);
			nbutil = sc.nextInt();
			
			nbordi=ran.nextInt(3);
			
			
			
			System.out.println("Le nombre tir? par l'ordinateur est : "+nbordi);
			
			if (nbutil-nbordi==2)
			{
			
				if (nbutil>nbordi)
				{
				
					pts=2;
					System.out.println("Vous avez marqu? deux points BRAVO!!!!! ");
					compt++;
				}else 
				{
					ptsordi=2;
					System.out.println("L'ordinateur a marqu? deux points");
					compt++;
				}
				
			}
			
			
			if (nbutil-nbordi==1)
			{
			
				if (nbutil<nbordi)
				{
				
					pts=1;
					System.out.println("Vous avez marqu? un point BRAVO!!!!! ");
					compt++;
				}else 
				{
					ptsordi=1;
					System.out.println("L'ordinateur a marqu? un point");
					compt++;
				}
				
			}
			
			if (nbutil-nbordi==0) 
			{
			
				System.out.println("Personne ne marque de points D?sol? :-)");
				compt++;
			}
			
			
		} while (compt == 10 || nbutil < 0);
		
		if (nbutil>nbordi)
		{
		
			System.out.println("Vous avez gagn? " +nbutil +" points contre "+nbordi +"points!!! BRAVO ");
		
		}else 
		{
			
			System.out.println("Vous avez perdu " +nbutil +" points contre "+nbordi +"points!!! DESOLE ");
			
		}
		
		
	}

}
