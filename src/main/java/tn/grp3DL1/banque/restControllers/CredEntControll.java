package tn.grp3DL1.banque.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.grp3DL1.banque.entities.Credit_entreprise;
import tn.grp3DL1.banque.service.ICredEntService;

@RestController
public class CredEntControll {

	@Autowired
	private	ICredEntService credEntService;
	
	@GetMapping("/AllCredEnt")
	   public  List<Credit_entreprise>	getAllCredEnt() {
	    	
		return   credEntService.afficherAllCredEnt();
	    }
		
		@PostMapping("/AddCredEnt")
		public Credit_entreprise ajouterCredEnt(@RequestBody Credit_entreprise c3) {
		 return	credEntService.ajouterCredEnt(c3);
		}
		
		@GetMapping("/OneCredEnt/{id}")
		public Credit_entreprise afficherOneCredEnt(@PathVariable Long id) {
			return credEntService.afficherOneCredEnt(id);
		}
		
		@PutMapping("/updateCredEnt/{id}/{typ}/{duree_echeance}/{montant_crédit}/{echeance_mois}")
		public Credit_entreprise updateCredEnt(@PathVariable Long id,
				@PathVariable String typ,@PathVariable Long duree_echeance,
				@PathVariable Long montant_crédit,
				@PathVariable Long echeance_mois) {
			return credEntService.modifierCredEnt(id, typ, duree_echeance,
					montant_crédit, echeance_mois);
 		}
	
	@DeleteMapping("/deleteCredEnt/{id}")
    public void deleteCredEnt(@PathVariable Long id) {
		credEntService.supprimerCredEnt(id);
	}
}
