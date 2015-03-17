package Arrays;

public class SearchInsertPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,5,6};
		int[] b = {1,3,5,6};
		int[] c = {1,3,5,6};
		int[] d = {1,3,5,6};
		int[] e = {1,3};
		System.out.print(searchInsert(a, 5));
		System.out.print(searchInsert(b, 2));
		System.out.print(searchInsert(c, 7));
		System.out.print(searchInsert(d, 0));
		System.out.print(searchInsert(e, 3));
		System.out.println();
		System.out.print(binarySearchInsert(a, 5, 0, a.length));
		System.out.print(binarySearchInsert(b, 2, 0, b.length));
		System.out.print(binarySearchInsert(c, 7, 0, c.length));
		System.out.print(binarySearchInsert(d, 0, 0, d.length));
		System.out.print(binarySearchInsert(e, 3, 0, e.length));
	}
	public static int searchInsert(int[] A, int target) {
        	int i = 0;
        	if(target<=A[0])
        		return 0;
        	if(target>A[A.length-1])
	 		return A.length;
        	for(int j=1;j<A.length;j++){
        		if(target>A[j-1] && target<A[j])
        			return j;
        		if(target == A[j])
        			return j;
        	}
        	return i;
    	}
    	public static int binarySearchInsert(int[] A, int target, int i, int j) {
		if(target<=A[i])
			return i;
		if(target>=A[j-1])
			return j;
		int mid = (i+j)/2;
		if(target<=A[mid])
			return binarySearchInsert(A, target, i, mid);
		else
			return binarySearchInsert(A, target, mid+1, j);
	}
}
