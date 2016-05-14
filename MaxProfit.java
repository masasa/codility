package codility;

public class MaxProfit{
	
	public int solution(int[] A) {
        
        // check input is valid
		if(A == null || A.length < 2) return 0;

		int profit = 0, maxProfit = 0;


		int minPrice = A[0];
		for(int i=1; i<A.length; i++){
			
			// might be better for us to buy at day i and sell later
			profit = A[i] - minPrice;
			if(profit < 0) minPrice = A[i];

			// we stil make monney if we sell today
			// but we check if it's the maximaum we can make
			else if(profit > maxProfit) maxProfit = profit;
		}
        
        return maxProfit;
    }

}