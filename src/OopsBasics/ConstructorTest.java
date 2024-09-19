package OopsBasics;

public class ConstructorTest extends Construcor3  {
	int a;  ///global variables 

	public ConstructorTest(int a)
	{               //instance variables //call to global variables by using This keyword
		super(a); //Access the parent class variables 
		this.a=a;
		
	}

	public int increment() {
		a = a + 1;
		return a;
	}

	public int Decrement() {
		a = a - 1;
		return a;
	}
}
