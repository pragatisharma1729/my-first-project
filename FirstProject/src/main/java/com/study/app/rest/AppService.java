/**
 * 
 */
package com.study.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.study.app.manager.AppManager;
import com.study.app.pojo.MrInfo;

/**
 * @author Pragati Sharma
 *
 */
@RestController
public class AppService {

	@Autowired
	AppManager appManager;

	@RequestMapping(value = "mrInfo/user/create", method = RequestMethod.PUT, consumes = "application/json")
	public String enrollUser(@RequestBody MrInfo user) {
		appManager.enrollUser(user);
		return "User Enrolled Sucessfully";

	}

}
