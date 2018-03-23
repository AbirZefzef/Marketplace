package org.sid.web;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sid.dao.RoleRepository;
import org.sid.entities.Role;
import org.sid.entities.Role;
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
public class RoleRestService {
	
	@Autowired
	private RoleRepository roleRepository;
	/////////////////afficher tous les roles///////////////////
	@RequestMapping(value="/role",method=RequestMethod.GET)
	public List<Role> getRole(){
		return roleRepository.findAll();
	}
	////////////////////afficher le role ayant cette id//////////////
	@RequestMapping(value="/role/{id}",method=RequestMethod.GET)
	public Role getRole(@PathVariable Long id){
		return roleRepository.findOne(id);
	}
	/////////////////enregistrer un nouveau role///////////////////////////
	@RequestMapping(value="/role",method=RequestMethod.POST)
	public Role save(@RequestBody Role r){
		return roleRepository.save(r);
	}
	////////////////supperimer le role ayant cette id///////////////////////////
	@RequestMapping(value="/role/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		roleRepository.delete(id);
		return true;
	}
	///////////////////mis a jour un role//////////////////////////
	@RequestMapping(value="/role/{id}",method=RequestMethod.POST)
	public Role save(@PathVariable Long id,@RequestBody Role r){
		r.setId_role(id);
		return roleRepository.save(r);
	}
	
	///////////////////chercher les Role///////////////////////////////
	@RequestMapping(value="/Chercher_Role",method=RequestMethod.GET)
	@ResponseBody
	public Page<Role> chercher(
		@RequestParam(name="mc",defaultValue="")String mc,
		@RequestParam(name="page",defaultValue="0")int page,
		@RequestParam(name="size",defaultValue="30")int size
							){
		return roleRepository.chercher("%"+mc+"%",new PageRequest(page,size));
				}
}
