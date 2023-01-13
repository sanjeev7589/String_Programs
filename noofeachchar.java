package Stringprograms;

import java.util.HashMap;
import java.util.Set;

public class noofeachchar {
public static void main(String[]args)
{
	noofeachchar n = new noofeachchar();
	String s = "Java J2EE Java JSP J2EE";
	//n.normal(s);
	n.collection(s);
}
void normal(String s)
{
	int length=0;
	int i=0;
	int j=0;
	for(char c:s.toCharArray())
	{
		length++;
	}
	char[]ch = new char[length];
	for(i=0; i<length; i++)
	{
		ch[i]=s.charAt(i);
	}
	int count=1;
	for(i=0; i<length-1; i++)
	{
		for(j=i+1; j<length; j++)
		{
			if(ch[i]==ch[j]&&ch[i]!=' ')
			{
				ch[j]=' ';
				count++;
			}
		}
		if(ch[i]!=' ')
		{
			System.out.print(ch[i] +":" +count +" ");
		}
		count=1;
	}
	if(ch[length-1]!=' ')
	{
		System.out.print(ch[length-1] +": 1");
	}
}
void collection(String s)
{
	int length=0;
	for(char c:s.toCharArray())
	{
		length++;
	}
	
	char[] c= s.toCharArray();
	
	HashMap<Character,Integer>charac= new HashMap<Character,Integer>();
	for(char ca:c)
	{
		if(charac.containsKey(ca))
		{
			charac.put(ca,charac.get(ca)+1);
		}
		else
		{
			charac.put(ca,1);
		}
	}
	
	System.out.print(charac);
}
}
