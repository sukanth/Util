
public class Solution {

	public static void main(String[] args) {
		int[] a = { 1, 4, -1, 3, 2 };
		int n=4;
		System.out.println(solution(a,n));
	}

	public static int solution(int A[], int N) {
	    // return 3 for [3,2,-5,1]
	    int sum_prefix = 0;
	    int sum_suffix = 0;
	int i, j;
	for (i = 0; i < N; i++) {
	    // Check if is is the equilibrium point
	    sum_prefix = 0;
	    for (j = 0; j < i; j++) {
	       sum_prefix += A[j];
	    }
	    sum_suffix = 0;
	    for (j = i+1; j < N; j++) {
	        sum_suffix += A[j];
	       // Compute suffix sum
	    }
	    if (sum_prefix == sum_suffix)
	        return i;
	}
	return -1;
	}
}