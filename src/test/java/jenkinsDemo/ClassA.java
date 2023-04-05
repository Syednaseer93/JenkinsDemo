package jenkinsDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassA {
	@Test
	public void test() {
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("---------------This is Just to test Jenkins");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
		Reporter.log("--------------This is Just to test Jenkins", true);
	}
}
