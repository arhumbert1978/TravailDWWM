package hello_world;
import java.text.*;
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ConvertisseurTemperature {

	private static BigDecimal tk;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("CONVERTISSEUR DEGR? CELCIUS ET DEGR? FAHRENHEIT");
		System.out.println("----------------------------------------------------------");
		Scanner sc =new Scanner(System.in);
		char mode =' ';
		String test="";
		String rep;

		do {



			do {


				System.out.println("Choisissez le mode de conversion ! ");

				System.out.println(" 1 - Convertisseur Celcius --> Fahrenheit ");
				System.out.println(" 2 - Convertisseur Fahrenheit --> Celcius ");

				test= sc.nextLine();

				mode=test.charAt(0);

				System.out.println(test.length());

				if (mode!='1' &&  mode!='2' &&  test.length()>1)
				{ 

					System.out.println(" Mode inconnu !!! veuillez reit?rer l'operation");

				}

			} while ((mode!='1'  &&  mode!='2') ||  test.length()>1); 

			//DecimalFormat modele= new DecimalFormat("0.00");
			if (mode=='1') {

				System.out.println("veuillez entrer la temperature en celcius ? convertir?");
				double a=sc.nextDouble();
				double s=(a*9)/5 +32;
				nombreArrondi(s);
				//String  result=modele.format(s);
				System.out.println("Temperature equivalente en fahrenheit : "+s );



			}
			else 
			{
				System.out.println("veuillez entrer la temperature en Fahrenheit ? convertir?");
				double f=sc.nextDouble();
				double c= (f-32 )*5/9;
				nombreArrondi(c);
				//String result2 =modele.format(c);
				System.out.println("Temperature equivalente en Celcius : "+c );


			}
			sc.nextLine();
			System.out.println("Voulez-vous convertir une autre temp?rature ? O /N ");

			rep=sc.nextLine();

		} while ( rep.charAt(0)=='o' && rep.length()<2 );


		System.out.println("programme termin?!");
sc.close();

	}
	
	public static double nombreArrondi( double nb)
	{
		DecimalFormat modele= new DecimalFormat("0.00");
		String result=modele.format(nb);
		
	 double nbarrondis=Double.valueOf(nb).doubleValue();
	 return nbarrondis;
		
	}






}