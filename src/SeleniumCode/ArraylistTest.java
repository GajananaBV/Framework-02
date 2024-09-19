package SeleniumCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistTest {

	public static void main(String[] args) 
	{

ArrayList<String> a = new ArrayList<String>();

a.add("Gajanan");
a.add("Vilas");
a.add("Bhange");
System.out.println(a.get(2));
//here we can use Size instead of length
System.out.println("8888888888888888888888888888888888888888888888");
for(int i=0;i<a.size();i++)
{
	System.out.println(a.get(i));
}
System.out.println("8888888888888888888888888888888888888888888888");

for(String Value: a)
{
	System.out.println(Value);
}
System.out.println(a.contains("Vilas"));
System.out.println("8888888888888888888888888888888888888888888888");
String[] a1 = {"Shweta","Gajanan","Bhange"};
List<String> l = Arrays.asList(a1);
System.out.println(l);



	}

}
