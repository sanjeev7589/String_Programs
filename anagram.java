package Stringprograms;

public class anagram {
public static void main(String[] args)
{
	anagram a = new anagram();
	String sa = "Dormitory";
	String sb = "Dirty Room";
	a.normal(sa,sb);
}
void normal(String sa, String sb)
{
	String sa1=sa.toLowerCase();
	String sa2=sb.toLowerCase();
	String s1 = sa1.replaceAll("\\s+","");
	String s2 = sa2.replaceAll("\\s+","");
	System.out.println(s1);
	System.out.println(s2);
	if(s1.length()==s2.length())
	{
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		int count=0;
		int i=0;
		int j=0;
		int strcount=ch1.length;
		for(i=0; i<ch1.length-1;i++)
		{
			if(ch1[i]!=' ')
			{
				for(j=i+1; j<ch1.length; j++)
				{
					if(ch1[i]==ch1[j])
					{
						count++;
						ch1[j]=' ';
					}
				}
				if(count>=1)
				{
					strcount-=count;
					count=0;
				}
			}
		}
		char[] str1 =new char[strcount];
		j=0;
		for(i=0; i<ch1.length; i++)
		{
			if(ch1[i]!=' ')
			{
				str1[j]=ch1[i];
				j++;
			}
		}
		count=0;
		strcount=ch2.length;
		for(i=0; i<ch2.length-1;i++)
		{
			if(ch2[i]!=' ')
			{
				for(j=i+1; j<ch2.length; j++)
				{
					if(ch2[i]==ch2[j])
					{
						count++;
						ch2[j]=' ';
					}
				}
				if(count>=1)
				{
					strcount-=count;
					count=0;
				}
			}
		}
		if(str1.length == strcount)
		{
			j=0;
			char[] str2 =new char[strcount];
			for(i=0; i<ch2.length; i++)
			{
				if(ch2[i]!=' ')
				{
					str2[j]=ch2[i];
					j++;
				}
			}
			count=0;
			for(i=0; i<str1.length;i++)
			{
				for(j=0; j<str1.length; j++)
				{
					if(str1[i]==str2[j])
					{
						count++;
						continue;
					}
				}
			}
			if(count==str1.length)
			{
				System.out.println("an anagram");
			}
			else
			{
				System.out.println("Not an anagram");
			}
		}
		else
		{
			System.out.println("Not an anagram");	
		}
	}
	else
	{
		System.out.println("Not an anagram");
	}
	

}
}
