package com.ty.hospital.controller;

import com.ty.hospital.dao.BranchDao;
import com.ty.hospital.dao.HospitalDao;
import com.ty.hospital.dto.Address;
import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Hospital;

public class SaveBranch {
	public static void main(String[] args) {

		HospitalDao dao = new HospitalDao();
		Hospital hospital = dao.getHospitalById(1);
		if (hospital != null) {
            Branch branch=new Branch();
            branch.setName("Basavangudi");
            branch.setPhoneNo(9000517459l);
            
            Address address=new Address();
            address.setCity("Bangalore");
            address.setPincode(520038);
            
            branch.setAddress(address);
            branch.setHospital(hospital);
            
            BranchDao branchDao=new BranchDao();
			branchDao.saveBranch(branch);
		}
	}

}
