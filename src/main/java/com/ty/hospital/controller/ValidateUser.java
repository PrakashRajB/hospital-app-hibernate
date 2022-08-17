package com.ty.hospital.controller;

import com.ty.hospital.dao.UserDao;
import com.ty.hospital.helper.AES;

public class ValidateUser {
	public static void main(String[] args) {
		UserDao dao = new UserDao();
		boolean result = dao.validateUser("aron@gmail.com", AES.encrypt("asdf"));
		if (result) {
			System.out.println("Login succesful");
		} else {
			System.out.println("Invalid email or password");
		}
	}
}
