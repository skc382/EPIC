package epic.prep;

import java.util.*;

public class MainClass {
	
	
	public static void main(String[] argc)
	{
		int[][] input = new int[100][10];
		Random gen = new Random();
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<100; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(gen.nextBoolean())
					input[i][j] = 0;
				else
					input[i][j] = 1;
			}
		}

			for(int j=0; j<10; j++)
			{
				input[10][j] = 0;
				input[20][j] = 0;
				input[40][j] = 0;
				input[60][j] = 0;
				input[70][j] = 0;
				input[99][j] = 0;
			}
		
		
		stack = parseMatrix(input);
		
	}
	
	public static Stack<Integer> parseMatrix(int[][] a)
	{
		Stack<Integer> stack = new Stack<Integer>();
		int rowLength = a.length, colLength = a[0].length;
		
		stack.push(0);
		for(int i = 0; i < rowLength; i++)
		{
			
			if(!stack.isEmpty())
			{
				if(i - (stack.peek()) > 10)
				{
					System.out.println("Focing page break at: "+ (i-1));
					for(int j=0; j<colLength; j++)
					{
						a[i-1][j] = 0;
					}
					stack.push(i-1);
				}
			}
			
			for(int j=0; j<colLength; j++)
			{
				if(a[i][j] == 0)
				{
					if(j==9)
					{
						System.out.println("Page break occurred at: "+ (i) );
						stack.push(i);
					}
					continue;
				}
				else
				{
					System.out.println("Not a page break line");
					break;
				}
			}
			
		}
		
		return stack;
	}

}
