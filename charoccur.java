package Stringprograms;

public class charoccur {
public static void main(String[] args)
{
	charoccur c = new charoccur();
	String s = "Sanjeev Sankar";
	//c.normal(s);
	c.withoutloop(s);
}
void normal(String s)
{
	char c='s';
	int count=0;
	for(int i=0; i<s.length(); i++)
	{
		if((c==Character.toLowerCase(s.charAt(i))))
		{
			count++;
		}
	}
	System.out.print(count);
}
void withoutloop(String s)
{
	int count = s.length()-s.replace("a","").length();
	System.out.print(count);
}
}
