class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n)
	{
		int i;
		if(flowerbed.length==1 && flowerbed[0]==0 && n<=1)
			return true;
		for(i=0; i<flowerbed.length; i++)
		{
			if(flowerbed[i]==0)
			{
				if(i==0 && flowerbed[i+1]==0)
				{
					i++;
					n--;
				}
				else if(i==flowerbed.length-1 && flowerbed[i-1]==0)
				{
					i++;
					n--;
				}
				else if(i>0 && i <flowerbed.length-1 && flowerbed[i-1]==0 && flowerbed[i+1]==0)
				{
					i++;
					n--;
				}
			}
		}
		return n<=0;
	}
}