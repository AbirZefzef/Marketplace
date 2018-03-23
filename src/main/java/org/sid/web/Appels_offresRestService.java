package org.sid.web;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sid.dao.Appels_offresRepository;
import org.sid.entities.AppelsOffres;
import org.sid.entities.AppelsOffres;
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
public class Appels_offresRestService {
	
	@Autowired
	private Appels_offresRepository appels_offresRepository;
	/////////////////afficher tous les Appels_offres///////////////////
	@RequestMapping(value="/Appels_offres",method=RequestMethod.GET)
	public List<AppelsOffres> getAppelsOffre(){
		return appels_offresRepository.findAll();
	}
	////////////////////afficher Appels_offre ayant cette id//////////////
	@RequestMapping(value="/Appels_offres/{id}",method=RequestMethod.GET)
	public AppelsOffres getAppelsOffre(@PathVariable Long id){
		return appels_offresRepository.findOne(id);
	}
	/////////////////enregistrer un nouveau Appels_offre///////////////////////////
	@RequestMapping(value="/Appels_offres",method=RequestMethod.POST)
	public AppelsOffres save(@RequestBody AppelsOffres a){
		return appels_offresRepository.save(a);
	}
	////////////////supperimer l'Appels_offres ayant cette id///////////////////////////
	@RequestMapping(value="/Appels_offres/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		appels_offresRepository.delete(id);
		return true;
	}
	///////////////////mis a jour un Appels_offres//////////////////////////
	@RequestMapping(value="/Appels_offres/{id}",method=RequestMethod.POST)
	public AppelsOffres save(@PathVariable Long id,@RequestBody AppelsOffres a){
		a.setId_appelOffre(id);
		return appels_offresRepository.save(a);
	}
	
///////////////////chercher les AppelsOffres///////////////////////////////
@RequestMapping(value="/Chercher_AppelsOffres",method=RequestMethod.GET)
@ResponseBody
public Page<AppelsOffres> chercher(
		@RequestParam(name="mc",defaultValue="")String mc,
		@RequestParam(name="page",defaultValue="0")int page,
		@RequestParam(name="size",defaultValue="30")int size
							){
return appels_offresRepository.chercher("%"+mc+"%",new PageRequest(page,size));
}
}
