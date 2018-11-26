package other;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Java8DefaultMethod implements int1,int2 {

	@Override
	public void msg(String str) {
		// TODO Auto-generated method stub
		int1.super.msg(str);
	}
	
	static void method(){
		System.out.println("Class static");
	}

	public static void main(String[] args) throws IOException{
		new Java8DefaultMethod().msg("hello");
		int1.method();
		new Java8DefaultMethod().method();
		
		
		
		
		/*List<Integer>[] number = new ArrayList[10];
		number[0] = new ArrayList<Integer>(4);
		System.out.println(number);*/
		
		
		
		
	}
	
}


interface int1{
	default void msg(String str){
		System.out.println(str);
	}
	
	static void method(){
		System.out.println("Static method in an interface");
	}
}

interface int2{
	default void msg(String str){
		System.out.println(str);
	}
}