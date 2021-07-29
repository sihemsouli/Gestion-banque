package tn.grp3DL1.banque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.grp3DL1.banque.Repository.CredParRepository;
import tn.grp3DL1.banque.entities.Credit_particulier;
import tn.grp3DL1.banque.entities.Crédit;
import tn.grp3DL1.banque.entities.Pack1;

@Service
public class CredParServiceImpl implements ICredParService {
	@Autowired
	CredParRepository credParRepository;

	@Override
	public Credit_particulier ajouterCredPar(Credit_particulier c1) {
		
		c1.setEcheance_mois(c1.getMontant_crédit()/c1.getDuree_echeance());
		return credParRepository.save(c1);
	}
	
	@Override
	public List<Credit_particulier> afficherAllCredPar() {
		return credParRepository.findAll();
	}

	@Override
	public Credit_particulier modifierCredPar(Long id, String typ, Long duree_echeance,
			Long montant_crédit,Long echeance_mois) {

		Credit_particulier c1 = credParRepository.findById(id).get();
		c1.setTyp(typ);
		c1.setDuree_echeance(duree_echeance);
		c1.setMontant_crédit(montant_crédit);
		c1.setEcheance_mois(c1.getMontant_crédit()/c1.getDuree_echeance());
		credParRepository.save(c1);
		return c1;
	}
	
	@Override
	public void supprimerCredPar(Long id) {
		credParRepository.deleteById(id);		
	}

	@Override
	public Credit_particulier afficherOneCredPar(Long id) {
		return credParRepository.findById(id).get();
	}
	
	
	

}
