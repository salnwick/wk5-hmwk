
//Q5
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		//Q8
		String newLog = "";
		for(int  i =0; i<log.length(); i++) {
			
			newLog +=log.charAt(i)+" ";
		}
	
		System.out.println(newLog);
		
		
	}


	@Override
	public void error(String error) {
		//Q9
		String newError = "";
		for (int i =0; i<error.length(); i++) {
			newError = newError + error.charAt(i) + " ";
		}
		System.out.println("\nERROR: " + newError);
		
		
		
	}

	

	


}
