package other;

public class PrivateAccessInheritance {

	private String dataMember ="Private field";
	
	protected String protectedMethod(){
		return dataMember;
	}
	
	public String publicMethod(){
		return dataMember;
	}
	
	protected String privateMethod(){
		return dataMember;
	}
	
	protected void changePrivateField(String pvt ){
		this.dataMember = pvt;
	}
	
	public static void main(String [] args){
		SubClass subClass = new SubClass();
		
		subClass.setPrivateMember(subClass.protectedMethod());
		
		System.out.println(subClass.protectedMethod());
		
		System.out.println(subClass.getPrivateMember());
		
		subClass.changePrivateField("Change Private field from chhild");
		System.out.println(subClass.protectedMethod());
		
	}
}

class SubClass extends PrivateAccessInheritance{
	
	private String privateMember;
	
	void setPrivateMember(String privateMember){
		this.privateMember = privateMember+" set from Child";
	}

	public String getPrivateMember() {
		return privateMember;
	}
	
	
}



