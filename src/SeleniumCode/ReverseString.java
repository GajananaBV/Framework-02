package SeleniumCode;

import org.testng.Assert;

public class ReverseString {

	public static void main(String[] args)
	{
		

		String s= "gajanan";
		
		String s1=new String ("Gajanan Shweta");
		
		String[] Spillted = s1.split(" ");
		System.out.print(Spillted[0]);
		System.out.print(Spillted[1]);
		
		System.out.println("********************************************************************");
		
		for(int i=s.length()-1;i>0;i--)
		{
			
			System.out.print(s.charAt(i));
	
			
		}
		System.out.println("********************************************************************");
		for(int i=s1.length()-1;i>0;i--)
		{
			
			System.out.print(s1.charAt(i));
			
	
			
		}
		
		
		
Assert.assertEquals(null, false);
		
		
		
		
		
		
		
		
		
		
	}

}
