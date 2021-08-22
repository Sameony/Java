class check{
	int potato;
	public void multiple(int ... n)
	{
		long sum=0;
		for(int i: n)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
}
public class Arrays {

	public static void main(String[] args) {
		int x=51;
		int nums[] = new int[x];
		for(int i=0;i<51;i++)
			nums[i]=i;
		int k=0;
		while(k<51)
		{
			System.out.println(nums[k]);
			k+=1;
		}
		check c1=new check();
		//check c[]={c1};
	
		//2d array
		int a[][] = {
				{1,2,3,4},
				{4,5,6},
				{10,9,8,7}
		};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		/*
		 * python ka for i in arr:
		 * 
		 */
		for(int k1[]:a )
		{
			
		
			for(int finall : k1)
			{
				System.out.print(finall+" ");
			}
			System.out.println();
		}
		//passing variable arguments
		c1.multiple(3,4,5,6,1,2,79,100);
		
	}

}
