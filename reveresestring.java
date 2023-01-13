package Stringprograms;

public class reveresestring {
public static void main(String[] args)
{
	reveresestring r = new reveresestring();
	String s = "Sanjeev Sankar K";
	//r.normal1(s);
	//r.normal2(s);	
	//r.usingstringbuffer(s);
	System.out.print(r.usingrecursion(s));
}
void normal1(String s)
{
	String [] str = s.split(" ");
	int j=str.length-1;
	String temp="";
	for(int i=0; i<str.length/2; i++)
	{
		temp=str[i];
		str[i]=str[j];
		str[j]=temp;
		j--;
	}
	for(String print:str)
	{
		System.out.print(print + " ");
	}
}
void normal2(String s)
{
	char temp=' ';
	int i=0;
	int count =0;
	for(char c:s.toCharArray())
	{
		count++;
	}
	char []ch = new char[count];
	for(i=0; i<count; i++)
	{
		ch[i]=s.charAt(i);
	}
	int j=count-1;
	for(i=0; i<s.length(); i++)
	{
		temp = s.charAt(i);	
		ch[i]=s.charAt(j);
		ch[j]=temp;	
		j--;
	}
	for(char c:ch)
	{
		System.out.print(c);
	}
}
void usingstringbuffer(String s)
{
	StringBuffer sbf = new StringBuffer(s);
	System.out.print(sbf.reverse());
}
String usingrecursion(String s)
{
	if((null == s) || (s.length()<=1))
	{
		return s;
	}
	return usingrecursion(s.substring(1))+s.charAt(0);
}
}
