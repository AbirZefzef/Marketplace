package org.sid.web;

import java.util.List;

import org.sid.dao.InfrastrectureRepository;
import org.sid.entities.Infrastrecture;
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
public class InfrastrectureRestService {
	
	@Autowired
	private InfrastrectureRepository infrastrectureRepository;
	/////////////////afficher tous les Infrastrecture///////////////////
	@RequestMapping(value="/Infrastrecture",method=RequestMethod.GET)
	public List<Infrastrecture> getInfrastrecture(){
		return infrastrectureRepository.findAll();
	}
	////////////////////afficher l'Infrastrecture ayant cette id//////////////
	@RequestMapping(value="/Infrastrecture/{id}",method=RequestMethod.GET)
	public Infrastrecture getInfrastrecture(@PathVariable Long id){
		return infrastrectureRepository.findOne(id);
	}
	/////////////////enregistrer un nouveau Infrastrecture///////////////////////////
	@RequestMapping(value="/Infrastrecture",method=RequestMethod.POST)
	public Infrastrecture save(@RequestBody Infrastrecture i){
		return infrastrectureRepository.save(i);
	}
	////////////////supperimer l'Infrastrecture ayant cette id///////////////////////////
	@RequestMapping(value="/Infrastrecture/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		infrastrectureRepository.delete(id);
		return true;
	}
	///////////////////mis a jour un Infrastrecture//////////////////////////
	@RequestMapping(value="/Infrastrecture/{id}",method=RequestMethod.POST)
	public Infrastrecture save(@PathVariable Long id,@RequestBody Infrastrecture i){
		i.setId_infrastrecture(id);
		return infrastrectureRepository.save(i);
	}
	
///////////////////chercher les Infrastrectures///////////////////////////////
@RequestMapping(value="/Chercher_Infrastrectures",method=RequestMethod.GET)
@ResponseBody
public Page<Infrastrecture> chercher(
		@RequestParam(name="mc",defaultValue="")String mc,
		@RequestParam(name="page",defaultValue="0")int page,
		@RequestParam(name="size",defaultValue="30")int size
							){
return infrastrectureRepository.chercher("%"+mc+"%",new PageRequest(page,size));
}
}
