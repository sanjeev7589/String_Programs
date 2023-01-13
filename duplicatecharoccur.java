package Stringprograms;

import java.util.HashMap;
import java.util.Set;

public class duplicatecharoccur {
public static void main(String[] args)
{
	duplicatecharoccur d = new duplicatecharoccur();
	String s ="Java22JEEs java";
	//d.normal(s);
	d.usingcollection(s);
}
void normal(String s)
{
	int length=0;
	for(char c:s.toCharArray())
	{
		length++;
	}
	char [] ch=s.toCharArray();
	int count=1;
	for(int i=0; i<length-1; i++)
	{
		if(ch[i]!=' ')
		{
			for(int j=i+1; j<length; j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=' ';
					count++;
				}
			}
			if(count>1)
			{
				System.out.print(ch[i]+" : " + count);
				count=1;
			}
		}
	}
}
void usingcollection(String s)
{
	String nospaces = s.replaceAll("\\s+","");
	int length=0;
	for(char c:nospaces.toCharArray())
	{
		length++;
	}
	char[]ch =nospaces.toCharArray();
	for(int i=0; i<length; i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z')
		{
			ch[i]=(char)(ch[i]+32);
		}
	}
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	for(char c:ch)
	{
		if(map.containsKey(c))
		{
			map.put(c, map.get(c)+1);
		}
		else
		{
			map.put(c,1);
		}
	}
	Set<Character> set = map.keySet();
	for(char c:set)
	{
		if(map.get(c)>1)
		{
			System.out.println(c + " : " + map.get(c));
		}
	}
}
}
