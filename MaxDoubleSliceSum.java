package codility;

class MaxDoubleSliceSum {

    public int solution(int[] A) {

    	int n = A.length, sum = 0;
    	int[] maxEnds = new int[n];
    	int[] maxStarts = new int[n];


    	// find the maximal slice sum of A that ends in index i
    	for(int i=1; i<n; i++)
    		maxEnds[i] = Math.max(maxEnds[i-1] + A[i], 0);
    	
    	// find the maximal slice sum of A that starts in index i
    	for(int i=n-2; i>=0; i--)
    		maxStarts[i] = Math.max(maxStarts[i+1] + A[i], 0);

    	// now we find the maximal sum of double slice
    	for(int i=1; i<n-1; i++)
    		sum = Math.max(maxEnds[i-1]+maxStarts[i+1], sum);

    	return sum;
    }
}