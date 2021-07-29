package tn.grp3DL1.banque.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE",length=4)
public abstract class Pack implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String TYP;
	private Long cmpt_depot;
	private Long cmpt_epargne;
	private Long crt_liberte;

	private Long cmpt_distance;
	private Long assurance;
	
	@OneToMany(mappedBy="pack",fetch= FetchType.LAZY)
	private List <Client> clients; 
	
		public Pack() {
		super();
		// TODO Auto-generated constructor stub
	}
		
		
		public Pack(Long id, String tYP, Long cmpt_depot, Long cmpt_epargne, Long crt_liberte, Long cmpt_distance,
				Long assurance, List<Client> clients) {
			super();
			this.id = id;
			TYP = tYP;
			this.cmpt_depot = cmpt_depot;
			this.cmpt_epargne = cmpt_epargne;
			this.crt_liberte = crt_liberte;
			this.cmpt_distance = cmpt_distance;
			this.assurance = assurance;
			this.clients = clients;
		}


		public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCmpt_depot() {
		return cmpt_depot;
	}
	public void setCmpt_depot(Long cmpt_depot) {
		this.cmpt_depot = cmpt_depot;
	}
	public Long getCmpt_epargne() {
		return cmpt_epargne;
	}
	public void setCmpt_epargne(Long cmpt_epargne) {
		this.cmpt_epargne = cmpt_epargne;
	}
	public Long getCrt_liberte() {
		return crt_liberte;
	}
	public void setCrt_liberte(Long crt_liberte) {
		this.crt_liberte = crt_liberte;
	}
	
	

	public Long getCmpt_distance() {
		return cmpt_distance;
	}
	public void setCmpt_distance(Long cmpt_distance) {
		this.cmpt_distance = cmpt_distance;
	}
	public Long getAssurance() {
		return assurance;
	}
	public void setAssurance(Long assurance) {
		this.assurance = assurance;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	public String getTYP() {
		return TYP;
	}



	public void setTYP(String tYP) {
		TYP = tYP;
	}
	
	

}
