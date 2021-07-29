package tn.grp3DL1.banque.service;

import java.util.List;

import tn.grp3DL1.banque.entities.Credit_professionnel;


public interface ICredProService {

	public	List<Credit_professionnel> afficherAllCredPro();

	public	void supprimerCredPro(Long id);

	public	Credit_professionnel ajouterCredPro(Credit_professionnel c2);

	public Credit_professionnel modifierCredPro(Long id, String typ, Long duree_echeance,
			
			Long montant_crédit, Long echeance_mois);


	public	Credit_professionnel afficherOneCredPro(Long id);
	
}
