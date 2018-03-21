package org.sid.web;

import java.util.List;

import org.sid.dao.UtilisateursRepository;
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
public class UtilisateursRestService {
	
	@Autowired
	private UtilisateursRepository utilisateursRepository;
	/////////////////afficher tous les utilisateurs///////////////////
	@RequestMapping(value="/utilisateurs",method=RequestMethod.GET)
	public List<Utilisateurs> getUtilisateurs(){
		return utilisateursRepository.findAll();
	}
	////////////////////afficher l'utilisateur ayant cette id//////////////
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.GET)
	public Utilisateurs getUtilisateur(@PathVariable Long id){
		return utilisateursRepository.findOne(id);
	}
	///////////////////enregistrer un nouveau utilisateur///////////////////////////
	@RequestMapping(value="/utilisateurs",method=RequestMethod.POST)
	public Utilisateurs save(@RequestBody Utilisateurs u){
		return utilisateursRepository.save(u);
	}
	////////////////supperimer l'utilisateur ayant cette id///////////////////////////
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		utilisateursRepository.delete(id);
		return true;
	}
	///////////////////mis a jour un utilisateur//////////////////////////
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.POST)
	public Utilisateurs save(@PathVariable Long id,@RequestBody Utilisateurs u){
		u.setIdUtilisateur(id);
		return utilisateursRepository.save(u);
	}
	///////////////////chercher les utilisateurs///////////////////////////////
	@RequestMapping(value="/Chercher",method=RequestMethod.GET)
	@ResponseBody
	public Page<Utilisateurs> chercher(
					@RequestParam(name="mc",defaultValue="")String mc,
					@RequestParam(name="page",defaultValue="0")int page,
					@RequestParam(name="size",defaultValue="30")int size
										){
		return utilisateursRepository.chercher("%"+mc+"%",new PageRequest(page,size));
		}
	
	
	

}
