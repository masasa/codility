package codility;

import java.util.Arrays;

class Triangle {
    
    public int solution(int[] A) {
        
    	long sum = 0;

        // check input is valid
    	if(A == null || A.length < 3) return 0;

    	// first we sort the array - O(n*logn)
    	Arrays.sort(A);

    	// we lok at all the 3-somes of numbers and see if the lowest two
    	// numbers sum up for greater number than the third
    	for(int i=A.length-3; i>=0; i--){
    		sum = A[i] + A[i+1];
    		if(sum > A[i+2]) return 1;
    	}

    	// if we got here means we didn't find a triplet in the array
    	return 0;
    }
}