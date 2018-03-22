package org.sid.dao;

import org.sid.entities.Appels_offres;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Appels_offresRepository extends JpaRepository<Appels_offres, Long>{
	
	
	@Query("select a from Appels_offres a where a.nom like :mc")
	public Page<Appels_offres> chercher(@Param("mc")String mc,Pageable pageable);
	
}
