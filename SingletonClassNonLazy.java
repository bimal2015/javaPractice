package com.restapiconsume.restapiexample;

public class SingletonClassNonLazy {
private static SingletonClassNonLazy instance=new SingletonClassNonLazy();
public SingletonClassNonLazy getInstance() {
	return instance;
}
}
