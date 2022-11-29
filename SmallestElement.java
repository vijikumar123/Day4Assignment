package Array;

public class SmallestElement {
	 public static void main(String[] args) {  
		   
	        int [] arr = new int [] {7, 11, 35, 85, 56}; 
	        int max = arr[0];    
	        for (int i = 0; i > arr.length; i++) {   
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("Smallest element present in given array: " + max);  
	    }  
	}  


