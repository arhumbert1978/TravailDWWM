import java.util.*;
import java.util.Scanner;

public class Tp_2dimstagiaires {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer le nombre de formations de l'établissement!");
		int formations = sc.nextInt();

		sc.nextLine();
		String[][] mesFormations = new String[formations][2];

		Tp_2dimstagiaires.saisieFormation(mesFormations, formations);
		Tp_2dimstagiaires.afficherFormation(mesFormations);
		Tp_2dimstagiaires.Trier(mesFormations);
		Tp_2dimstagiaires.afficherFormation(mesFormations);
		sc.close();

	}
	
	 public static void saisieFormation(String [][] _tabf, int _nbFormation) 
	 {
		 Scanner sc2= new Scanner(System.in);
		//String [][]_tabf1= new String [_nbFormation][2];
		for (int i = 0; i < _nbFormation; i++)
		{
			System.out.println("Entrer le nom de la "+(i+1) + " formation");
			_tabf[i][0]=sc2.nextLine();
			System .out.println("Veuillez entrer l'éffectif prévu de la "+(i+1)+" formation !!");
			_tabf[i][1]=sc2.nextLine();
		}
		 
		sc2.close();
	 }
		 
	 public static void afficherFormation(String [][] _tabf)
	 {int i=0;
		 for (String[] sousTab : _tabf) {
			 
			 for (String element :  sousTab) {
				
				if (i%2==0) {
					
					System.out.print("Formation: "+element);
				} 
				else
				{
					System.out.print(" l'effectif de la formation est: "+element+" \n");
				}	
				
				i++;
				
				
			}
			 
			
		}
		 
	 }
	public static void Trier( String[][] _tabF)
     {
        
         int i=0;
         String temp=null;
         Boolean b=false;

        
         do
         {
             b = false;
             for (i = 0; i < _tabF.length - 1; i++)
             {
                 if ((Integer.parseInt(_tabF[i][1])) > (Integer.parseInt(_tabF[i + 1][ 1])))
                 {
                     temp = _tabF[i][ 1];
                     _tabF[i][ 1] = _tabF[i + 1][ 1];
                     _tabF[i + 1][ 1] = temp;
                     temp = _tabF[i] [0];
                     _tabF[i][ 0] = _tabF[i + 1] [0];
                     _tabF[i + 1] [0] = temp;
                     b = true;
                 }
             }
         } while (b == true);
     } 
}

