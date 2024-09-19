package SeleniumCode;

public class java1 {

	public static void main(String[] args) 
	{

         int mynum  = 5;
        String name = "Gajanan";
          char letter ='G';
             double Decimal = 5.5;
             boolean check = false;
             
             System.out.println(name.length());
             //ARRAY
            // Sceanrio1
             int[] arr = new int[3];
             arr[0]=10;
             arr[1]=12;
             arr[2]=1996;
             System.out.println("My Birthday "+arr[0]+" "+arr[1]+" "+arr[2]);
//Sceanrio2
             int[] arr2 = {13,12,1996};
             System.out.println(arr2[2]);
             
             //For LOPP
             for(int i=0;i<arr.length;i++)
             {
            	 System.out.println(arr[i]);
            	
            	 
             }
             for (int i=1; i<arr2.length; i++)
             {
            	 System.out.println(arr2[i]);
            	 
             }
             
             String[] Name = {"gajanan","wed's","Shweta"};
             for(int i=0;i<Name.length;i++)
            {
           	 System.out.println(Name[i]);
            }
             for(String s : Name)
             {
            	 System.out.println(s);
             }
             }
        
             
  	}


