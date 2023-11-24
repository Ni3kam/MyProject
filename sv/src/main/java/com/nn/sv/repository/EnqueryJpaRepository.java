package com.nn.sv.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nn.sv.model.EnqueryEntity;
import java.util.List;




public interface EnqueryJpaRepository extends JpaRepository<EnqueryEntity, Long>{
	
	List<EnqueryEntity> findByMobileOrderByIdDesc(String mobileNo);

}
