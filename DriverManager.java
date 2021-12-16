package com.greatlearning.dept.main;

import com.greatlearning.dept.model.AdminDept;
import com.greatlearning.dept.model.HrDept;
import com.greatlearning.dept.model.TechDept;

public class DriverManager {

	public static void main(String[] args) {
		AdminDept obj1 = new AdminDept();
		System.out.println("Welcome to "+obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println("\n");
		
		HrDept obj2 = new HrDept();
		System.out.println("Welcome to "+obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());
		System.out.println("\n");
		
		TechDept obj3 = new TechDept();
		System.out.println("Welcome to "+obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());
	}
}
