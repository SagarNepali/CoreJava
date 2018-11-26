package static_class_examples;


/**
 * Non static nested classes are inner class.
 * 
 * InnerClassDemo is actually an Outer class which will have some inner class.
 * 
 * TYPES
 * ------
 * 1. Member inner class
 * 2. Anonymous inner class
 * 3. Local inner class
 * 
 * 
 * 
 * @author sagar
 *
 */
public class InnerClassDemo {
	
	public static void main(String[] args){
		OuterClass.MemberInnerClass outerClass = new OuterClass().new MemberInnerClass();
		
		//accessing private member of inner class
		System.out.println(outerClass.getMember());
		outerClass.printOuterMember();
	}

}

class OuterClass{
	
	private String outerClassMember = "Outer Class private member"; 
	
	/** This is also inner class **/
	static OuterClass outerClass = new OuterClass(){
		{
			System.out.println("Inner class");
		}
	};
	
	
	protected class MemberInnerClass{
		
		private String innerClassMember ="Private Inner class Member";
		
		String getMember(){
			return innerClassMember;
		}
		
		void printOuterMember(){
			
			//accessing private member of outerClass from innerclass
			System.out.println(outerClassMember);
		}
	}
	
}

