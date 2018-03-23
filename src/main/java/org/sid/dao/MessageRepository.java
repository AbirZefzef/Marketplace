package org.sid.dao;

import org.sid.entities.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MessageRepository extends JpaRepository<Message, Long>{
    
    
    @Query("select M from Message M where M.texte like :mc")
    public Page<Message> chercher(@Param("mc")String mc,Pageable pageable);
    
}