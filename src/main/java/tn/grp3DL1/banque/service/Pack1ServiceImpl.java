package tn.grp3DL1.banque.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.grp3DL1.banque.Repository.Pack1Repository;
import tn.grp3DL1.banque.entities.Pack1;


@Service
public class Pack1ServiceImpl implements IPack1Service {
	
	@Autowired
	Pack1Repository pack1Repository; 

	private static final Logger l = LogManager.getLogger(Pack1ServiceImpl.class);

	@Override
	public Pack1 ajouterPack1(Pack1 p1) {
	
		return  pack1Repository.save(p1);
	}

	@Override
	public Pack1 modifierPack1(Long id,Long cmpt_depot, Long cmpt_epargne,
			Long crt_liberte,Long cmpt_distance,Long assurance) {

		Pack1 p1 = pack1Repository.findById(id).get();
		p1.setCmpt_depot(cmpt_depot);
		p1.setCmpt_epargne(cmpt_epargne);
		p1.setCrt_liberte(crt_liberte);
		p1.setCmpt_distance(cmpt_distance);
		p1.setAssurance(assurance);
		pack1Repository.save(p1);
		return p1;	}

	@Override
	public void supprimerPack1(Long id) {

		pack1Repository.deleteById(id);		
	}

	@Override
	public List<Pack1> afficherAllPack1() {
		return pack1Repository.findAll();
	}

	@Override
	public Pack1 afficherOnePack1(Long id) {
		return pack1Repository.findById(id).get();
	}

	
	
}
