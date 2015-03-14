package epic.matrixsearch;

import epic.matrixsearch.MyLinkedList.Node;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] matrix =  {{'e','t','y','u','j'},
							{'g','g','k','l','h'},
							{'s','h','r','e','f'},
							{'h','f','r','e','t'},
							{'r','t','h','a','e'}};
		
		int m=5, n=5;
		char[] word = {'s','h','r','e','e'};
		
		if(wordSearch(matrix, m, n, word))
			System.out.println("found");
		else
			System.out.println("not found");
		
	}
	
	public static boolean wordSearch(char[][] matrix, int m, int n, char[] word)
	{
		//Create linkedList
		MyLinkedList list = new MyLinkedList();
		Node p;
		boolean[][] visited = new boolean[m][n];
		boolean found = false;
		
		for(char ch : word)
		{
			list.add(ch);
		}
		
		p = list.getFirstElement();
		
		for(int i=0; i < m; i++)
			for(int j=0; j<n; j++)
				visited[i][j] = false;
		
		
		for(int i=0; i < m; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(patternSearch(matrix, i, j, m, n, p, visited))
					found = true;
			}
			if(found)
				break;
		}
		
		return found;
		
	}
	
	
	public static boolean patternSearch(char[][] matrix, int i, int j, int m, int n, Node pointer, boolean[][] visited )
	{
		
		final int[] delta_i = {-1, -1, -1, 0, 1, 1, 1, 0 };
		final int[] delta_j = {1, 0, -1, -1, -1, 0, 1, 1}; 
		if(pointer == null) return true;
		if(i < 0 || i > m-1 || j < 0 || j > n-1) return false;
		if(pointer.getData().equals(matrix[i][j]) == false || visited[i][j] == true ) 
				return false;
		
		visited[i][j] = true;
		
		for(int k = 0; k<8; k++)
		{
			if(patternSearch(matrix, i+delta_i[k], j+delta_j[k], m, n, pointer.getNext(), visited))
				return true;
		}
		
		
		return (visited[i][j] == false);
	}

}
