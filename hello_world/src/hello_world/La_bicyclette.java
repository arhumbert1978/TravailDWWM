package hello_world;
import java.util.Scanner;
public class La_bicyclette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reponse;
		String vel;
		
		System.out.println("Est-ce qu'il fait beau? o/n");
		Scanner sc = new Scanner(System.in);
		reponse = sc.nextLine();
		reponse=reponse.toLowerCase();
		if (reponse.equals("o"))
		{
			System.out.println("Est-ce que mon v�lo est en bon �tat de fonctionement? o/n");
			vel=sc.nextLine();
			vel=vel.toLowerCase();
		if(vel.equals("o"))
		{
			System.out.println("Je vais faire une promenade � v�lo.");
		}else if (vel.equals("n")) 
		{
			
			System.out.println("Est-ce que le garagiste peut le r�parer?o/n");
			String gar=sc.nextLine();
			gar=gar.toLowerCase();
			if (gar.equals("o")) 
			{
				System.out.println("Je vais faire une promenade � v�lo.");
			}else {
				System.out.println("J'rais donc ceuillir des joncqs.");
			}
		}
		}else {
			System.out.println("Est-ce que j'ai mon livre de Game of Thrones?");
			String gt =sc.nextLine();
			if (gt.equals("o"))
			{
			System.out.println("Je vais lire Game of Thrones");	
			}
			else if (gt.equals("n"))
			{
			System.out.println("Est-ce que la biblioth�que municipale a Game of Thrones?");
			String biblio=sc.nextLine();
			if (biblio.equals("o")) 
			{
				System.out.println("Je vais lire Game of Thrones");	
			}else 
			{
			System.out.println("Je vais donc emprunt� un roman policier. ");	
			}
			}
		}
	}
	}
	
			