package org.sid.web;
import java.util.List;

import org.sid.dao.MessageRepository;
import org.sid.entities.Message;
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
public class MessageRestService {
    @Autowired
    private MessageRepository MessageRepository;
    /////////////////afficher tous les Messages///////////////////
    @RequestMapping(value="/Message",method=RequestMethod.GET)
    public List<Message> getMessage(){
        return MessageRepository.findAll();
    }
    ////////////////////afficher Message ayant cette id//////////////
    @RequestMapping(value="/Message/{id}",method=RequestMethod.GET)
    public Message getMessage(@PathVariable Long id){
        return MessageRepository.findOne(id);
    }
    /////////////////enregistrer un nouveau message///////////////////////////
    @RequestMapping(value="/Message",method=RequestMethod.POST)
    public Message save(@RequestBody Message M){
        return MessageRepository.save(M);
    }
    ////////////////supperimer Message ayant cette id///////////////////////////
    @RequestMapping(value="/Message/{id}",method=RequestMethod.DELETE)
    public boolean supprimer(@PathVariable Long id){
        MessageRepository.delete(id);
        return true;
    }
    ///////////////////mis a jour un Message//////////////////////////
    @RequestMapping(value="/Message/{id}",method=RequestMethod.POST)
    public Message save(@PathVariable Long id,@RequestBody Message M){
        M.setId_Message(id);
        return MessageRepository.save(M);
    }
    ///////////////////chercher les Messages///////////////////////////////
    @RequestMapping(value="/Chercher",method=RequestMethod.GET)
    @ResponseBody
    public Page<Message> chercher(
                    @RequestParam(name="mc",defaultValue="")String mc,
                    @RequestParam(name="page",defaultValue="0")int page,
                    @RequestParam(name="size",defaultValue="30")int size
                                        ){
        return MessageRepository.chercher("%"+mc+"%",new PageRequest(page,size));
    }
        
    
    
    

}