package OopsBasics;

import org.testng.annotations.Test;

public class Constructor2 {
	
	
	
	@Test
	public void RunCalc()
	{
		int a=3;
		ConstructorTest c=new ConstructorTest(a);
		System.out.println(c.increment());
		System.out.println(c.Decrement());
		System.out.println(c.MutliplyTwo());
		System.out.println(c.MutliplyThree());
		
	}

}
