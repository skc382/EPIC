package epic.mountainpoint;

public class MountainPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{2,4,5,6,7},
						  {4,5,67,3,5},
						  {5,6,7,8,54},
						  {3,4,5,6,8},
						  {3,4,56,4,5}};
		
		for(int i=0; i<5; i++)
			for(int j=0; j<5; j++)
			{
				find(matrix, 5, 5, i, j, matrix[i][j]);
			}

	}
	
	public static void find(int[][] matrix, int m, int n, int i, int j, int point)
	{
		final int[] delta_i = {-1, -1, -1, 0, 1, 1, 1, 0 };
		final int[] delta_j = {1, 0, -1, -1, -1, 0, 1, 1}; 
		
		int value = matrix[i][j];
		int index_i = 0, index_j = 0;
		boolean isMountain = true;
		
		for(int k=0; k<8 ; k++)
		{
			index_i = (i + delta_i[k]);
			index_j = (j + delta_j[k]);

			if(index_i > 0 && index_i < m && index_j > 0 && index_j < n)
			{
				if(value <= matrix[index_i][index_j])
				{
					isMountain = false;
				}
			}
		}
		
		if(isMountain)
			System.out.println(point);
	}

}
