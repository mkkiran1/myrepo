import java.util.HashMap;
import java.util.Map;

/**
 * HeapSpaceSimulator
 * 
 * @author Ravi
 *
 */
public class HeapSpaceSimulator {
	
	private String fieldData = "";
	
	//static cache
	
	private static Map<String, HeapSpaceSimulator> leakContainer = new HashMap<String, HeapSpaceSimulator>();
	private final static String dataPrefix = "DataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataData";
	private final static boolean slowExecution = true;
	
	public static void main(String[] args) {
		System.out.println("Start....");
		
		try{
		for (int i = 0; i < 1000000; i++) {
			String data = dataPrefix+i;
			leakContainer.put(data,new HeapSpaceSimulator());
			
			if (slowExecution){
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		}catch(Throwable e){
			System.out.println("HeapSpaceSimulator failure ....");
			throw e;
		}
		System.out.println("\n End...");
		}
}
