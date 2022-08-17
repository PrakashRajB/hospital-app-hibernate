package com.ty.hospital.controller;

import com.ty.hospital.dao.UserDao;
import com.ty.hospital.dto.User;
import com.ty.hospital.helper.AES;

public class GetUserById {
	public static void main(String[] args) {
		UserDao dao = new UserDao();
		User user = dao.getUserById(1);
		if (user != null) {
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println(AES.decrypt(user.getPassword()));
		}
	}

}
