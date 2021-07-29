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

import tn.grp3DL1.banque.entities.Credit_professionnel;
import tn.grp3DL1.banque.service.ICredProService;

@RestController
public class CredProControll {
	
	@Autowired
	private	ICredProService credProService;
	
	@GetMapping("/AllCredPro")
	   public  List<Credit_professionnel>	getAllCredPro() {
	    	
		return   credProService.afficherAllCredPro();
	    }
		
		@PostMapping("/AddCredPro")
		public Credit_professionnel ajouterCredPro(@RequestBody Credit_professionnel c2) {
		 return	credProService.ajouterCredPro(c2);
		}
		
		@GetMapping("/OneCredPro/{id}")
		public Credit_professionnel afficherOneCredPro(@PathVariable Long id) {
			return credProService.afficherOneCredPro(id);
		}
		
		@PutMapping("/updateCredPro/{id}/{typ}/{duree_echeance}/{montant_crédit}/{echeance_mois}")
		public Credit_professionnel updateCredPro(@PathVariable Long id,
				@PathVariable String typ,@PathVariable Long duree_echeance,
				@PathVariable Long montant_crédit,
				@PathVariable Long echeance_mois) {
			return credProService.modifierCredPro(id, typ, duree_echeance,
					montant_crédit, echeance_mois);
 		}
	
	@DeleteMapping("/deleteCredPro/{id}")
    public void deleteCredPro(@PathVariable Long id) {
		credProService.supprimerCredPro(id);
	}

}
