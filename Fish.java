package codility;

import java.util.Stacks;

class Fish {
    public int solution(int[] A, int[] B) {
    	// A contains sizes of the fish
        // B contains direction of the fish
        
        // checking input is valid
        if(A == null || B == null || A.length != B.length) return -1;
        
        int alive = A.length, currFish = 0;
        
        // used in order to remember the fish who needs to fight
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<A.length; i++){
            
            // downstream
            if(B[i] == 1) s.push(A[i]);
            else
                while(!s.isEmpty()){ // we have fish to face
                    
                	// a fish is going to be eaten
                    alive--;

                    currFish = s.pop();                    
                    if(currFish >  A[i]){
                        // downstream fish ate :)
                        s.push(currFish);
                        break;
                    }
                }
        }

       	return alive;
    }
}