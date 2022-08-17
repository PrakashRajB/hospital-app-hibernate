package com.ty.hospital.controller;

import com.ty.hospital.dao.HospitalDao;
import com.ty.hospital.dto.Hospital;

public class GetHospitalById {
	public static void main(String[] args) {
		HospitalDao dao = new HospitalDao();
		Hospital hospital = dao.getHospitalById(2);
		System.out.println(hospital.getName());
	}

}
