package javaInterviewPrograms;

public class MinMaxElemntArray {

		public static void main(String[] args) {
			int A[]= {12,65,98,99,342,88,3,789};
	        int max= A[0];//same logic for min value with change < operator 
	        int min=A[0];
	        for (int i=1;i<A.length;i++)
	        {
	        if(A[i]>max)
	        {
	        max=A[i];
	        //sMax=max;
	        
		} 
			  if(A[i]<min) 
			  {
				  min=A[i];
			  
			  }
			 
	        }
	         System.out.println("max element is:"+max);
	     	System.out.println("min element is:"+min);
	     	System.out.println(A.length);
		    }

	        }

