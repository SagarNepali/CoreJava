package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

public class InheritanceExceptionExample {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ParentThrowingParentException p = new ChildWithParentException();
		try{
			p.msg();
		}finally{
			
		}
	}
}

class ParentThrowingParentException {
	
	void msg() throws FileNotFoundException{
		
		System.out.println("Parent");
	}
}

class ChildWithParentException extends ParentThrowingParentException{
	
	void msg() throws RuntimeException {
		System.out.println("Child");
		
	}
}
