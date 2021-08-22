
public class Repeated_substring_pattern {

	public static void main(String[] args) {
		String s1="ababababab";
		String s2="ababacbacbab";
		String s3="abcabcabbabbabb";
		Solution st=new Solution();
		System.out.println(st.repeatedSubstringPattern(s1));
	}

}
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l=s.length();
        String[] possibles = new String[l/2];
        for(int i=1;i<=l/2;i++)
        {
        	if(l%i==0)
        		possibles[i-1]=s.substring(0,i);
        }
        for(int i=0;i<possibles.length;i++)
        {
        	String p = possibles[i];
        	int k=p.length(), flag=1;
        	for(int j=k;j+k<l;j=j+k)
        	{
        		if(p.equals(s.substring(j,j+3)))
        		{
        			continue;
        		}
        		else
        		{
        			flag=0;
        			break;
        		}
        			
        	}
        	if(flag==1)
        		return true;
        }
        return false;
    }
}