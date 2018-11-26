package oop;

public class PrivateMemberAccessUsingInheritance {

	public static void main(String p[]){
		Child child = new Child();
		System.out.println(child.msg()); 
	}
}

class Parent{
	
	private String test = "hey";
	protected String protString = "FEASUBKE";
	
	public String getMember(){
		return test;
	}
	
	
}

class Child extends Parent {
	
	String msg(){
		System.out.println(super.protString);
		return super.getMember();
	}
}