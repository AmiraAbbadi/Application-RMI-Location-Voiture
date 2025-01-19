package locationvoiture;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interfaceVoiture extends Remote{
	public String AjouterVoiture(VoitureLoc voiture)throws RemoteException ; 
    public int RechercheVoiture (String marque)throws RemoteException ;
    public String  VerifPréférence(int id)throws RemoteException ;
    public float  PlusCher()throws RemoteException ;
    public String DuréeLoc(int id , int nbrjloc, String Ddebut , String Dretour )throws RemoteException ;
    public String  ValiderReservation(int id)throws RemoteException ;
}
