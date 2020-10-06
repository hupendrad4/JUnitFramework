package TestPracticeJunit;

import org.junit.After;
import org.junit.Test;

public class JunitAfterMethod {

	@After
	public void After() {

		System.out.println("This should be printed after methods");

	}

	@Test
	public void junit1() {
		System.out.println("This is method 1");
	}

	@Test
	public void junit2() {
		System.out.println("This is method 2");
	}

}
