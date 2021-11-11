package com.restapiconsume.restapiexample;

public class SingletonClass_Lazy {
	private static SingletonClass_Lazy instance;
	private String s;
	
	public SingletonClass_Lazy() {
		s="Hellow for singleton";
	}
	public static SingletonClass_Lazy getInstance() {
		if(instance==null) {
			instance = new SingletonClass_Lazy();
		}
		return instance;
		}
	
}