package com.ty.hospital.controller;

import com.ty.hospital.dao.BranchDao;
import com.ty.hospital.dto.Branch;

public class GetBranchById {
	public static void main(String[] args) {
		BranchDao branchDao = new BranchDao();
		Branch branch = branchDao.getBranchById(1);
		System.out.println(branch);
	}

}
