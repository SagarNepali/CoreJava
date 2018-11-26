package answers;

/** Answer to question in resouce package with file name #1_questions. Page 1 **/
public class Q1 {
	
	int nextPerfectSquare(int arg){
		int num = 0;
	
		for(int i=arg+1;i>arg;i++){
			if(isPerfectSquare(i)){
				return i;
			}
		}
		
		return num;
		
	}
	
	boolean isPerfectSquare(int arg){
		double sqrt = Math.sqrt((double)arg);
       // return ((sqrt - Math.floor(sqrt)) == 0); 
        
        int x = (int) sqrt;
        if(Math.pow(sqrt,2) == Math.pow(x,2)){
        	return true;
        }
        return false;
	}

	public static void main(String[] args){
		Q1 obj = new Q1();
		
		System.out.println(obj.nextPerfectSquare(36));
	}
}
