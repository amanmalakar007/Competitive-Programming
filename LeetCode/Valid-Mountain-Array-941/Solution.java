class Solution {
    public boolean validMountainArray(int[] arr) {
        final int MIN_ARRAY_LENGTH=3;
		final int ARRAY_LENGTH=arr.length;
		int pivot=-1;
		if(arr.length<MIN_ARRAY_LENGTH)
			return false;
		for(int i=0; i<ARRAY_LENGTH-1; i++)
		{
			if(arr[i]==arr[i+1]) //array should be strictly increasing until pivot
				return false;
			else if(arr[i]>arr[i+1])
			{
				pivot=i;
				break;
			}
		}
		if(pivot<=0 || pivot>=ARRAY_LENGTH-1)
			return false;
		for(int i=pivot+1; i<ARRAY_LENGTH-1; i++)
		{
			if(arr[i+1]>=arr[i])  //array should be strictly decreasing after pivot
				return false;
		}
		return true;
    }
}