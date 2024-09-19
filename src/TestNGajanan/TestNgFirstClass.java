package TestNGajanan;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgFirstClass 
{
	@Test(groups= {"Smoke"})
	public void demo1()
	{
		System.out.println("my First TestNg Class with 1st method + This One is my Smoke Test");
		
	}
	@Test(dependsOnMethods= {"xyz"})
	public void Aplhabetical()
	{
		System.out.println("I'm A");
	}
	@Test(enabled=false)
	public void demo2() {
		System.out.println("demo2 my First TestNg Class with 2nd method");
	}
	@AfterTest
	public void demo2d() {
		System.out.println("demo2d my First TestNg Class with 2nd method");
	}
	@Test@Parameters({"URL"})
	public void xyz(String URL)
	{
		System.out.println("Im a XYZ"+URL);
	}
	
}
