package tn.grp3DL1.banque.service;

import java.util.List;

import tn.grp3DL1.banque.entities.Credit_entreprise;

public interface ICredEntService {
	
	public	List<Credit_entreprise> afficherAllCredEnt();

	public	void supprimerCredEnt(Long id);

	public	Credit_entreprise ajouterCredEnt(Credit_entreprise c3);

	public Credit_entreprise modifierCredEnt(Long id, String typ, Long duree_echeance,
			
			Long montant_crédit, Long echeance_mois);


	public	Credit_entreprise afficherOneCredEnt(Long id);
	
}
