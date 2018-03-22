package org.sid.dao;

import org.sid.entities.Infrastrecture;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InfrastrectureRepository extends JpaRepository<Infrastrecture, Long>{
	
	
	@Query("select i from infrastrecture i where i.nom like :mc")
	public Page<Infrastrecture> chercher(@Param("mc")String mc,Pageable pageable);
	
}
