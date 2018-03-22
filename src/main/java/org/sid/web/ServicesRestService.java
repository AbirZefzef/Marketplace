package org.sid.web;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sid.dao.ServicesRepository;
import org.sid.entities.Services;
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
public class ServicesRestService {
	
	@Autowired
	private ServicesRepository servicesRepository;
	/////////////////afficher tous les Services///////////////////
	@RequestMapping(value="/Services",method=RequestMethod.GET)
	public List<Services> getServices(){
		return servicesRepository.findAll();
	}
	////////////////////afficher l'Services ayant cette id//////////////
	@RequestMapping(value="/Services/{id}",method=RequestMethod.GET)
	public Services getServices(@PathVariable Long id){
		return servicesRepository.findOne(id);
	}
	/////////////////enregistrer un nouveau Services///////////////////////////
	@RequestMapping(value="/Services",method=RequestMethod.POST)
	public Services save(@RequestBody Services s){
		return servicesRepository.save(s);
	}
	////////////////supperimer l'Services ayant cette id///////////////////////////
	@RequestMapping(value="/Services/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		servicesRepository.delete(id);
		return true;
	}
	///////////////////mis a jour un Services//////////////////////////
	@RequestMapping(value="/Services/{id}",method=RequestMethod.POST)
	public Services save(@PathVariable Long id,@RequestBody Services s){
		s.setId_service(id);
		return servicesRepository.save(s);
	}
	///////////////////chercher les Servicess///////////////////////////////
	@RequestMapping(value="/Chercher",method=RequestMethod.GET)
	@ResponseBody
	public Page<Services> chercher(
					@RequestParam(name="mc",defaultValue="")String mc,
					@RequestParam(name="page",defaultValue="0")int page,
					@RequestParam(name="size",defaultValue="30")int size
										){
		return servicesRepository.chercher("%"+mc+"%",new PageRequest(page,size));
		
		
	
	
	

}
	
}
