package org.sid.web;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sid.dao.LogicielRepository;
import org.sid.entities.Logiciels;
import org.sid.entities.Logiciels;
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
public class LogicielRestService {
	
	@Autowired
	private LogicielRepository logicielRepository;
	/////////////////afficher tous les Logiciels///////////////////
	@RequestMapping(value="/Logiciels",method=RequestMethod.GET)
	public List<Logiciels> getLogiciels(){
		return logicielRepository.findAll();
	}
	////////////////////afficher Logiciel ayant cette id//////////////
	@RequestMapping(value="/Logiciels/{id}",method=RequestMethod.GET)
	public Logiciels getLogiciels(@PathVariable Long id){
		return logicielRepository.findOne(id);
	}
	/////////////////enregistrer un nouveau Logiciel///////////////////////////
	@RequestMapping(value="/Logiciels",method=RequestMethod.POST)
	public Logiciels save(@RequestBody Logiciels l){
		return logicielRepository.save(l);
	}
	////////////////supperimer Logiciel ayant cette id///////////////////////////
	@RequestMapping(value="/Logiciels/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		logicielRepository.delete(id);
		return true;
	}
	///////////////////mis a jour un Logiciel//////////////////////////
	@RequestMapping(value="/Logiciels/{id}",method=RequestMethod.POST)
	public Logiciels save(@PathVariable Long id,@RequestBody Logiciels l){
		l.setId_logiciels(id);
		return logicielRepository.save(l);
	}
	
///////////////////chercher les Logiciels///////////////////////////////
@RequestMapping(value="/Chercher_Logiciels",method=RequestMethod.GET)
@ResponseBody
public Page<Logiciels> chercher(
		@RequestParam(name="mc",defaultValue="")String mc,
		@RequestParam(name="page",defaultValue="0")int page,
		@RequestParam(name="size",defaultValue="30")int size
							){
return logicielRepository.chercher("%"+mc+"%",new PageRequest(page,size));
}
}
