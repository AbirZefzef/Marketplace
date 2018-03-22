package org.sid.dao;

import org.sid.entities.cahier_charge;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Cahier_chargeRepository extends JpaRepository<cahier_charge, Long>{
	
	
	@Query("select c from Cahier_charge c where c.nom like :mc")
	public Page<cahier_charge> chercher(@Param("mc")String mc,Pageable pageable);
	
}
