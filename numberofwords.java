package Stringprograms;

public class numberofwords {
public static void main(String[] args)
{
	numberofwords n = new numberofwords();
	String s = "SanjeevSankar";
	//n.normal(s);
	//n.usingcharloop(s);
}
void normal(String s)
{
	String [] str = s.split(" ");
	System.out.println(str.length);
}
void usingcharloop(String s)
{
	int count=0;
	int wordcount=1;
	int i=0;
	for(char c:s.toCharArray())
	{
		count++;
	}
	char[] ch = new char[count];
	for(i=0; i<count; i++)
	{
		ch[i]=s.charAt(i);
	}
	for(i=0; i<count; i++)
	{
		if(ch[i]==' ')
		{
			wordcount++;
		}
	}
	System.out.print(wordcount);
}
}