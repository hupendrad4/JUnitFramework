package TestPracticeJunit;



import org.junit.AfterClass;
import org.junit.Test;

public class JunitAfterClass {

	@AfterClass
	public static void AfterClass() {
		
		System.out.println("Executed After Class ");
	}
	
	@Test
	public void unittest1() {
		System.out.println("Unittest1 execution");
	}
	
	@Test
	public void unittest2() {
		System.out.println("Unittest2 execution");
	}

}
