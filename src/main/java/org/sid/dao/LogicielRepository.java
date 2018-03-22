package org.sid.dao;

import org.sid.entities.Logiciels;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LogicielRepository extends JpaRepository<Logiciels, Long>{
	
	
	@Query("select l from Logiciel l where l.nom like :mc")
	public Page<Logiciels> chercher(@Param("mc")String mc,Pageable pageable);
	
}
