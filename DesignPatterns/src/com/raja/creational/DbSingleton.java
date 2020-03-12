package com.raja.creational;

public class DbSingleton {
	
	private static volatile DbSingleton instance = null;
	//using reflection api we can create another singleton instance ..to avoid create 
	//duplicate singleton
	private DbSingleton() {
		if(instance != null) {
			throw new RuntimeException("Please use getInstance method to get singleton");
		}
	}
	
	public static DbSingleton getDbSingletonInstance() {
		
		if(instance == null) {
			synchronized (DbSingleton.class) {
				if(instance == null) {
					instance = new DbSingleton();
					return instance;
				}
			}
		}
	  
		return instance;
	}

}
