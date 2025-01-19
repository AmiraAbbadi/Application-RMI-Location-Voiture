package locationvoiture;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


public class GestionVoiture extends UnicastRemoteObject implements interfaceVoiture{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List <VoitureLoc>ListeVoiture;
	
	
	public GestionVoiture() throws RemoteException {
		super();
	}
	@Override
	public String AjouterVoiture(VoitureLoc voiture)throws RemoteException {
		if (ListeVoiture==null)
			ListeVoiture=new ArrayList<VoitureLoc>();
		ListeVoiture.add(voiture);
		VoitureLoc.NombreVoituresDisponibles++;
		return("Vous avez ajouté "+ListeVoiture.size()+" voitures" );
	
	}
	@Override
    public int RechercheVoiture (String marque)throws RemoteException {
		
		for (int i=0; i<ListeVoiture.size(); i++)
			  
		    if(ListeVoiture.get(i).getMarque()==marque)
		     {
		    	String message ="voici la voiture de la marque "+ListeVoiture.get(i).getMarque()+""+ListeVoiture.get(i).getConsommation()+""+ListeVoiture.get(i).getCouleur()+"";
		        
		     }
		return VoitureLoc.NombreVoituresDisponibles ;
		
    }
	
	@Override
    public String  VerifPréférence(int id)throws RemoteException {
		for (int i=0; i<ListeVoiture.size(); i++)
			  
		    if(ListeVoiture.get(i).getId()==id)
		    {	
		       if (ListeVoiture.get(i).getPrixParJour()>500) {
		    	   return "Valide" ;
		       }		   
		       else	{
		    	   return "Non Valide" ;
		       }
		    }
		return "ne trouve pas" ;
    }
	@Override
    public float  PlusCher()throws RemoteException {
		float Prix=0;
		int idm=0;
		for (int i=0; i<ListeVoiture.size(); i++)
	    
	    if((ListeVoiture.get(i).getPrixParJour())>Prix)
	    {
	       Prix=ListeVoiture.get(i).getPrixParJour();
	       idm=i;
	    }
		return ListeVoiture.get(idm).getPrixParJour();
	}

    
   
	@Override
    public String DuréeLoc(int id ,int nbrjloc , String Ddebut , String Dretour)throws RemoteException {
		String msg ="" ;
		
		for (int i=0; i<ListeVoiture.size(); i++)
	  
	    if(ListeVoiture.get(i).getId()==id)
	     {
	    	ListeVoiture.get(i).setNbrjloc(nbrjloc); 
	    	ListeVoiture.get(i).setDatedebutloc(Ddebut);
	    	ListeVoiture.get(i).setDatefinloc(Dretour);
	        return  msg ="voici la voiture qui à reservé "+ListeVoiture.get(i).getMarque()+""+ListeVoiture.get(i).getConsommation()+""+ListeVoiture.get(i).getCouleur()+"";
	      }
		return msg ;
	   }
   
	@Override
    public String  ValiderReservation(int id)throws RemoteException {
		String msg ="" ;
		for (int i=0; i<ListeVoiture.size(); i++)
	  
	    if(ListeVoiture.get(i).getId()==id)
	     {
	    	ListeVoiture.get(i).setDispo("Non disponible");
	    	VoitureLoc.NombreVoituresDisponibles--;
	    	return msg ="voici la voiture qui à reservé "+ListeVoiture.get(i).getMarque()+""+ListeVoiture.get(i).getConsommation()+""+ListeVoiture.get(i).getCouleur()+"";
	        
         }
		return msg ;
		
	} 
}
