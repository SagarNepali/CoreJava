package other;

public class This {

	void method(){
		System.out.println(this);
		
	}
	
	This retu(){
		return this;
	}
	
	
	public static void main(String... args){
		
		
		This oldThis = new This();
		oldThis.method();
		System.out.println(oldThis);
		
		This newThis = new This().retu();
		System.out.println(newThis);
		
	}
}


