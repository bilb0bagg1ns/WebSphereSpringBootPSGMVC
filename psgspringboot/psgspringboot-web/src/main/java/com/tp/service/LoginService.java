package com.tp.service;

import javax.inject.Named;

//@Service
@Named
public class LoginService {
	public boolean validateUser(String userid, String password) {
		return userid.equalsIgnoreCase("homer") && password.equalsIgnoreCase("homer");
	}
}
