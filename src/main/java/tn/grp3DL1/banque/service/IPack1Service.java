package tn.grp3DL1.banque.service;

import java.util.List;

import tn.grp3DL1.banque.entities.Pack1;






public interface IPack1Service {
	
public	Pack1 ajouterPack1(Pack1 p1);

public Pack1 modifierPack1(Long id,Long cmpt_depot, Long cmpt_epargne,Long crt_liberte,
		Long cmpt_distance,Long assurance);

public	void supprimerPack1(Long id);

public	List<Pack1> afficherAllPack1();

public	Pack1 afficherOnePack1(Long id);

}
