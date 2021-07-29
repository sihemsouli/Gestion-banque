package tn.grp3DL1.banque.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.grp3DL1.banque.entities.Credit_particulier;
import tn.grp3DL1.banque.entities.Crédit;

public interface CredParRepository extends JpaRepository<Credit_particulier, Long> {
	
	

}
