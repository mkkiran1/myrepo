
public class singleTonEx {

	public static int i;
	static singleTonEx ston = null;

	public singleTonEx() {
		super();
		// TODO Auto-generated constructor stub
		singleTonEx.i=10;
		System.out.println("From the default constructor: "+i);
	}
	
	public static void main(String args[]){
		System.out.println("from the Main value of i is: "+i);
		
		if(ston == null){
			System.out.println("from the if ston == null");
			 ston = new singleTonEx();
			 System.out.println("ston instantiated and i value is: "+ston.i);
		}
	}
	
}

