package locationvoiture;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
public class Serveur {
	public static void main(String []args)
	{
		try {
			LocateRegistry.createRegistry(1099);
		
		GestionVoiture v =new GestionVoiture();
		Naming.rebind("MyObject",v);
		} catch (Exception v) {
			v.printStackTrace();
		}}

}



