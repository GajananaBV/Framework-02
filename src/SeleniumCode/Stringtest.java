package SeleniumCode;

public class Stringtest {

	public static <Stirng> void main(String[] args) {
		String s1="gajanan";
		String s2="gajanan weds shweta";
		System.out.println(s2);
		
        String s3= new String("Shweta weds gajanan");
        
      String[] Spiltted= s3.split("weds");
      
		System.out.println(Spiltted[0]);
		System.out.println(Spiltted[1]);
		System.out.println(Spiltted[1].trim());
		
		System.out.println("**********************************************************");
		String[] Split2 = s3.split(" ");
	
		System.out.println(Split2[0]);
		System.out.println(Split2[1]);
		System.out.println(Split2[2]);
		//Reveres string 
		for(int i=s3.length()-1;i>=0;i--)
		{
			System.out.print(s3.charAt(i));
			
		}
		System.out.println("********************************");
		
		
	
	}}
