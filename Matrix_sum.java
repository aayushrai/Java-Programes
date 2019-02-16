
public class Main
{
	public static void main(String[] args) 
	{
	    int array1[][] = {{1, 4, 4}, {4,2,3},{1,2,3}};
	    int array2[][] = {{1, 4, 4}, {4,2,3},{1,2,3}};
	    int ans[][] = new int[array1.length][array1.length];
	    ans = sum(array1,array2);
		Display(ans);
		
		
	}
	public static int[][] sum(int[][] a,int[][] b )
	{
	    int array[][] = new int[a.length][a.length];
	    for(int i = 0;i<a.length;i++)
	    {
	        for(int j = 0;j<a.length;j++)
	        {
	            array[i][j] = a[i][j] + b[i][j];
	        }
	    }
	    return array;
	}
	public static void Display(int[][] input)
	{
	     for(int i = 0;i<input.length;i++)
	    {
	        for(int j = 0;j<input.length;j++)
	        {
	           	System.out.print(input[i][j] + " ");
	        }
	        System.out.print("\n");
	    }
	}
	    
	
}
