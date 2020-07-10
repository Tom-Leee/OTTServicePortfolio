package com.gmail.joohyoung.t.lee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gmail.joohyoung.t.lee.service.OTTService;

@Controller
public class UsersController {
	
	@Autowired
	private OTTService usersService;
}
