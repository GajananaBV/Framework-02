package OopsBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentClass {
	@AfterMethod
	public void Test1() {

		System.out.println("Iam Parent class Test1 Method");
	}

	@Test
	public void Test2() {
		System.out.println("Iam Parent class Test2 Method");
	}

	@BeforeMethod
	public void Test3() {
		System.out.println("Iam Parent class Test3 Method");
		
	}
}
