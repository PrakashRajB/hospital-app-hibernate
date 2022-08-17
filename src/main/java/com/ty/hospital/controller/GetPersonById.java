package com.ty.hospital.controller;

import com.ty.hospital.dao.PersonDao;
import com.ty.hospital.dto.Person;

public class GetPersonById {
	public static void main(String[] args) {
		PersonDao dao = new PersonDao();
		Person person = dao.getPersonById(1);
		System.out.println(person);
	}

}
