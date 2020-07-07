package day18;

public class Question37 {
	
	
	
	public static void sum(int[][]first_array, int[][]second_array)
	{
		int[][] sum_array = new int[3][3];
		for(int i=0 ; i<3; i++)
		{
			for(int j=0; j<3 ; j++)
			{
				sum_array[i][j] = first_array[i][j] + second_array[i][j];
				System.out.print(sum_array[i][j]+ "  ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] array2 = {{4,5,6},{2,7,8},{3,1,9}};
		

		System.out.println("The sum of the first and second array is");
		sum(array1, array2);	
		
	}

}
