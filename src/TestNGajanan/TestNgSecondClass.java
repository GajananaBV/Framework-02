package TestNGajanan;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgSecondClass
{
	@Test(timeOut=4000)
	public void MySecondClass1()
	{
		System.out.println("MySecondClass with fist method");
	}
	@Parameters({"URL"})
	@Test
	public void MySecondClass2(String URL)
	{
		System.out.println(URL);
	}
}
