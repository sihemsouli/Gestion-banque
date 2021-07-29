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

import tn.grp3DL1.banque.entities.Pack3;
import tn.grp3DL1.banque.service.IPack3Service;

@RestController
public class Pack3RESTController {
	
	@Autowired
	private	IPack3Service  pack3Service;
	
	@GetMapping("/AllPack3")
	   public  List<Pack3>	getAllPack3() {
	    	
		return   pack3Service.afficherAllPack3();
	    }
		
		@PostMapping("/AddPack3")
		public Pack3 ajouterPack3(@RequestBody Pack3 p3) {
		 return	pack3Service.ajouterPack3(p3);
		}
		
		@GetMapping("/OnePack3/{id}")
		public Pack3 afficherOnePack3(@PathVariable Long id) {
			return pack3Service.afficherOnePack3(id);
		}
		
		@PutMapping("/updatePack3/{id}/{cmpt_depot}/{cmpt_epargne}/{crt_liberte}/{cmpt_distance}/{assurance}/{crt_visaGold}")
		public Pack3 updatePack3(@PathVariable Long id,@PathVariable Long cmpt_depot,
				@PathVariable Long cmpt_epargne,@PathVariable Long crt_liberte,
				@PathVariable Long cmpt_distance,@PathVariable Long assurance,
				@PathVariable Long crt_visaGold) {
			return pack3Service.modifierPack3(id, cmpt_depot, cmpt_epargne, crt_liberte,
					cmpt_distance, assurance, crt_visaGold);
 		}
	
	@DeleteMapping("/deletePack3/{id}")
    public void deletePack3(@PathVariable Long id) {
		pack3Service.supprimerPack3(id);
	}

}
