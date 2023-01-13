package Stringprograms;

public class reverseeachword {
public static void main(String[]args)
{
	reverseeachword r = new reverseeachword();
	String s ="Java";
	r.normal(s);
}
void normal(String s)
{
	int i=0, j=0, k=0;
	//int count=0;
	while(i<s.length())
	{
		while(s.charAt(i)!=' ' && i!=s.length()-1)
		{
			i++;
			j++;
		}
		if(i==s.length()-1)
		{
			k=i;
			j+=2;
		}
		else
		{
			k=i-1;
		}
		String rev = "";
		while(j>0)
		{
			rev=rev+s.charAt(k);
			k--;
			j--;
		}
		System.out.print(rev + " ");
		j=0;
		i++;
	}
}
}
