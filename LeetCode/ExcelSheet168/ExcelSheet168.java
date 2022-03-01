package ExcelSheet168;

public class ExcelSheet168 {
	public static void main(String args[])
	{
		System.out.println(convertToTitle(780));
	}

	private static String convertToTitle(int n) {
		String word="";
		while(n>0)
		{
			if(n%26==0)
			{
				word=(char)((n%26)+90)+word;
				n--;
			}
			else
				word=(char)((n%26)+64)+word;
			n/=26;
		}
		return word;
	}
}