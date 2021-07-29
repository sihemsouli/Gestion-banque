package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CPR")
public class Credit_professionnel extends Crédit implements Serializable {

	public Credit_professionnel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Credit_professionnel(Long id, String typ, Long duree_echeance, Long montant_crédit, Long echeance_mois,
			List<Client> clients) {
		super(id, typ, duree_echeance, montant_crédit, echeance_mois, clients);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	

}
