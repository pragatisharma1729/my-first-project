package com.study.app.repository;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.study.app.pojo.MrInfo;

public class AppRepo extends AbstractDao {

	@Transactional(propagation = Propagation.REQUIRED)
	public void enrollUser(MrInfo user) {

		getEm().persist(user);

	}

}
