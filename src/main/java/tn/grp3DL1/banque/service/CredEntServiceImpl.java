package tn.grp3DL1.banque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.grp3DL1.banque.Repository.CredEntRepository;
import tn.grp3DL1.banque.entities.Credit_entreprise;

@Service
public class CredEntServiceImpl  implements ICredEntService{

	@Autowired
	CredEntRepository credEntRepository; 
	
	@Override
	public Credit_entreprise ajouterCredEnt(Credit_entreprise c3) {
		c3.setEcheance_mois(c3.getMontant_crédit()/c3.getDuree_echeance());
		return credEntRepository.save(c3);
	}
	
	@Override
	public List<Credit_entreprise> afficherAllCredEnt() {
		return credEntRepository.findAll();
	}

	
	@Override
	public Credit_entreprise modifierCredEnt(Long id, String typ, Long duree_echeance, Long montant_crédit,
			Long echeance_mois) {
		Credit_entreprise c3 = credEntRepository.findById(id).get();
		c3.setTyp(typ);
		c3.setDuree_echeance(duree_echeance);
		c3.setMontant_crédit(montant_crédit);
		c3.setEcheance_mois(c3.getMontant_crédit()/c3.getDuree_echeance());
		credEntRepository.save(c3);
		return c3;
	}
	@Override
	public void supprimerCredEnt(Long id) {
		credEntRepository.deleteById(id);		
	}

	@Override
	public Credit_entreprise afficherOneCredEnt(Long id) {
		return credEntRepository.findById(id).get();
	}

}
