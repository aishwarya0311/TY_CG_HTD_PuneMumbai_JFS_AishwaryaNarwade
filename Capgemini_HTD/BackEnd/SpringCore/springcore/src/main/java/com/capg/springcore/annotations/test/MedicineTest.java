package com.capg.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.springcore.annotations.beans.Medicine;

public class MedicineTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("MedicineConfig.xml");
		Medicine medicine = context.getBean("medicine", Medicine.class);
		System.out.println("Medicine name  : " + medicine.getName());
		System.out.println("Medicine type  : " + medicine.getType());
		System.out.println("Medicine  Price : " + medicine.getPrice());
//System.out.println("Medicine Drugs " + medicine.getDrugs());
		System.out.println("Medicine Drugs Content : " + medicine.getDrugset());

	}// end of main()

}// end of class
