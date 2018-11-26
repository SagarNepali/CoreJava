package other;

public class CallByValue {

	int data = 50;
	
	void change(int data) {
		data = data+100;
	}
	
	public static void main(String [] args){
		CallByValue all = new CallByValue();
		
		System.out.println(all.data);
			all.change(500);
		System.out.println(all.data);
		
		
	}
	
}
