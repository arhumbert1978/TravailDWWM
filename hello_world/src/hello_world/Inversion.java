package hello_world;

import java.util.Scanner;

public class Inversion {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		float nb1;
		float nb2;
		float temp;
		int pos;
		
		
		String str1;
		String str2;
		String saisie;
		
		System.out.println("Veuillez saisir deux nombres sépareés par un espace");
		Scanner sc= new Scanner(System.in);
		
		saisie=sc.nextLine();
		pos=saisie.indexOf(" ");
		System.out.println(pos);
	
		str1=saisie.substring(0, pos);
		str2=saisie.substring(pos+1,saisie.length());
		System.out.println(str1);
		System.out.println(str2);
		
		nb1 = Float.valueOf(str1).floatValue();
		nb2 = Float.valueOf(str2).floatValue();
		System.out.println(nb1);
		System.out.println(nb2);
		temp=nb1;
		System.out.println(temp);
		nb1=nb2;
		System.out.println(nb1);
		nb2=temp;
		System.out.println(nb2);
	
	}

}
