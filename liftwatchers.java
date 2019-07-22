package liftwatchers;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.Component;
public class liftwatchers {
	
	
		
		public static void main(String[]args){
			
			
			
			
			Scanner touchscreen=new Scanner(System.in);
			int sum=0;
			int n=0;
			
			String input;
			
			n = Integer.parseInt(input); 
	        
	        int weight[] = new int[n];
	        
			input = JOptionPane.showInputDialog( "Enter all the weights: "); 

	        
	        for(int i=0; i < n; i++)
	        {
	            weight[i] = touchscreen.nextInt();
	        }
	        
	        for(int i=0; i < n; i++)
	        {
	            System.out.println(weight[i]); 
	        }
			
	        System.out.println("Enter goal weight  :");
	        sum=touchscreen.nextInt();
	        
	        subArraySum(weight,n,sum);
		
			touchscreen.close();
		} //close main
		
		
		
		static void subArraySum(int weight[], int n, int sum)  
	    { 
		
	        int curr_sum, i, j; 
	  
	        // Pick a starting point 
	        for (i = 0; i < n; i++)  
	        { 
	            curr_sum = weight[i]; 
	  
	            // try all subarrays starting with 'i' 
	            for (j = i + 1; j <= n; j++)  
	            { 
	                if (curr_sum == sum)  
	                { 
	                    int p = j - 1; 
	                  //  System.out.println("Sum found between indexes " + i 
	                    //        + " and " + p); 
	                    
	                    //prints the needed weights
	                    for(i=0;i<=p;i++)
	                    System.out.println(weight[i]);
	                    return;
	                    
	                   // return 1; 
	                } 
	                if (curr_sum > sum || j == n) 
	                    break; 
	                curr_sum = curr_sum + weight[j]; 
	            } 
	        } 
	  
	        System.out.println("No subarray found"); 
	        return;
	        //return 0; 
	    } //close method

		
} //close class
