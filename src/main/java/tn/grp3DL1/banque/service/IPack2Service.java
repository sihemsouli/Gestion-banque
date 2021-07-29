package tn.grp3DL1.banque.service;

import java.util.List;

import tn.grp3DL1.banque.entities.Pack2;

public interface IPack2Service {

	public	Pack2 ajouterPack2(Pack2 p2);

	public Pack2 modifierPack2(Long id,Long cmpt_depot, Long cmpt_epargne,
			Long crt_liberte,Long cmpt_distance,Long assurance,Long crt_voyage);

	public	void supprimerPack2(Long id);

	public	List<Pack2> afficherAllPack2();

	public	Pack2 afficherOnePack2(Long id);

}
