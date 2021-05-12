package hello_world;

import java.util.Scanner;

public class Travail {

	public static void main(String[] args) {
		
		String ReponseUtilisateur;
		
		System.out.println("Est-ce qu'il fera beau demain?");		
		Scanner sc= new Scanner(System.in);
		
		ReponseUtilisateur=sc.nextLine().toLowerCase();
		
	System.out.println(ReponseUtilisateur);
		
		// TODO Auto-generated method stub
if (ReponseUtilisateur.equals("oui")) {

	System.out.println("J'irais planter mes tulipes");
	System.out.println("J'arrache les mauvaises herbes");
}else
{

	System.out.println("Je reste sur mon canapé à la maison");
}

	
sc.close();

}

	
	
	
}
