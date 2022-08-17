package com.ty.hospital.controller;

import com.ty.hospital.dao.PersonDao;
import com.ty.hospital.dto.Person;

public class SavePerson {
	public static void main(String[] args) {
		PersonDao dao=new PersonDao();
		
		Person person=new Person();
		person.setName("Gokul");
		person.setAge(28);
		
		dao.savePerson(person);
	}

}
