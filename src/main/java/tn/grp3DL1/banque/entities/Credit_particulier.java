package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CPA")

public class Credit_particulier extends Crédit implements Serializable {

	public Credit_particulier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Credit_particulier(Long id, String typ, Long duree_echeance, 
			Long montant_crédit, Long echeance_mois,
			List<Client> clients) {
		super(id, typ, duree_echeance, montant_crédit, echeance_mois, clients);
		// TODO Auto-generated constructor stub
	}

	
	

}
