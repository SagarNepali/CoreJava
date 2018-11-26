package static_class_examples;
/**
 * 
 * Class which is static and is inside another class is known as Nested class.
 * 
 * 1. Nested class cannot access private member of Outer class.
 * 2. Only static members could be accessed by outer class. 
 * 3. Outer class cannot access any member of Nested Class
 * 
 * @author sagar
 *
 */
public class NestedClass {
	
	private static String outerString = "";
	private String notStaticString="";
	
	
	//static inner class in called nested class
	private static class StaticInnerClass{
		
		private static String innerString = "innerStatic member";
		
		void changeOuterMember(String msg){
			outerString = msg;
			System.out.println(outerString);
		}
	}
	
	public static void main(String[] args){
		NestedClass.StaticInnerClass obj = new StaticInnerClass();
		obj.changeOuterMember("Changed by inner class.");
		
		NestedClass nestedClass = new NestedClass();
		System.out.println(nestedClass.outerString="Changed by outer class");
	}

}
