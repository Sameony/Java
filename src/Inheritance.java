import java.util.*;

class IdoAdd{
	public int sum(int ... n)
	{
		int x=0;
		for(int i:n)
		{
			x+=i;
		}
		return x;
	}
	
	public IdoAdd()
	{
		System.out.println("I am in A");
	}
}
class IdoMore extends IdoAdd
{
	public int sub(int ... n)
	{
		int x=0;
		for(int i:n)
		{
			x-=i;
		}
		return x;
		
	}
	
	public IdoMore()
	{
		System.out.println("I am in B");
	}
}

class EvenMoar extends IdoMore
{
	public EvenMoar()
	{
		System.out.println("I am in c");
	}
	@Override
	public int sub(int ... n)
	{
		int x=0;
		for(int i:n)
		{
			x+=i;
		}
		return x;
		
	}
	public long mul(int ... n)
	{
		long x=1;
		for(int i : n)
		{
			x*=i;
		}
		return x;
	}
}
public class Inheritance {
	public static void main (String args[])
	{
//		IdoMore c1 = new IdoMore();
//		EvenMoar e1 = new EvenMoar();
//		long potat=e1.mul(4,5,2,3);
//		int sum2= e1.sum(1,22,3,34,5,6,7,8,9,10);
//		int sub2=e1.sub(100,84,5,6,2);
//		System.out.print(sum2+" hehe "+sub2+" hehe "+potat);
		
		
		//runtime polymorphism
		IdoAdd first= new EvenMoar();
		first = new IdoMore();
		}
}
