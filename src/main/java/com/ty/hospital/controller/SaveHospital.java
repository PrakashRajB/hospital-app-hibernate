package com.ty.hospital.controller;


import com.ty.hospital.dao.HospitalDao;
import com.ty.hospital.dto.Hospital;

public class SaveHospital {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setName("SRM hospital");
		
		HospitalDao dao=new HospitalDao();
		dao.saveHospital(hospital);
	}

}
