import java.util.*;

import hello_world.ClearScreen;


public class Tri_tab1 {

	public static void main(String[] args) 
	{

		int [] montab=new int [10];
		Random alea=new Random();
		
		
		
		
		for (int i = 0; i < montab.length; i++) 
		{
		
			
			montab[i]=alea.nextInt(101);
			
			
		}
		
		
		for (int i = 0; i < montab.length; i++) 
		{
		
			
		System.out.print(montab[i]+" ");
			
			
		}	
		
		
		
	//	for (int i = 0; i < montab.length-1; i++) 
		//{
		
			//int ind=i;
			//for (int j = 0; j < montab.length; j++) 
			//{
			
				//if (montab[j]<montab[ind]) 
				//{
				
					//ind=j;
					
			//	}
				
	//		}
		//	int minimum=montab[ind];
			//montab[ind]=montab[i];
			//montab[i]=minimum;
			
			
		//}
		for (int i = 0; i < montab.length-1; i++) 
		{
		int ind=i;
			for (int j = i+1; j < montab.length; j++)
			{
			
				if(montab[j]<montab[ind]) 
				{
					
					ind=j;
				}
				int temp=montab[ind];
				montab[ind]=montab[i];
				montab[i]=temp;
				
			}
			
			
		}
		
		
	System.out.println();
	
	for (int i = 0; i < montab.length; i++) 
	{
	
		
	System.out.print(montab[i]+" ");
		
		
	}	
	}

}
