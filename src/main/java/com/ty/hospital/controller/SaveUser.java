package com.ty.hospital.controller;

import com.ty.hospital.dao.UserDao;
import com.ty.hospital.dto.User;
import com.ty.hospital.helper.AES;

public class SaveUser {
	public static void main(String[] args) {
		User user = new User();
		user.setName("Aron");
		user.setEmail("aron@gmail.com");
		user.setPassword(AES.encrypt("asdf"));

		UserDao dao = new UserDao();
		dao.saveUser(user);
	}

}
