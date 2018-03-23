package org.sid.dao;

import org.sid.entities.AppelsOffres;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Appels_offresRepository extends JpaRepository<AppelsOffres, Long>{
	
	@Query("select a from AppelsOffres a where a.titre like :mc")
	public Page<AppelsOffres> chercher(@Param("mc")String mc,Pageable pageable);
	
	
}
