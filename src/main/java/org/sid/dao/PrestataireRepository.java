package org.sid.dao;

import org.sid.entities.prestataires;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PrestataireRepository extends JpaRepository<prestataires, Long>{
	
	@Query("select p from prestataires p where p.nom like :mc")
	public Page<prestataires> chercher(@Param("mc")String mc,Pageable pageable);
	
}
