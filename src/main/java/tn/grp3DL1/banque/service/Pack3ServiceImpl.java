package tn.grp3DL1.banque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.grp3DL1.banque.Repository.Pack3Repository;
import tn.grp3DL1.banque.entities.Pack3;

@Service
public class Pack3ServiceImpl implements IPack3Service {

	@Autowired
	Pack3Repository pack3Repository; 
	
	@Override
	public Pack3 ajouterPack3(Pack3 p3) {
		return  pack3Repository.save(p3);

	}

	@Override
	public Pack3 modifierPack3(Long id,Long cmpt_depot, Long cmpt_epargne,Long crt_liberte,
			Long cmpt_distance,Long assurance,Long crt_visaGold) {

		Pack3 p1 = pack3Repository.findById(id).get();
		p1.setCmpt_depot(cmpt_depot);
		p1.setCmpt_epargne(cmpt_epargne);
		p1.setCrt_liberte(crt_liberte);
		p1.setCmpt_distance(cmpt_distance);
		p1.setAssurance(assurance);
		p1.setCrt_visaGold(crt_visaGold);
		pack3Repository.save(p1);
		return p1;
	}

	@Override
	public void supprimerPack3(Long id) {
		pack3Repository.deleteById(id);		
		
	}

	@Override
	public List<Pack3> afficherAllPack3() {
		
		return pack3Repository.findAll();

	}

	@Override
	public Pack3 afficherOnePack3(Long id) {
		return pack3Repository.findById(id).get();

	}

}
