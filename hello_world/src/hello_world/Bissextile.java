package hello_world;
import java.util.Scanner;
public class Bissextile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String rep;
int annee;
rep="o";


Scanner sc2= new Scanner(System.in);

do {
	
	System.out.println("Quelle ann�e voulez-vous testez?");
	Scanner sc = new Scanner(System.in);

	annee = sc.nextInt();
	

	if (annee % 4 == 0) {

		if (annee % 100 == 0) {
			if (annee % 400 == 0) {

				System.out.println("L'ann�e est bissextile");
			} else {
				System.out.println("L'ann�e n'est pas bissextile");
			}

		} else {
			System.out.println("L'ann�e est bissextile");
		}

	} else {
		System.out.println("L'ann�e n'est pas bissextile");
	}

	System.out.println("Voulez-vous continuer?");
	rep = sc2.nextLine().toLowerCase();
	ClearConsole();
		
} while (rep.equals("o"));
	}


public static void ClearConsole(){
    try{
        String operatingSystem = System.getProperty("os.name") ;//Check the current operating system
          
        if(operatingSystem.contains("Windows")){        
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
            Process startProcess = pb.inheritIO().start();
            startProcess.waitFor();
        } else {
            ProcessBuilder pb = new ProcessBuilder("clear");
            Process startProcess = pb.inheritIO().start();

            startProcess.waitFor();
        } 
    }catch(Exception e){
        System.out.println();
    }
}
}
