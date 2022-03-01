import java.util.HashSet;

public class BuddyStrings859 {

	public static void main(String[] args) {
		
		String A="abaa";
		String B="abaa";
		System.out.println(buddyStrings(A,B));
	}

	private static boolean buddyStrings(String A, String B) {
		int count=0;
		if(A.equals("") || A.length()!=B.length())
			return false;
		char original=' ',replaced=' ';
		if(A.equals(B))
        {
            Boolean result = checkForRepeat(A);
            return result;
        }
		char[] aa = A.toCharArray();
		char[] bb = B.toCharArray();
	
		for(int i =0; i< aa.length;i++)
		{
			if(aa[i]!=bb[i] && count ==0)
			{
				original = aa[i];
				replaced = bb[i];
				count++;
			}
			else if(aa[i]==replaced && bb[i]==original && count==1)
			{
				count++;
				continue;
				
			}
			else if(aa[i]==bb[i])
			{
				continue;
			}
			else
			{
				return false;
			}
		}
 		
		
		if(count>1) 
			return true;
		else
			return false;

	}

	public static boolean checkForRepeat(String B)
    {
        HashSet<Character> set = new HashSet<Character>();
        char[] temp = B.toCharArray();
        for(int i=0;i<temp.length;i++)
        {
            if(set.contains(temp[i]))
            {
            	return true;
            }
            else
            {
            	set.add(temp[i]);
            }
        }
        return false;
    }
}
