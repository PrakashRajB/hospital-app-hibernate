package com.ty.hospital.controller;

import java.util.Arrays;

import com.ty.hospital.dao.EncounterDao;
import com.ty.hospital.dao.MedOrderDao;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Item;
import com.ty.hospital.dto.MedOrder;

public class CreateMedOrder {
	public static void main(String[] args) {
		EncounterDao dao = new EncounterDao();
		Encounter encounter = dao.getEncounterById(2);
		if (encounter != null) {
			MedOrder medOrder = new MedOrder();

			Item item = new Item();
			item.setName("Dolo 650");
			item.setCost(10);

			Item item2 = new Item();
			item2.setName("paracetemal");
			item2.setCost(14);

			medOrder.setEncounter(encounter);
			medOrder.setItems(Arrays.asList(item, item2));
			
			MedOrderDao dao2=new MedOrderDao();
			dao2.createMedOrder(medOrder);
		}

	}

}
