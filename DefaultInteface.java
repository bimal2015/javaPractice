package com.restapiconsume.restapiexample;

public interface DefaultInteface {
default void print() {
	System.out.println("This is a default method");
};

void printNotDefault();
}
