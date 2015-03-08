package epic.prep.spiralMatrix;

public class MainClass {
	
	public static void main(String[] argc)
	{
		int size = 5;
		int[][] a = new int[size][size];
		int k=1;
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				a[i][j] = k;
				k++;
			}
		}
		size = size-1;
		
		int limit = size, i=0, j=0;
		while(limit > 0)
		{
			j = increaseJ(a, i, j, limit);
			i = increaseI(a, i, j, limit);
			j = decreaseJ(a, i, j, size-limit);
			limit = limit-1;
			i = decreaseI(a,i, j, size-limit);
		}
	}
	
	public static int increaseJ(int[][] a, int i, int j, int limit)
	{
		
		while(j < limit)
		{
			System.out.println(a[i][j]);
			j++;
		}
		return j;
	}
	
	public static int decreaseJ(int[][] a, int i, int j, int limit)
	{
		
		while(j > limit)
		{
			System.out.println(a[i][j]);
			j--;
		}
		return j;
	}
	
	public static int increaseI(int[][] a, int i, int j, int limit)
	{
		
		while(i < limit)
		{
			System.out.println(a[i][j]);
			i++;
		}
		return i;
	}
	
	public static int decreaseI(int[][] a, int i, int j, int limit)
	{
		
		while(i > limit)
		{
			System.out.println(a[i][j]);
			i--;
		}
		return i;
	}

}
