/**
 * 
 */
package com.study.app.manager;

import org.springframework.beans.factory.annotation.Autowired;

import com.study.app.pojo.MrInfo;
import com.study.app.repository.AppRepo;

/**
 * @author Pragati Sharma
 *
 */

public class AppManager {

	@Autowired
	AppRepo appRepo;

	public void enrollUser(MrInfo user) {
		appRepo.enrollUser(user);
	}

}
