package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Compte implements Serializable   {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int livret_compteN;
	protected String numeroCompte;
//compte
	@Temporal (TemporalType.DATE)
	protected Date   date_ouverture;
	protected String nom;
	protected String prenom;
	
	@Temporal (TemporalType.DATE)
	protected Date date_naissance;
	
	protected String Adresse;
	protected int tel;
	protected String cin;
	protected double solde;
	
	@ManyToOne
	private Agence agence;
	
	@ManyToOne
	private Client client;
	
	@OneToMany(mappedBy="compte",fetch=FetchType.LAZY)
	private List <Operation> operations;
	 
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	



	public Compte(int livret_compteN, String numeroCompte, Date date_ouverture, String nom, String prenom,
			Date date_naissance, String adresse, int tel, String cin, double solde, Agence agence, Client client,
			List<Operation> operations) {
		super();
		this.livret_compteN = livret_compteN;
		this.numeroCompte = numeroCompte;
		this.date_ouverture = date_ouverture;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		Adresse = adresse;
		this.tel = tel;
		this.cin = cin;
		this.solde = solde;
		this.agence = agence;
		this.client = client;
		this.operations = operations;
	}







	public int getLivret_compteN() {
		return livret_compteN;
	}
	public void setLivret_compteN(int livret_compteN) {
		this.livret_compteN = livret_compteN;
	}
	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public Date getDate_ouverture() {
		return date_ouverture;
	}
	public void setDate_ouverture(Date date_ouverture) {
		this.date_ouverture = date_ouverture;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	
	
	
}
