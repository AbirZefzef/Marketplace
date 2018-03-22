package org.sid.dao;

import org.sid.entities.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ServicesRepository extends JpaRepository<Services, Long>{
	
	
	@Query("select s from Services s where s.nom like :mc")
	public Page<Services> chercher(@Param("mc")String mc,Pageable pageable);
	
}
