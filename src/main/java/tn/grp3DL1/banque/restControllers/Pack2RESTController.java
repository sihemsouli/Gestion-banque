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

import tn.grp3DL1.banque.entities.Pack2;
import tn.grp3DL1.banque.service.IPack2Service;

@RestController
public class Pack2RESTController {

	@Autowired
	private	IPack2Service  pack2Service;
	
	@GetMapping("/AllPack2")
	   public  List<Pack2>	getAllPack2() {
	    	
		return   pack2Service.afficherAllPack2();
	    }
		
		@PostMapping("/AddPack2")
		public Pack2 ajouterPack2(@RequestBody Pack2 p2) {
		 return	pack2Service.ajouterPack2(p2);
		}
		
		@GetMapping("/OnePack2/{id}")
		public Pack2 afficherOnePack2(@PathVariable Long id) {
			return pack2Service.afficherOnePack2(id);
		}
		
		@PutMapping("/updatePack2/{id}/{cmpt_depot}/{cmpt_epargne}/{crt_liberte}/{cmpt_distance}/{assurance}/{crt_voyage}")
		public Pack2 updatePack2(@PathVariable Long id,@PathVariable Long cmpt_depot,
				@PathVariable Long cmpt_epargne,@PathVariable Long crt_liberte,
				@PathVariable Long cmpt_distance,@PathVariable Long assurance,
				@PathVariable Long crt_voyage) {
			return pack2Service.modifierPack2(id, cmpt_depot, cmpt_epargne, crt_liberte,
					cmpt_distance, assurance, crt_voyage);
 		}
	
	@DeleteMapping("/deletePack2/{id}")
    public void deletePack2(@PathVariable Long id) {
		pack2Service.supprimerPack2(id);
	}
}
