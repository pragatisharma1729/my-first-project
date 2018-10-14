package com.study.app.repository;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.study.app.entity.MrDetailsEntity;
import com.study.app.pojo.MrInfo;

public class AppRepo extends AbstractDao {

	@Autowired
	Mapper mapper;

	@Transactional(propagation = Propagation.REQUIRED)
	public void enrollUser(MrInfo user) {

		MrDetailsEntity mrDetailsEntity = mapper.map(user, MrDetailsEntity.class);
		getEm().persist(mrDetailsEntity);
		getEm().flush();

	}

}
