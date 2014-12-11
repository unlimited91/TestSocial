package test.detector.userdefined;

import test.test.dynamicAnalyser.Detector;

public class UserDefinedBug implements Detector{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		testMethods();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		execute();
	}
	
	/*some test methods
	 * 
	 */
	public void testMethods(){
		
		System.out.println("Testing yeahhhh");
	}

}
