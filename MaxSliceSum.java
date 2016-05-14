package codility;

class MaxSliceSum {

    public int solution(int[] A) {
        
    	int n = A.length, maxSum;
    	int[] maxEnds = new int[n];

    	// the max sum that ends at index 0 is the element itself
    	maxEnds[0] = A[0];
    	maxSum = maxEnds[0];

    	// finding the maximal slice
    	for(int i=1; i<n; i++){
    		maxEnds[i] = Math.max(maxEnds[i-1] + A[i], 0);
    		maxSum = Math.max(maxSum, maxEnds[i]);
    	}

    	return maxSum;
    }
}