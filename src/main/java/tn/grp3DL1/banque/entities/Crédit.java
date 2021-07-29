package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE",length=4)
public class Crédit implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String typ;
	private Long duree_echeance;
	private Long montant_crédit;
	private Long echeance_mois;
	
	
	@OneToMany(mappedBy="crédit",fetch= FetchType.LAZY)
	private List <Client> clients;
	
	public Crédit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Crédit(Long id, String typ, Long duree_echeance, Long montant_crédit,
			Long echeance_mois,
			List<Client> clients) {
		super();
		this.id = id;
		this.typ = typ;
		this.duree_echeance = duree_echeance;
		this.montant_crédit = montant_crédit;
		this.echeance_mois = echeance_mois;
		this.clients = clients;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getTyp() {
		return typ;
	}


	public void setTyp(String typ) {
		this.typ = typ;
	}

	public List<Client> getClients() {
		return clients;
	}


	public void setClients(List<Client> clients) {
		this.clients = clients;
	}


	public Long getDuree_echeance() {
		return duree_echeance;
	}

	public void setDuree_echeance(Long duree_echeance) {
		this.duree_echeance = duree_echeance;
	}

	public Long getMontant_crédit() {
		return montant_crédit;
	}

	public void setMontant_crédit(Long montant_crédit) {
		this.montant_crédit = montant_crédit;
	}

	public Long getEcheance_mois() {
		return echeance_mois;
	}

	public void setEcheance_mois(Long echeance_mois) {
		this.echeance_mois = echeance_mois;
	}

	

	
}
