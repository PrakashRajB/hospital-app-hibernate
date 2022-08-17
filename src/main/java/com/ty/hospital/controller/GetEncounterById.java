package com.ty.hospital.controller;

import com.ty.hospital.dao.EncounterDao;
import com.ty.hospital.dto.Encounter;

public class GetEncounterById {
	public static void main(String[] args) {
		EncounterDao dao = new EncounterDao();
		Encounter encounter = dao.getEncounterById(2);
		System.out.println(encounter);
	}

}
