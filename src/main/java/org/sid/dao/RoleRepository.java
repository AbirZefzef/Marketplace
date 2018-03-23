package org.sid.dao;

import org.sid.entities.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	
	@Query("select r from Role r where r.nom_role like :mc")
	public Page<Role> chercher(@Param("mc")String mc,Pageable pageable);
	


	
	
}
