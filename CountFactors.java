package codility;

class CountFactors {

    public int solution(int N) {
		
		// check input is valid
		if(N <= 0) return 0;
		if(N == 1) return 1;

		// square root of N
		int sqrt = (int) Math.sqrt(N);
		int countFactors = 0;

		// counting the factors
		for(int i=1; i<=sqrt; i++){
			// if N / i = x means x and i are factors of N
			if(N % i == 0) countFactors += 2;
		}        

		// check if square root of N is a factor (integer)
		if(Math.pow(sqrt, 2) == N) countFactors--;
		
		return countFactors;
    }
}