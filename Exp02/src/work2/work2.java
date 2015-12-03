package work2;

public class work2 {
	public static void main(String args[])
	{
		int outputCount = 0;
		for(int i = 1; i <= 100; ++i)
		{
			if(i % 3 == 0)
			{
				System.out.println(i);
				if(++outputCount >= 5)
					break;
			}
		}
	}
}
