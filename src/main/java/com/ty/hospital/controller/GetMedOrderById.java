package com.ty.hospital.controller;

import com.ty.hospital.dao.MedOrderDao;
import com.ty.hospital.dto.MedOrder;

public class GetMedOrderById {
	public static void main(String[] args) {
		MedOrderDao dao = new MedOrderDao();
		MedOrder medOrder = dao.getMedOrderById(1);
		System.out.println(medOrder);
	}

}
