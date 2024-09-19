package SeleniumCode;

public class SubstringTest {

	public static void main(String[] args) {
		
		
		 String s3= new String("Shweta weds gajanan");
	        
		// Find the index of the substring "weds"
				int index = s3.indexOf("weds");

				if (index != -1) {
				    // Extract the substring starting from the index of "weds"
				    String wedsSubstring = s3.substring(index, index + 4); // 4 is the length of "weds"
				    
				    // Print the extracted substring
				    System.out.println(wedsSubstring); // This will print "weds"
				} else {
				    // Handle case where "weds" is not found in the string
				    System.out.println("Substring 'weds' not found in the string.");
				}
			String s4 = new String ("one two Three");  
				    System.out.println(s4.substring(4, 7));
	
}}