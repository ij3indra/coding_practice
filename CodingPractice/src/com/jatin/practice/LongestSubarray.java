package com.jatin.practice;

import java.util.HashSet;

public class LongestSubarray {
	
	
	public static void main(String aa[]) {
		int arr[] = {1,2,3,4,5};
		
		
		int i, j, Max = 1;
		int n = arr.length;
		 
	    // Initialize set 
	    HashSet<Integer> s = new HashSet<Integer>(); 
	 
	    for(i = 0; i < n - 1; i++) 
	    { 
	         
	        // Store 1st element of 
	        // sub-array into set 
	        s.add(arr[i]); 
	 
	        for(j = i + 1; j < n; j++) 
	        { 
	             
	            // Check absolute difference 
	            // between two elements 
	            if (Math.abs(arr[i] - arr[j]) == 0 || 
	                Math.abs(arr[i] - arr[j]) == 1) 
	            { 
	                 
	                // If the new element is not 
	                // present in the set 
	                if (!s.contains(arr[j])) 
	                { 
	                     
	                    // If the set contains 
	                    // two elements 
	                    if (s.size() == 2) 
	                        break; 
	 
	                    // Otherwise 
	                    else
	                        s.add(arr[j]); 
	                } 
	            } 
	            else
	                break; 
	        } 
	        if (s.size() == 2) 
	        { 
	             
	            // Update the maximum 
	            // length 
	            Max = Math.max(Max, j - i); 
	 
	            // Remove the set 
	            // elements 
	            s.clear(); 
	        } 
	        else
	            s.clear(); 
	    } 
	    System.out.println(Max);
		
		
	}

}
