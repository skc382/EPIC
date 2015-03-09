package epic.prep;

import java.util.*;

public class MainClass {
	
	public static HashSet<String> set = new HashSet<String>();
	public static void main(String[] argc)
	{
		int n = noOfPermutations(4);
		System.out.println(n);
		char[] ch = {'a','b','c','d'};
		
		bellAlgo(ch);
	}
	
	
	public static void bellAlgo(char[] a)
	{
		int count = 0, len = a.length, count1 = 0;
		while(count < len-1)
		{
			for(int i=0; i<len-1; i++)
			{
				display(a);
				a = swap(a, i, i+1);
				count1++;
			}
			
			display(a);
			a = swap(a, 0, 1);
			count1++;
			
			
			for(int i=len-1; i>0; i--)
			{
				display(a);
				a = swap(a, i, i-1);
				count1++;
				
			}
			display(a);
			a = swap(a, len-1, len-2);
			count1++;
			
			
			count++;
			
		}
		
		System.out.println(count);
		System.out.println(count1);
		System.out.println("Hashset val is: "+ set.size());
		
	}
	
	
	public static int noOfPermutations(int N)
	{
		int permutation = 1, i = 0;
		
		while(i < N)
		{
			permutation = permutation * (++i);
		}
		return permutation;
	}

	public static char[] swap(char[] a, int i, int j)
	{
		char temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		return a;
	}
	
	public static void display(char[] a)
	{
		String val = new String();
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
			val += a[i];
		}
		System.out.println();
		set.add(val);
	}
}











