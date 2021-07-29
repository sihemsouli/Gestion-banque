package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("P2")
public class Pack2 extends Pack implements Serializable {
	
	private Long crt_voyage;
	
	public Pack2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pack2(Long id, String tYP, Long cmpt_depot, Long cmpt_epargne, 
			Long crt_liberte, Long cmpt_distance,
			Long assurance, List<Client> clients) {
		super(id, tYP, cmpt_depot, cmpt_epargne, crt_liberte, cmpt_distance,
				assurance, clients);
		// TODO Auto-generated constructor stub
	}

	
	public Pack2(Long crt_voyage) {
		super();
		this.crt_voyage = crt_voyage;
	}

	public Long getCrt_voyage() {
		return crt_voyage;
	}

	public void setCrt_voyage(Long crt_voyage) {
		this.crt_voyage = crt_voyage;
	}
	
	
	
	

}
