import java.util.HashSet;

public class CheatTree {

	public static void main(String[] args) {
		int n,k;
		n=5;
		k=1;
		int arr1[][] = {{1,3},{1,2},{3,4},{3,5}};
		int arr2[] = {1};
		helpMakeTree(arr1);
		int res;
		HashSet<Integer> hs = new HashSet<>();
		for(int i:arr2)
			hs.add(i);
	}
	static void helpMakeTree(int[][] arr)
	{
		Node root = new Node(1);
		
	}

}
