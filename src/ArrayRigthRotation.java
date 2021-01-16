import java.util.Arrays;
public class ArrayRigthRotation {
	//function to rotate an array by one position
	public static void rigthRotateByOne(int [] arr)
	{
		int last = arr[arr.length-1];
		for(int i = arr.length - 2;i>=0;i--)
		{
			arr[i+1] = arr[i];
		}
		arr[0] =last;
	}
	//Function to rotate an array by k position
	public static void rightRotate(int[] arr,int k)
	{
	    for(int i=0;i<k;i++)
	    {
	    	rigthRotateByOne( arr);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,2,3,4,5,6,7};
		int k=3;
		rightRotate(arr,k);
		 System.out.println(Arrays.toString(arr));
		
	}

}
