package codility;

class BinaryGap {

    public int solution(int N) {
        
    	int maxGap = 0, currGap = 0;

		// getting rid of the tailing 0's
		while((N % 2 == 0) && N > 0) N /= 2;

		if(N <= 0) return 0;

		// lsb is 1, let's remove it
		N /= 2;
		
		// as long as we have bit's
		while(N > 0){
			if(N % 2 == 0) currGap++;
			else{
				// we reached the closing 1 bit
				if(currGap > maxGap) maxGap = currGap;
				currGap = 0;	
			}

			// shifting right
			N /= 2;
		}

    	return maxGap;
    }
}