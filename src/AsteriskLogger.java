
//Q4
public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		//Q6
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		//Q7
		String asterisk = "*******************";
		System.out.println(asterisk);
		System.out.println("***" +"ERRROR: " + error + "***");
		System.out.println(asterisk);
		
	}


	
	

}
