package org.sid.dao;

import org.sid.entities.Paiement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PaiementRepository extends JpaRepository<Paiement, Long>{
    
    
    @Query("select P from Paiement P where P.Type_carte like :mc")
    public Page<Paiement> chercher(@Param("mc")String mc,Pageable pageable);
    
}