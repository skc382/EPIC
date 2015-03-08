package epic.prep;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number\n");
		int input = scan.nextInt();
		int max_size = returnIntLength(input);
		int[] inArray = new int[max_size];
		
		//load inArray
		for(int i=max_size-1; i>0; i++)
		{
			inArray[i] = input % 10;
			input = input / 10;
		}
		
		//groups of two
		int group_size = max_size - 1;
		for(int i=0; i<group_size; i++)
		{
			
		}

	}

	public static int returnIntLength(int x)
	{
		int[] temp = {9,99,999,9999,99999,999999,9999999,99999999};
		
		for(int i=0; ;i++)
		{
			if(x < temp[i])
			{
				return i+1;
			}
		}
	}
}
