package com.finilize;

public class finilizeMethod {
	finilizeMethod(){
		System.out.println("object is created");
		
	}
	protected void finilize() {
		System.out.println("object is destoyed");
	}
}
class finilizeMethodDemo{
	public static void main(String[] args) {
		finilizeMethod h=new finilizeMethod();
		h=null;
	}
}