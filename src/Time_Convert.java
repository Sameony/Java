
public class Time_Convert {

	public static void main(String[] args) {
		String s="02:00:00PM";
		String addFact="", x="";
        int a=s.length();
        char check=s.charAt(a - 2);
        if(check=='P')
        {   
        	int intval;
            String intern = s.substring(0,2);
            if(intern.equals("12")==false) {
                intval=12+Integer.valueOf(intern);
                addFact=Integer.toString(intval);
            }
            else
            {
                addFact="12";
            }
        }
        if(check=='A') {
        	if(s.substring(0,2).equals("12"))
                addFact="00";
            else{
                addFact=s.substring(0,2);
            }
        }
        x+=addFact;
        x+=s.substring(2,8);
        System.out.println(x);
	}

}
