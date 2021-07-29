package tn.grp3DL1.banque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.grp3DL1.banque.Repository.Pack2Repository;
import tn.grp3DL1.banque.entities.Pack2;

@Service
public class Pack2ServiceImpl implements IPack2Service {

	@Autowired
	Pack2Repository pack2Repository; 
	
	@Override
	public Pack2 ajouterPack2(Pack2 p2) {
		return  pack2Repository.save(p2);
		
	}

	@Override
	public Pack2 modifierPack2(Long id, Long cmpt_depot, Long cmpt_epargne, Long crt_liberte, Long cmpt_distance,
			Long assurance,Long crt_voyage) {
		
		Pack2 p1 = pack2Repository.findById(id).get();
		p1.setCmpt_depot(cmpt_depot);
		p1.setCmpt_epargne(cmpt_epargne);
		p1.setCrt_liberte(crt_liberte);
		p1.setCmpt_distance(cmpt_distance);
		p1.setAssurance(assurance);
		p1.setCrt_voyage(crt_voyage);
		pack2Repository.save(p1);
		return p1;
	}
	
	@Override
	public void supprimerPack2(Long id) {
		pack2Repository.deleteById(id);		
		
	}

	@Override
	public List<Pack2> afficherAllPack2() {
		return pack2Repository.findAll();

	}

	@Override
	public Pack2 afficherOnePack2(Long id) {
		return pack2Repository.findById(id).get();

	}

	

}
