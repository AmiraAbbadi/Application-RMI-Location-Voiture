package locationvoiture;
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
	public static void main (String [] args) {
		try{
		interfaceVoiture iv = (interfaceVoiture) Naming.lookup ("rmi://localhost:1099/MyObject");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("donner votre choix");
			int c =sc.nextInt();
			switch (c){
			case 1 : VoitureLoc v = new VoitureLoc(3,"kia","rouge", 180 ,10 ,"Disponible");
			         String result = iv.AjouterVoiture(v);
			         System.out.println (result);
			         break ;
			case 2 : System.out.println("donner la marque de voiture qui vous avez chercher ");
			         String marque  =sc.nextLine();
			         int res = iv.RechercheVoiture(marque);
			         System.out.println (res);
			         break ;

			case 3 : System.out.println("donner l'id de voiture pour vérifier leur préférence");
			         int id = sc.nextInt();
			         String resl = iv.VerifPréférence(id);
			         System.out.println (resl);
			         break ;

			case 4 : float prixelve = iv.PlusCher();
			         System.out.println (prixelve);
			         break ;
			case 6 : System.out.println("donner  le nombre de jour de location de la voiture");
			         int nbrjloc = sc.nextInt();
			         System.out.println("donner l'id de voiture pour la location");
			         int idv = sc.nextInt();
			         System.out.println("donner la date de location ");
			         String dateloc  =sc.nextLine();
			         System.out.println("donner la date de retoure de voiture ");
			         String dateretour  =sc.nextLine();
			         String infovoitureloc = iv.DuréeLoc(idv, nbrjloc,dateloc,dateretour);
			         System.out.println (infovoitureloc);
			         break ;
			case 5 :  System.out.println("donner l'id de voiture pour la location");
			         int idloc = sc.nextInt();
			         String infovoitloc  = iv.ValiderReservation(idloc);
			         System.out.println (infovoitloc);
			         break ;
			default: System. out.println("Choix non valide!");
			
			
			}
		}

		}
		catch (Exception e) {
		System.out.println ("Erreur d’accès à l’objet distant.");
		System.out.println (e.toString());
		}}


}
