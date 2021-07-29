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

import tn.grp3DL1.banque.entities.Pack1;
import tn.grp3DL1.banque.service.IPack1Service;




@RestController
public class Pack1RESTController {
	
	@Autowired
private	IPack1Service  pack1Service;

	
	
	@GetMapping("/AllPack1")
   public  List<Pack1>	getAllPack1() {
    	
	return   pack1Service.afficherAllPack1();
    }
	
	@PostMapping("/AddPack1")
	public Pack1 ajouterPack1(@RequestBody Pack1 p1) {
	 return	pack1Service.ajouterPack1(p1);
	}
	
	@GetMapping("/OnePack1/{id}")
	public Pack1 afficherOnePack1(@PathVariable Long id) {
		return pack1Service.afficherOnePack1(id);
	}
	 
	@PutMapping("/updatePack1/{id}/{cmpt_depot}/{cmpt_epargne}/{crt_liberte}/{cmpt_distance}/{assurance}")
		public Pack1 updatePack1(@PathVariable Long id,@PathVariable Long cmpt_depot,
				@PathVariable Long cmpt_epargne,@PathVariable Long crt_liberte,
				@PathVariable Long cmpt_distance,@PathVariable Long assurance) {
			return pack1Service.modifierPack1(id, cmpt_depot,  cmpt_epargne,
					 crt_liberte, cmpt_distance, assurance);
 		}
	
	@DeleteMapping("/deletePack1/{id}")
    public void deletePack1(@PathVariable Long id) {
	 pack1Service.supprimerPack1(id);
	}
}
