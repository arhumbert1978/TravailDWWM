package hello_world;
import java.util.Scanner;

public class cercle_sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Double Rayon;
 Double Rayon2;
 Double result;
 Double result2;
 Scanner sc = new Scanner(System.in);
   
 System.out.println("Veuillez saisir le Rayon du cercle de base");
 Rayon=sc.nextDouble();
result= Math.PI*Math.pow(Rayon, 2);
 System.out.println("L'air du cercle et de " + result);
 
 System.out.println("Veuillez saisir le Rayon de la sphère?");
 Rayon2=sc.nextDouble();
 result2=(4/3)*Math.PI*Math.pow(Rayon2, 3);
 System.out.println("L'air de la sphère est de "+result2);
 
	}

}
  