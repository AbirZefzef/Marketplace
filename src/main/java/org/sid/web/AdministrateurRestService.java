package org.sid.web;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sid.dao.AdministrateursRepository;
import org.sid.entities.Administrateurs;
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
public class AdministrateurRestService {
	
	@Autowired
	private AdministrateursRepository administrateursRepository;
	/////////////////afficher tous les Administrateurs///////////////////
	@RequestMapping(value="/Administrateurs",method=RequestMethod.GET)
	public List<Administrateurs> getAdminidtrateur(){
		return administrateursRepository.findAll();
	}
	////////////////////afficher l'Administrateur ayant cette id//////////////
	@RequestMapping(value="/Administrateurs/{id}",method=RequestMethod.GET)
	public Administrateurs getAdministrateur(@PathVariable Long id){
		return administrateursRepository.findOne(id);
	}
	/////////////////enregistrer un nouveau Administrateur///////////////////////////
	@RequestMapping(value="/Administrateurs",method=RequestMethod.POST)
	public Administrateurs save(@RequestBody Administrateurs a){
		return administrateursRepository.save(a);
	}
	////////////////supperimer l'Administrateurs ayant cette id///////////////////////////
	@RequestMapping(value="/Administrateurs/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		administrateursRepository.delete(id);
		return true;
	}
	///////////////////mis a jour un Administrateur//////////////////////////
	@RequestMapping(value="/Administrateurs/{id}",method=RequestMethod.POST)
	public Administrateurs save(@PathVariable Long id,@RequestBody Administrateurs a){
		a.setId_admin(id);
		return administrateursRepository.save(a);
	}
	///////////////////chercher les abonnements///////////////////////////////
	@RequestMapping(value="/Administrateurs",method=RequestMethod.GET)
	@ResponseBody
	public Page<Administrateurs> chercher(
					@RequestParam(name="mc",defaultValue="")String mc,
					@RequestParam(name="page",defaultValue="0")int page,
					@RequestParam(name="size",defaultValue="30")int size
										){
		return administrateursRepository.chercher("%"+mc+"%",new PageRequest(page,size));
		
		
	
	
	

}
	
}
