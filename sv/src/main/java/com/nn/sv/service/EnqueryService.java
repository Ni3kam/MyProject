package com.nn.sv.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nn.sv.model.EnqueryEntity;
import com.nn.sv.repository.EnqueryJpaRepository;

@Service
public class EnqueryService {
	
	@Autowired
	private EnqueryJpaRepository enqueryJpaRepository;
	
	public String save(EnqueryEntity enq) {
		List<EnqueryEntity> enqList = enqueryJpaRepository.findByMobileOrderByIdDesc(enq.getMobile());
		if(enqList.size() > 0) {
			enq.setCreatedOn(enqList.get(0).getCreatedOn());
			enq.setUpdatedOn(new Date());
			enq.setNoOfVisit(enqList.get(0).getNoOfVisit()+1);
		} else {
			enq.setCreatedOn(new Date());
			enq.setUpdatedOn(new Date());
			enq.setNoOfVisit(1);
		}
		enqueryJpaRepository.save(enq);
		return "sucess";
	}

}
