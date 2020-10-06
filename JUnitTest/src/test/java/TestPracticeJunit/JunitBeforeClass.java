package TestPracticeJunit;

import org.junit.BeforeClass;
import org.junit.Test;

public class JunitBeforeClass {
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("Executed BeforeClass ");
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
