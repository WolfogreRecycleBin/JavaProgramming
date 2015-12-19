package work3;

public class work3 {
	public static void main(String args[])
	{
		{
			int iArray[] = {1,2,3,4,5};
			float fArray[] = {6,7,8,9,10,11,12};
			boolean bArray[] = {false,true,false};
			for(int i : iArray)
				System.out.print(i + " ");
			System.out.println();
			for(float f : fArray)
				System.out.print(f + " ");
			System.out.println();
			for(boolean b : bArray)
				System.out.print(b + " ");
			System.out.println();
		}
		{
			int iArray[] = new int[5];
			float fArray[] = new float[7];
			boolean bArray[] = new boolean[3];
			for(int i = 0; i < iArray.length; ++i)
				iArray[i] = i;
			for(int i = 0; i < fArray.length; ++i)
				fArray[i] = i;
			for(int i = 0; i < bArray.length; ++i)
				bArray[i] = false;
			for(int i : iArray)
				System.out.print(i + " ");
			System.out.println();
			for(float f : fArray)
				System.out.print(f + " ");
			System.out.println();
			for(boolean b : bArray)
				System.out.print(b + " ");
			System.out.println();
		}
	}
}
