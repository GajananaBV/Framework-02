package SeleniumCode;

public class DebugTest {

	public static void main(String[] args) {
		String s1 ="Adithya";
	    String s2 ="Adithya ";
	    String s3 ="String Handling in Java ";
	    
	    boolean x =s1.equals(s2);
	    System.out.println("Compare s1 and s2 :"+x);
	    
	    System.out.println("Character at given position is :"+s1.charAt(0));
	    System.out.println(s1.concat(" the author"));
	    System.out.println(s1.equals(s2.trim()));
	    System.out.println(s1.toLowerCase());
	    System.out.println(s1.toUpperCase());
	    System.out.println(s3.indexOf('a'));
	    System.out.println(s1.substring(0,4));
	    System.out.println("Before Removing Space :"+s3);
	    System.out.println("After Removing Space  :"+s3.trim());
	    System.out.println("**********************************************************");
	    
	    String[] Spiltted = s3.split("Handling");
	    System.out.print(Spiltted[0]);
	    System.out.print(Spiltted[1]);
	    //System.out.print(Spiltted[2]);
	    //System.out.print(Spiltted[3]);
	    System.out.println("888888***********************************");
	    System.out.println(s3.contains("Handling"));
	    boolean GB = s3.contains("Handling");
	    
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    }
	   

	}


