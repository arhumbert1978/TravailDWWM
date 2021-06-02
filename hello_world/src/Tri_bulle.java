import java.util.Random;

public class Tri_bulle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		int [] montab=new int [10];
		Random alea=new Random();
		int taille=montab.length;
		int temp=0;
		
		
		for (int i = 0; i < montab.length; i++) 
		{
		
			
			montab[i]=alea.nextInt(101);
			
			
		}
		
		
		for (int i = 0; i < montab.length; i++) 
		{
		
			
		System.out.print(montab[i]+" ");
			
			
		}	
		for (int i = 0; i < taille; i++) 
		{
		
			for (int j = 1; j <taille-i; j++) 
			{
			
				if (montab[j-1]>montab[j])
				{
				//utilisation de la variable temporaire pour inverser d'ou les premiers exercices et leur utilité
					temp=montab[j-1];
					montab[j-1]=montab[j];
					montab[j]=temp;
					
				}
				
			}
			
			
		}
		System.out.println();
		
		for (int i = 0; i < montab.length; i++) 
		{
		
			
		System.out.print(montab[i]+" ");
			
			
		}	

		for (int i = 0; i < taille; i++) 
		{
		
			for (int j = 1; j <taille-i; j++) 
			{
			
				if (montab[j-1]<montab[j])
				{
				//utilisation de la variable temporaire pour inverser d'ou les premiers exercices et leur utilité
					temp=montab[j-1];
					montab[j-1]=montab[j];
					montab[j]=temp;
					
				}
				
			}
			
			
		}
System.out.println();
		
		for (int i = 0; i < montab.length; i++) 
		{
		
			
		System.out.print(montab[i]+" ");
			
			
		}	
	}

}
