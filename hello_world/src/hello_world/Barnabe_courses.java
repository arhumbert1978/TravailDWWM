package hello_world;
import java.util.*;

public class Barnabe_courses {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		double S;
		int mag=0;
		double inter;
		//boolean retry=true;
		//String ono;
		
		
		
		

		System.out.println("Veuillez saisir le montant que Barnabe poss�de : ");
		Scanner sc=new Scanner(System.in);
		S=sc.nextDouble();
		
		//do {
		do 
		{
			
			inter=(S/2)+1;
			S=S-inter;
			mag++;
			
			
			if (S<1)
			{
				
				mag++;
				
			}
			
		} while (S>1);
		
		System.out.println("Barnab� a vist� : "+mag+" magasins");
		
		
		//sc.nextLine();
		//System.out.println("Voulez vous continueer? o/n");
		
		//ono=sc.nextLine();
		//ono.toLowerCase();
		//if(ono.charAt(0) == 'n' && ono.length() < 2)
		//{
			//retry = false;
		//}
		//}while(retry==true);
	}

		
}
