package codility;

import java.util.Arrays;

public class MaxProductOfThree{

	public int solution(int[] A) {
        
        int n = A.length;
		int mul = 0;

        // incase of invalid input return 0
		if(A == null || A.length < 3) return 0;

		// sorting the array - O(n*logn)
		Arrays.sort(A);

		// finding the maximal product of possible max triplets
		mul = Math.max(A[n-1]*A[n-2]*A[n-3], A[n-1]*A[0]*A[1]);

		return mul;
    }

}
