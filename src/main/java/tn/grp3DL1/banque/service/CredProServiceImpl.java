package tn.grp3DL1.banque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.grp3DL1.banque.Repository.CredParRepository;
import tn.grp3DL1.banque.Repository.CredProRepository;
import tn.grp3DL1.banque.entities.Credit_particulier;
import tn.grp3DL1.banque.entities.Credit_professionnel;

@Service
public class CredProServiceImpl implements ICredProService{

	@Autowired
	CredProRepository credProRepository;
	
	@Override
	public Credit_professionnel ajouterCredPro(Credit_professionnel c2) {
		c2.setEcheance_mois(c2.getMontant_crédit()/c2.getDuree_echeance());
		return credProRepository.save(c2);
	}

	
	@Override
	public List<Credit_professionnel> afficherAllCredPro() {
		return credProRepository.findAll();
	}

	@Override
	public Credit_professionnel modifierCredPro(Long id, String typ, Long duree_echeance, Long montant_crédit,
			Long echeance_mois) {
		Credit_professionnel c2 = credProRepository.findById(id).get();
		c2.setTyp(typ);
		c2.setDuree_echeance(duree_echeance);
		c2.setMontant_crédit(montant_crédit);
		c2.setEcheance_mois(c2.getMontant_crédit()/c2.getDuree_echeance());
		credProRepository.save(c2);
		return c2;
	}
	
	@Override
	public void supprimerCredPro(Long id) {
		credProRepository.deleteById(id);
	}

	@Override
	public Credit_professionnel afficherOneCredPro(Long id) {
		return credProRepository.findById(id).get();
	}

}
