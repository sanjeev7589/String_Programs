package Stringprograms;

public class loweruppercase {
public static void main(String[] args)
{
	String s ="JAVA";
	char []ch=s.toCharArray();
	for(int i=0; i<s.length(); i++)
	{
		if(ch[i]>='A' && ch[i]<='Z')
		{
			ch[i]=(char)(ch[i]+32);
		}		
	}
	String news="";
	for(char c:ch)
	{
		news=news+c;
	}
	System.out.print(news);
}
}
