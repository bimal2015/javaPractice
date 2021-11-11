package com.restapiconsume.restapiexample;

public class SingletonWithThreadLock {
	private static SingletonClass_Lazy instance;
	private String s;
	
	public SingletonWithThreadLock() {
		s="Hellow for singleton";
	}
	public static SingletonClass_Lazy getInstance() {
		lock(){
		if(instance==null) {
			instance = new SingletonClass_Lazy();
		}
		return instance;
		}
	}
	
}
