package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("P1")

public class Pack1 extends Pack implements Serializable {

	public Pack1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pack1(Long id, String tYP, Long cmpt_depot, Long cmpt_epargne, Long crt_liberte, Long cmpt_distance,
			Long assurance, List<Client> clients) {
		super(id, tYP, cmpt_depot, cmpt_epargne, crt_liberte, cmpt_distance, assurance, clients);
		// TODO Auto-generated constructor stub
	}



}
