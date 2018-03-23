package org.sid.web;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sid.dao.Cahier_chargeRepository;
import org.sid.entities.cahier_charge;
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
public class CahierChargeRestService {
	
	@Autowired
	private Cahier_chargeRepository cahier_chargeRepository;
	/////////////////afficher tous les Cahier_charge///////////////////
	@RequestMapping(value="/Cahier_charge",method=RequestMethod.GET)
	public List<cahier_charge> getCahier_charge(){
		return cahier_chargeRepository.findAll();
	}
	////////////////////afficher l'Cahier_charge ayant cette id//////////////
	@RequestMapping(value="/Cahier_charge/{id}",method=RequestMethod.GET)
	public cahier_charge getCahier_charge(@PathVariable Long id){
		return cahier_chargeRepository.findOne(id);
	}
	/////////////////enregistrer un nouveau Cahier_charge///////////////////////////
	@RequestMapping(value="/Cahier_charge",method=RequestMethod.POST)
	public cahier_charge save(@RequestBody cahier_charge c){
		return cahier_chargeRepository.save(c);
	}
	////////////////supperimer l'Cahier_charge ayant cette id///////////////////////////
	@RequestMapping(value="/Cahier_charge/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		cahier_chargeRepository.delete(id);
		return true;
	}
	///////////////////mis a jour un Cahier_charge//////////////////////////
	@RequestMapping(value="/Cahier_charge/{id}",method=RequestMethod.POST)
	public cahier_charge save(@PathVariable Long id,@RequestBody cahier_charge c){
		c.setId_CahierCharge(id);
		return cahier_chargeRepository.save(c);
	}
	
	
	
}
