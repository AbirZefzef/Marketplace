package org.sid.dao;

import org.sid.entities.Administrateurs;
import org.sid.entities.Utilisateurs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdministrateursRepository extends JpaRepository<Administrateurs, Long>{
	
	
	@Query("select u from Administrateurs u where u.login like :mc")
	public Page<Administrateurs> chercher(@Param("mc")String mc,Pageable pageable);
}
