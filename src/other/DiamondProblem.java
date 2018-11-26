package other;

public class DiamondProblem {

	public static void main(String[] args){
		new D().get();
	}
}

class A{
	
	A(){
		super();
		System.out.println("A cons");
	}
	public void get(){
		System.out.println("A");
	}
}

class B extends A{
	
	B(){
		super();
		System.out.println("B cons");
	}
	public void get(){
		System.out.println("B");
	}
}

class C extends B{
	
	C(){
		super();
	}
	
	public void get(){
		System.out.println("C");
	}
}

class D extends C {
	
	D(){
		super();
		System.out.println("D Cons");
	}
}


