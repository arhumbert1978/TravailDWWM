package hello_world;
import java.util.*;

public class jeux_012_version_switch_case_fonctionel {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int compt=0;
		int nbutil;
		int nbordi;
		int ptsutil=0;
		int ptsordi=0;
		int resultat;
		Scanner sc=new Scanner(System.in);
		
		Random ran= new Random();
		
		
		do {
		System.out.println("Veuillez saisir le chiffre 0,1 ou 2.");
		
		nbutil = sc.nextInt();
		
		nbordi=ran.nextInt(3);
		
		resultat=nbutil-nbordi;
		resultat = Math.abs(resultat);
		System.out.println(resultat);
		
		switch(resultat)
		{
		
		case 0 :
		{
			sc.nextLine();
			System.out.println("D�sol� personne ne marque de points !!!!!");
			System.out.println("ORDI : "+ptsordi);
			System.out.println("HUMAIN : "+ptsutil);
			compt++;
			System.out.println(compt);
			break;
		}
		
		case 1 :
		{
			
			if (nbutil<nbordi) 
			{
				sc.nextLine();
				System.out.println("Vous marqu� un point !!!:!!!!!!");
				ptsutil=ptsutil+1;
				System.out.println("ORDI : "+ptsordi);
				System.out.println("HUMAIN : "+ptsutil);	
				compt++;	
				System.out.println(compt);
			}else if(nbutil>nbordi)
			{
				sc.nextLine();
				System.out.println("Perdu l'ordinateur a marqu� un point !!!:!!!!!!");
				ptsordi=ptsordi+1;
				System.out.println("ORDI : "+ptsordi);
				System.out.println("HUMAIN : "+ptsutil);
				compt++;
				System.out.println(compt);
			}
			break;
			
		}
		case 2 :
		{
			if (nbutil>nbordi) 
			{
				sc.nextLine();
				System.out.println("Vous marqu� un  point !!!:!!!!!!");
				ptsutil=ptsutil+1;
				System.out.println("ORDI : "+ptsordi);
				System.out.println("HUMAIN : "+ptsutil);
				compt++;
				System.out.println(compt);
			}else if(nbutil<nbordi)
			{
				sc.nextLine();
				System.out.println("Perdu l'ordinateur a marqu� un point !!!:!!!!!!");
				ptsordi=ptsordi+1;
				System.out.println("ORDI : "+ptsordi);
				System.out.println("HUMAIN : "+ptsutil);
				compt++;
				System.out.println(compt);
			}
			break;
			
		}	
		default:	
			break;
		}
		
		}while(nbutil>=0 && compt<10 );
		sc.nextLine();
		System.out.println("C'EST FINI");
		System.out.println("------------------");
		System.out.println("ORDI : "+ptsordi);
		System.out.println("HUMAIN : "+ptsutil);
		
			sc.close();
	}
}
