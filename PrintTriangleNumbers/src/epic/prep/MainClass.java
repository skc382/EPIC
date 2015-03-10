package epic.prep;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {4,7,3,6,7};
		printTriangle(input);
	}
	
	public static void printTriangle(int[] a)
	{
		if(a.length <= 1)
		{
			return;
		}
		
		int[] temp = new int[(a.length-1)];
		for(int i=0; i<(a.length-1); i++)
		{
			temp[i] = a[i] + a[i+1];
		}
		
		printTriangle(temp);
		printArray(temp);
	}

	public static void printArray(int[] a)
	{
		int i= 0;
		System.out.print("{{");
		while(i <= a.length-1)
		{
			System.out.print(a[i]+" ");
			i++;
		}
		System.out.print("}}");
		System.out.println();
	}
}
