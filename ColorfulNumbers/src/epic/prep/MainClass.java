package epic.prep;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number\n");
		int input = scan.nextInt();
		int returnInput = input;
		int max_size = returnIntLength(input);
		int[] inArray = new int[max_size];
		
		//load inArray
		for(int i=max_size-1; i>=0; i--)
		{
			inArray[i] = input % 10;
			input = input / 10;
		}
		
		//groups of two
		int group_size = max_size - 1; 
		boolean isColorful = false;
		for(int i=0; i<=group_size; i++)
		{
			
			for(int j = 0; j < max_size; j++)
			{
				int num = 0, power = i, prod;
				if((j+i) == (max_size))
					break;
				
				for(int k=j; k<=j+i; k++)
				{
					num = (int) (num + ((inArray[k])*(Math.pow(10, power))));
					power--;
				}
				
				prod = product(num);
				if(set.add(prod))
				{
					isColorful = true;
				}
				else
				{
					isColorful = false;
					break;
				}
			}
			if(!isColorful)
				break;
		}
		
		if(isColorful)
			System.out.println(returnInput+ " is colorful.");
		else
			System.out.println(returnInput + " is not colorful");

	}

	public static int product(int input)
	{
		int product = 1;
		int num = input;
		
		while(num>0)
		{
			product = product * (num%10);
			num = num / 10;
		}
		
		return product;
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
