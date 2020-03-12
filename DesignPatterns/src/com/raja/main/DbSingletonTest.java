package com.raja.main;

import com.raja.creational.BillBoughSingleton;
import com.raja.creational.DbSingleton;

public class DbSingletonTest {

	public static void main(String[] args) {
		DbSingleton instanceOne = DbSingleton.getDbSingletonInstance();
		System.out.println(instanceOne.hashCode());
		
		DbSingleton instanceTwo = DbSingleton.getDbSingletonInstance();
		System.out.println(instanceTwo.hashCode());
		
		System.out.println("===================================");
		
		BillBoughSingleton one = BillBoughSingleton.getInstance();
		System.out.println(one.hashCode());
		
		BillBoughSingleton two = BillBoughSingleton.getInstance();
		System.out.println(two.hashCode());
		
		

	}

}
