import java.util.*;
public class Conditional_and_stuffs {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=687;
		if(n%2==1){
			System.out.println("Odd");
		}
		else
		{
			System.out.println("Even");
		}
	//ternary time
		System.out.println(n%2==0?"Even":"ODD");
	
	//switch yah, no double lmao weak
	switch(n)
	{
	case 1:
		System.out.println("yeah");
		break;
	case 68:
		System.out.println(n%2);
		break;
	default:
		System.out.println("nah");
	}
	int i=1;
	while(i<10){
		System.out.println(i);
		i++;
	}
}
}
