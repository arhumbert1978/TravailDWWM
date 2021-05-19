package hello_world;
import java.util.*;

public class la_fourchette {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Random rp= new Random();
		int cont=0;
		int rep;
		
		int nb;
		
		int min=0;
		int max=100;
		
		nb= rp.nextInt(101);
			
		
		
		System.out.println(nb);
		do {
			System.out.println("Veuillez saisir un nombre entre " + min + " et " + max + " S'il Vous Plait");
			Scanner sc=new Scanner(System.in);
			rep=sc.nextInt();
			
			
			
			
		}while(rep != nb);
	
	}

}
