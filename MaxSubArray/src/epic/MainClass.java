package epic;

class MaxSubArray{
	int[] solution(int[] n){
		if(n.length <2)
			return null;
		if(n.length == 2)
			return n;

		int maxStart = 0;
		int maxEnd = 1;
		int maxHereStart = 0;
		int maxHereEnd = 1;
		int max_ending_here = n[0] + n[1];
		int max_so_far = max_ending_here;
		for(int i = 2; i < n.length ; i ++){
			if(n[i]+n[i-1] > (max_ending_here + n[i]))
			{
				max_ending_here = n[i]+n[i-1];
				maxHereEnd = i;
				maxHereStart = i-1;
			}else
			{
				max_ending_here = max_ending_here + n[i];
				maxHereEnd = i;
			}
			if(max_ending_here > max_so_far){
				max_so_far = max_ending_here;
				maxStart = maxHereStart;
				maxEnd = maxHereEnd;
			}
		}

		int[] result = new int[maxEnd - maxStart+1];
		for(int k = 0; k<= (maxEnd-maxStart); k++){
			result[k] = n[k+maxStart];
		} 
		return result;
	}

}
