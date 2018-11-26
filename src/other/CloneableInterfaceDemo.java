package other;

public class CloneableInterfaceDemo implements  Cloneable{
	
	public int a = 1;
	public String s = "222";
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CloneableInterfaceDemo other = (CloneableInterfaceDemo) obj;
		if (a != other.a)
			return false;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "CloneableInterfaceDemo [a=" + a + ", s=" + s + "]";
	}



	public static void main(String[] args){
		CloneableInterfaceDemo obj1 = new CloneableInterfaceDemo();
		
		try {
			CloneableInterfaceDemo obj2 = (CloneableInterfaceDemo) obj1.clone();
			
			System.out.println(obj1.hashCode());
			System.out.println(obj2.hashCode());
			
			System.out.println(obj1.toString());
			System.out.println(obj2.toString());

			System.out.println(obj1.equals(obj2));
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
