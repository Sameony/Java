class calculator{
	double arg1;
	double arg2;
	char sign;
	double result;
	
	static String Welcome;
	static {
		Welcome="Welcome to casio calculation";
	}
	public double perform()
	{	
		switch(sign){
		case '-':
			return (arg1-arg2);
		case '+':
			return (arg1+arg2);
		case '*':
			return (arg1*arg2);
		case '/':
			return (arg1/arg2);
		case '%':
			return (arg1%arg2);
		default:
			return -1;
		}
	}
		
	public calculator(double arg1, double arg2, double arg3, char c)
		{
		this.sign=c;
		switch(sign){
			case '-':
				result= (arg1-arg2-arg3);
				break;
			case '+':
				result=(arg1+arg2+arg3);
				break;
			case '*':
				result =(arg1*arg2*arg3);
				break;
			case '/':
				result =(arg1/arg2/arg3);
				break;
			case '%':
				result= (arg1%arg2%arg3);
				break;
			default:
				result= -1;
			}
	}
	public calculator(double arg1,double arg2, char c)
	{
		System.out.println(Welcome);
		this.arg1=arg1;
		this.arg2=arg2;
		this.sign=c;
	}
	class INNER
	{
		String s="Hello this is from inner class";
		public void show()
		{
			System.out.println(s);
		}
	}
}
public class Methods {

	public static void main(String[] args) {
		calculator obj1 = new calculator(830,415,50,'-');
		//obj1.result=obj1.perform();
		System.out.println(obj1.result);
		//static variable ko class name se initialize karo
		
		System.out.println(calculator.Welcome);
		
		
		
		//In order to use an inner class, we have to use the outer class
		calculator.INNER obj2= obj1.new INNER();
		obj2.show();
		
		/*
		 * inner class exists-> member class, static class, anonymous class
		 * outer.inner objinner= objout.new inner()
		 * static inner class exists
		 * outer.inner obj= new
		 */
	}

}
