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

import tn.grp3DL1.banque.entities.Credit_particulier;
import tn.grp3DL1.banque.service.ICredParService;

@RestController
public class CredParControll {

	@Autowired
	private	ICredParService credParService;
	
	@GetMapping("/AllCredPar")
	   public  List<Credit_particulier>	getAllCredPar() {
	    	
		return   credParService.afficherAllCredPar();
	    }
		
		@PostMapping("/AddCredPar")
		public Credit_particulier ajouterCredPar(@RequestBody Credit_particulier c1) {
		 return	credParService.ajouterCredPar(c1);
		}
		
		@GetMapping("/OneCredPar/{id}")
		public Credit_particulier afficherOneCredPar(@PathVariable Long id) {
			return credParService.afficherOneCredPar(id);
		}
		
		@PutMapping("/updateCredPar/{id}/{typ}/{duree_echeance}/{montant_crédit}/{echeance_mois}")
		public Credit_particulier updateCredPar(@PathVariable Long id,
				@PathVariable String typ,@PathVariable Long duree_echeance,
				@PathVariable Long montant_crédit,
				@PathVariable Long echeance_mois) {
			return credParService.modifierCredPar(id, typ, duree_echeance,
					montant_crédit, echeance_mois);
 		}
	
	@DeleteMapping("/deleteCredPar/{id}")
    public void deleteCredPar(@PathVariable Long id) {
		credParService.supprimerCredPar(id);
	}
}
