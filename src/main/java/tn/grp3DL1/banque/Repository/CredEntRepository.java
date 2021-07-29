package tn.grp3DL1.banque.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.grp3DL1.banque.entities.Credit_entreprise;

public interface CredEntRepository extends JpaRepository<Credit_entreprise, Long>{

}
