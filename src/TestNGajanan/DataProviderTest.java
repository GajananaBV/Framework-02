package TestNGajanan;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="GetData")
	public void CreditCard(String Username, String Passowrd)
	{
		System.out.println("1st Credit Card  section username & password  ");
		System.out.println(Username);
		System.out.println(Passowrd);
	}
	
	@Test(dataProvider="GetData")
	public void DebitCard(String Username, String Passowrd)
	{
		System.out.println("2nd Debit Card  section username & password   ");
		System.out.println(Username);
		System.out.println(Passowrd);
	}
	@Test(dataProvider="GetData")
	public void VisaCard(String username, String password)
	{
		System.out.println("//3rd Visa Card  section username & password   ");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@DataProvider
	@Test
	public Object[][] GetData()
	{
		//1st Credit Card  section username & password      [0]
		//2nd Debit Card  section username & password       [1]
		//3rd Visa Card  section username & password        [2]
		
		Object[][] data =new Object[3][2]; //3means Row & means Column
		//1st Credit Card  section username & password
		data[0][0]="Username";
		data[0][1]="password";
		//2nd Debit Card  section username & password\
		data[1][0]="Username";
		data[1][1]="password";
		//3rd Visa Card  section username & password 
		data[2][0]="Username";
		data[2][1]="password";
		return data;
	}

}
