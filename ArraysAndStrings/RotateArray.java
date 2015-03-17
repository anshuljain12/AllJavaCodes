package Arrays;

public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7,8,9, 10, 11, 12};
		for(int i=0;i<nums.length;i++)
        	System.out.print(nums[i]+" ");
		System.out.println();
		rightRotate(nums, 3);
		for(int i=0;i<nums.length;i++)
        	System.out.print(nums[i]+" ");
	}
	public static void rightRotate(int[] nums, int d) {
		int i, j, k, temp;
		int n = nums.length;
		for (i = 0; i < n-gcd(d,n); i++)
		{
			temp = nums[i];
			j = i;
			while(true)
			{
				k = j + d;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				nums[j] = nums[k];
				j = k;
			}
			nums[j] = temp;
		}
    	}
	public static int gcd(int a, int b){
		if(b==0)
		     return a;
		else
		     return gcd(b, a%b);
	}
}
