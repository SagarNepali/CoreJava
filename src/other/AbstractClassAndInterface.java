package other;


// Creating abstract class that provides the implementation of one method of A
// interface
abstract class Baje implements interface1 {
	public void c() {
		System.out.println("I am C");
	}
	
	
}

// Creating subclass of abstract class, now we need to provide the
// implementation of rest of the methods
class Mama extends Baje{
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}
}

public class AbstractClassAndInterface {

	public static void main(String[] args){
		interface1 a= new Mama();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}

interface interface1 {
	void a();// bydefault, public and abstract

	void b();

	void c();

	void d();
}
