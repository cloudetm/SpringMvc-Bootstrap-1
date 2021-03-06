package com.rocky.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rocky.entity.UserInfo;
import com.rocky.service.interfaces.IBaseService;

@Controller
@RequestMapping("/user")
public class UserController {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier(value="userService")
	private IBaseService<UserInfo> userService;

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public void UserCount(Model model) {
		model.addAttribute("UserCount", userService.GetEntitiesCount());
	}
}
