package com.Greatlearning.main;

import com.Greatlearning.HR.HRDepartment;
import com.Greatlearning.admin.AdminDepartment;
import com.Greatlearning.tech.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminDepartment admin =new AdminDepartment();
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println("\n\n\n");
		
		
		HRDepartment Hr =new HRDepartment();
		System.out.println("Welcome to "+Hr.departmentName());
		System.out.println( Hr.doActivity());
		System.out.println(Hr.getTodaysWork());
		System.out.println(Hr.getWorkDeadline());	
		System.out.println(Hr.isTodayAHoliday());
		System.out.println("\n\n\n");
		
		
		TechDepartment Tech=new TechDepartment();
		System.out.println("Welcome to "+Tech.departmentName());
		System.out.println(Tech.getTodaysWork());
		System.out.println(Tech.getWorkDeadline());	
		System.out.println(Tech.isTodayAHoliday());
		System.out.println(Tech.getTechStackInformation());
		
		
		
	}

}
