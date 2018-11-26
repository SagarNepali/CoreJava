package static_class_examples;

/**
 * A class i.e created inside a method is called Local Inncer Class
 * To invoke the methods of local inner class, you must instantiate the inner class inside the method. 
 * 
 * 
 * @author Sagar
 *
 */

public class LocalInnerClassDemo {
	
	public static void main(String [] a){
		new Outer().justAMethod();
	}

}

class Outer{
	
	private String outerPrivateMember = "Private Outer String";
	
	//declaring a method
	void justAMethod(){
		//declaring class inside method
		class LocalInnerClass{
			void display(){
				System.out.println(outerPrivateMember);
			}
		}
		
		
		//instantiation of class is required inside method for its invocation
		LocalInnerClass localInnerClass = new LocalInnerClass();
		localInnerClass.display(); 
	}
	
	
	
}
