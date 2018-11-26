package exception;

public class TryCatchFinally {
	
	public static void main(String...args){
		System.out.println(main());
	}
	
	public static int main(){
		
		int i = 0;
		try{
			i= 1;
			if(true){
//				throw new Exception();
			}
		}catch(Exception e){
			System.out.println("catch block");
			i = 2;
//			return i;
		}finally{
			System.out.println("finally block");
			i = 11;
//			return i;
		}
		return i;
	}
	
	
}
