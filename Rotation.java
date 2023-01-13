package Stringprograms;

public class Rotation {
public static void main(String[]args)
{
	Rotation r = new Rotation();
	String s = "Java J2ee Struts Hibernate";
	String s1="JavaJ2eeStrutsHibernate";
	String s2 = "StrutsHibernateJavaJ2ee";
	//r.normal(s);
	//r.normalcheck(s,s1);
	r.usinginbuilt(s1,s2);
}
void normal(String s)
{
	String [] str= s.split(" ");
	String temp=str[str.length-1];
	for(int i=0; i<str.length-1;i++)
	{
		temp=str[str.length-1];
		for(int j=str.length; j>1; j--)
		{
			str[j-1]=str[j-2];
		}
		str[0]=temp;
		for(String print:str)
		{
			System.out.print(print);
		}
		System.out.println();
	}
}
void normalcheck(String s, String s1)
{
	String [] str= s.split(" ");
	String temp=str[str.length-1];
	String checkstr="";
	for(int i=0; i<str.length-1;i++)
	{
		temp=str[str.length-1];
		for(int j=str.length; j>1; j--)
		{
			str[j-1]=str[j-2];
		}
		str[0]=temp;
		for(String check:str)
		{
			checkstr=checkstr+check;
		}
		if(checkstr.equals(s1))
		{
			System.out.print(true);
			break;
		}
	}
}
void usinginbuilt(String s1, String s2)
{
	String s3 =s1+s1;
	System.out.println(s3);
	if(s1.length() !=s2.length())
	{
		System.out.println("Not an rotation");
	}
	if(s3.contains(s2))
	{
		System.out.println(" an rotation");
	}
	else
	{
		System.out.println("Not an rotation");
	}
}
}
