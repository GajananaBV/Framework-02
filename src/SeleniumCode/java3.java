package SeleniumCode;

public class java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		    
		    double[] arr ={5.5,4.4,6.6,8.8,9.9};
		    System.out.println("The first element of the numbers array. "+ arr[0]+"  &"+ "   The last element of the numbers array  "+ arr[4]);
		   double count= arr.length ;
		   System.out.println(count);
		   
		   double sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		   System.out.println(sum);
				   
		    for(int i=0;i<arr.length; i++)
		    {
		        System.out.println(arr[i]);
		      
		    }
		   // using a loop, print the elements of the numbers array in reverse order 
		   // decremental order( reverse)
		   for( int i = arr.length-1;i>0;i-- )
		  
		    {
		    	
		    	System.out.println("Using a loop, print the elements of the numbers array in reverse order  "+ arr[i]);
		    }
		 
		    
		    
		}
	}

