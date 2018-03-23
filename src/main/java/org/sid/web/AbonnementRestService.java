package org.sid.web;

import java.util.List;

import org.sid.dao.AbonnementRepository;
import org.sid.entities.Abonnement;
import org.sid.entities.Utilisateurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin("*")
public class AbonnementRestService {
	
	@Autowired
	private AbonnementRepository abonnementRepository;
	/////////////////afficher tous les Abonnements///////////////////
	@RequestMapping(value="/Abonnement",method=RequestMethod.GET)
	public List<Abonnement> getAbonnement(){
		return abonnementRepository.findAll();
	}
	////////////////////afficher l'Abonnement ayant cette id//////////////
	@RequestMapping(value="/Abonnement/{id}",method=RequestMethod.GET)
	public Abonnement getAbonnement(@PathVariable Long id){
		return abonnementRepository.findOne(id);
	}
	/////////////////enregistrer un nouveau Abonnement///////////////////////////
	@RequestMapping(value="/Abonnement",method=RequestMethod.POST)
	public Abonnement save(@RequestBody Abonnement a){
		return abonnementRepository.save(a);
	}
	////////////////supperimer l'Abonnement ayant cette id///////////////////////////
	@RequestMapping(value="/Abonnement/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		abonnementRepository.delete(id);
		return true;
	}
	///////////////////mis a jour un Abonnement//////////////////////////
	@RequestMapping(value="/Abonnement/{id}",method=RequestMethod.POST)
	public Abonnement save(@PathVariable Long id,@RequestBody Abonnement a){
		a.setId_abonnement(id);
		return abonnementRepository.save(a);
	}
	///////////////////chercher les abonnements///////////////////////////////
	@RequestMapping(value="/Chercher_abonnement",method=RequestMethod.GET)
	@ResponseBody
	public Page<Abonnement> chercher(
		@RequestParam(name="mc",defaultValue="")String mc,
		@RequestParam(name="page",defaultValue="0")int page,
		@RequestParam(name="size",defaultValue="30")int size
							){
		return abonnementRepository.chercher("%"+mc+"%",new PageRequest(page,size));
									}

	
}
