package locationvoiture;

import java.io.Serializable;

public class VoitureLoc implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id ;
	public static int  NombreVoituresDisponibles =1;
	private String marque ;
	private String couleur ;
	private float  prixParJour ;
	private float  Consommation ;
	private String Dispo ;
	private int nbrjloc ;
	private String datedebutloc ;
	private String datefinloc ;
	
	public VoitureLoc() {
		super();
	}
	
	
	public VoitureLoc(int id, String marque, String couleur, float prixParJour, float consommation, String dispo) {
		super();
		this.id = id;
		this.marque = marque;
		this.couleur = couleur;
		this.prixParJour = prixParJour;
		Consommation = consommation;
		Dispo = dispo;
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNombreVoituresDisponibles() {
		return NombreVoituresDisponibles;
	}
	public void setNombreVoituresDisponibles(int nombreVoituresDisponibles) {
		NombreVoituresDisponibles = nombreVoituresDisponibles;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public float getPrixParJour() {
		return prixParJour;
	}
	public void setPrixParJour(float prixParJour) {
		this.prixParJour = prixParJour;
	}
	public float getConsommation() {
		return Consommation;
	}
	public void setConsommation(float consommation) {
		Consommation = consommation;
	}
	public String getDispo() {
		return Dispo;
	}

	public void setDispo(String dispo) {
		Dispo = dispo;
	}


	public int getNbrjloc() {
		return nbrjloc;
	}
	public void setNbrjloc(int nbrjloc) {
		this.nbrjloc = nbrjloc;
	}


	public String getDatedebutloc() {
		return datedebutloc;
	}


	public void setDatedebutloc(String datedebutloc) {
		this.datedebutloc = datedebutloc;
	}


	public String getDatefinloc() {
		return datefinloc;
	}


	public void setDatefinloc(String datefinloc) {
		this.datefinloc = datefinloc;
	}
	
	

}
