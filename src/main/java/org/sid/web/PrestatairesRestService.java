package org.sid.web;

import java.util.List;

import org.sid.dao.PrestataireRepository;
import org.sid.entities.prestataires;
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
public class PrestatairesRestService {
	
	@Autowired
	private PrestataireRepository prestataireRepository;
	/////////////////afficher tous les prestataires///////////////////
	@RequestMapping(value="/prestataires",method=RequestMethod.GET)
	public List<prestataires> getprestataires(){
		return prestataireRepository.findAll();
	}
	////////////////////afficher prestataire ayant cette id//////////////
	@RequestMapping(value="/prestataires/{id}",method=RequestMethod.GET)
	public prestataires getprestataires(@PathVariable Long id){
		return prestataireRepository.findOne(id);
	}
	/////////////////enregistrer un nouveau prestataire///////////////////////////
	@RequestMapping(value="/prestataires",method=RequestMethod.POST)
	public prestataires save(@RequestBody prestataires p){
		return prestataireRepository.save(p);
	}
	////////////////supperimer prestataire ayant cette id///////////////////////////
	@RequestMapping(value="/prestataires/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		prestataireRepository.delete(id);
		return true;
	}
	///////////////////mis a jour un prestataire//////////////////////////
	@RequestMapping(value="/prestataires/{id}",method=RequestMethod.POST)
	public prestataires save(@PathVariable Long id,@RequestBody prestataires p){
		p.setId_prestataire(id);
		return prestataireRepository.save(p);
	}
	
///////////////////chercher les Prestataires///////////////////////////////
@RequestMapping(value="/Chercher_Prestataires",method=RequestMethod.GET)
@ResponseBody
public Page<prestataires> chercher(
		@RequestParam(name="mc",defaultValue="")String mc,
		@RequestParam(name="page",defaultValue="0")int page,
		@RequestParam(name="size",defaultValue="30")int size
							){
return prestataireRepository.chercher("%"+mc+"%",new PageRequest(page,size));
}
	
}
