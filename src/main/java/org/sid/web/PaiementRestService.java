package org.sid.web;
import java.util.List;

import org.sid.dao.PaiementRepository;
import org.sid.entities.Paiement;
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
public class PaiementRestService {
    @Autowired
    private PaiementRepository PaiementRepository;
    /////////////////afficher tous les Paiement///////////////////
    @RequestMapping(value="/Paiement",method=RequestMethod.GET)
    public List<Paiement> getPaiement(){
        return PaiementRepository.findAll();
    }
    ////////////////////afficher Paiement ayant cette id//////////////
    @RequestMapping(value="/Paiement/{id}",method=RequestMethod.GET)
    public Paiement getPaiement(@PathVariable Long id){
        return PaiementRepository.findOne(id);
    }
    /////////////////enregistrer un nouveau Paiement///////////////////////////
    @RequestMapping(value="/Paiement",method=RequestMethod.POST)
    public Paiement save(@RequestBody Paiement P){
        return PaiementRepository.save(P);
    }
    ////////////////supperimer Paiement ayant cette id///////////////////////////
    @RequestMapping(value="/Paiement/{id}",method=RequestMethod.DELETE)
    public boolean supprimer(@PathVariable Long id){
        PaiementRepository.delete(id);
        return true;
    }
    ///////////////////mis a jour un Paiement//////////////////////////
    @RequestMapping(value="/Paiement/{id}",method=RequestMethod.POST)
    public Paiement save(@PathVariable Long id,@RequestBody Paiement M){
        M.setId_Paiement(id);
        return PaiementRepository.save(M);
    }
    ///////////////////chercher les Paiements///////////////////////////////
    @RequestMapping(value="/Chercher_paiement",method=RequestMethod.GET)
    @ResponseBody
    public Page<Paiement> chercher(
                    @RequestParam(name="mc",defaultValue="")String mc,
                    @RequestParam(name="page",defaultValue="0")int page,
                    @RequestParam(name="size",defaultValue="30")int size
                                        ){
        return PaiementRepository.chercher("%"+mc+"%",new PageRequest(page,size));
        
        
    
    
    

}
    
}