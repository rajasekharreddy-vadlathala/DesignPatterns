package com.raja.creational;

public class BillBoughSingleton {
	
	private BillBoughSingleton() {
		
	}
	private static class SingletonHelper{ // it will not loaded 
        private static final BillBoughSingleton INSTANCE = new BillBoughSingleton();
	}
	
	public static BillBoughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

}
