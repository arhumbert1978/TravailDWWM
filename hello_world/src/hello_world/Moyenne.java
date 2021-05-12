package hello_world;
import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nb1;
		float nb2;
		int pos;
		float moy;
			
		String str1;
		String str2;
		String saisie;
		
		
		String rep;
		
		do {
		System.out.println("Veuillez saisir deux nombres sépareés par un espace");
		Scanner sc= new Scanner(System.in);
		
		saisie= sc.nextLine();
		pos=saisie.indexOf(" ");
		System.out.println(pos);
	
		str1=saisie.substring(0, pos);
		str2=saisie.substring(pos+1,saisie.length());
		System.out.println(str1);
		System.out.println(str2);
		
		nb1 = Float.valueOf(str1).floatValue();
		nb2 = Float.valueOf(str2).floatValue();
		
		moy=(nb1+nb2)/2;
		
		System.out.println("La moyenne des deux nombres est de : "+moy);
		System.out.println("Voulez-vous recommencez? o/n");
		rep=sc.nextLine();
		rep=rep.toLowerCase();
		
		
		}while(rep.equals("o"));
		
		if (rep.equals("n"))
		{
		
			System.out.println("Au revoir à bientôt");
			
		}
		
		
	}

}
