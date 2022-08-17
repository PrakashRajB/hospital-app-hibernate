package com.ty.hospital.controller;

import com.ty.hospital.dao.BranchDao;
import com.ty.hospital.dao.EncounterDao;
import com.ty.hospital.dao.PersonDao;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Person;

public class CreateEncounter {
	public static void main(String[] args) {
		PersonDao dao = new PersonDao();
		Person person = dao.getPersonById(1);

		BranchDao branchDao = new BranchDao();
		Branch branch = branchDao.getBranchById(1);

		if (branch != null && person != null) {
			Encounter encounter = new Encounter();
			encounter.setCause("Leg broken");
			encounter.setBranch(branch);
			encounter.setPerson(person);

			EncounterDao dao2 = new EncounterDao();
			dao2.createEncounter(encounter);
		}
	}

}
