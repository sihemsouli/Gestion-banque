package tn.grp3DL1.banque.service;

import java.util.List;

import tn.grp3DL1.banque.entities.Pack3;


public interface IPack3Service {

	public	Pack3 ajouterPack3(Pack3 p3);

	public Pack3 modifierPack3(Long id,Long cmpt_depot, Long cmpt_epargne,Long crt_liberte,
			Long cmpt_distance,Long assurance,Long crt_visaGold);

	public	void supprimerPack3(Long id);

	public	List<Pack3> afficherAllPack3();

	public	Pack3 afficherOnePack3(Long id);

	
}
