import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String colors = br.readLine();
		if (colors.length() > 2)
		{
			System.out.println(solver(colors));
		}
		else
		{
			System.out.println("No Winner");
		}
	}

	public static String solver(String colors)
	{
		StringBuilder str = new StringBuilder(colors);
		boolean lastTurn = false; // true = wendy, false = bob
		int i = 0;
		while (str.length() >= 3)
		{
			if (lastTurn == false)
			{
				i = str.indexOf("www", i);
				if (i == -1 || i >= str.length() - 2)
				{
					break;
				}
				else if (i != -1)
				{
					str.deleteCharAt(i + 1);
					lastTurn = true;
					i = 0;
				}
			}
			else
			{
				i = str.indexOf("bbb", i);
				if (i == -1 || i >= str.length() - 2)
				{
					break;
				}
				else if (i != -1)
				{
					str.deleteCharAt(i + 1);
					lastTurn = false;
					i = 0;
				}
			}
		}
		return lastTurn ? "wendy" : "bob";
	}
}