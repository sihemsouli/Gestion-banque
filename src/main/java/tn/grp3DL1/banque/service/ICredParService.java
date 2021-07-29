package tn.grp3DL1.banque.service;

import java.util.List;

import tn.grp3DL1.banque.Repository.CredParRepository;
import tn.grp3DL1.banque.entities.Credit_particulier;

public interface ICredParService {
	
	public	List<Credit_particulier> afficherAllCredPar();

	public	void supprimerCredPar(Long id);

	public	Credit_particulier ajouterCredPar(Credit_particulier c1);

	public Credit_particulier modifierCredPar(Long id, String typ, Long duree_echeance,
			
			Long montant_crédit, Long echeance_mois);


	public	Credit_particulier afficherOneCredPar(Long id);
	
}
