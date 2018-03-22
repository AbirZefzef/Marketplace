package org.sid.dao;

import org.sid.entities.Abonnement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long>{
	
	
	@Query("select a from Abonnement a where a.nom like :mc")
	public Page<Abonnement> chercher(@Param("mc")String mc,Pageable pageable);
	
}
