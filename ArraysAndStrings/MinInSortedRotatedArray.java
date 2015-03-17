package Arrays;

public class MinInSortedRotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {4,5,6,7,0,1,2};
		System.out.println(findMin(num));
	}
	public static int findMin(int[] num) {
	        if(num.length==1)
	        	return num[0];
		for(int i=1;i<num.length;i++){
			if(num[i]<num[i-1])
				return num[i];
		}
		return num[0];
	}
	public static int findMinRecursive(int[] num) {
        	return findMinBinary(num, 0, num.length);
    	}
    	public static int findMinBinary(int[] num, int i, int j) {
        	if(i>=j)
			return num[0];
		if(j==i+1)
			return num[i]<num[j]?num[i]:num[j];
		//System.out.println(i+" "+j);
		int mid = (i+j)/2;
		if(num[mid]>num[i] && num[j-1]>num[i])
			return findMinBinary(num, i, mid);
		else if(num[mid]>num[i] && num[j-1]<num[i])
			return findMinBinary(num, mid, j);
		else if(num[mid]<num[i] && num[i]>num[j-1])
			return findMinBinary(num, i, mid);
		else
			return findMinBinary(num, mid, j);
    	}
}
