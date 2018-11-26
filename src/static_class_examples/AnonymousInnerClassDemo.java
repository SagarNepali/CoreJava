package static_class_examples;
/**
 * A class that have no name is known as a AnonymousInnerClass.
 * It should be used if you have to override method of class or interface.
 * 
 * 
 * @author sagar
 *
 */
public class AnonymousInnerClassDemo {

	public static void main(String [] a){
	
		GreetMessage gm = new GreetMessage();
		
		//Anonymously defining implementation of interface
		gm.greet(new Message() {
			
			@Override
			public String greet() {
				return "Anonymously defining method";
			}
		});
		
		AnonymousInnerClass an = new AnonymousInnerClass() {
			
			@Override
			void method() {
				System.out.println("hey there from implementation");
			}
		};
		an.method();
	}
}

/** The first way if a method takes interface object **/
interface Message{
	String greet();
}

class GreetMessage{
	
	void greet(Message message){
		
		System.out.println(message.greet());
	}
}


/** Second way **/

abstract class AnonymousInnerClass{
	abstract void method();
}



