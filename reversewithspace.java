package Stringprograms;

public class reversewithspace {
public static void main(String[]args)
{
	reversewithspace r = new reversewithspace();
	String s = "I am not string";
	r.normal(s);
}
void normal(String s)
{
	char []c = s.toCharArray();
	int i=0, j=c.length-1;
	char temp=' ';
	while(i<j)
	{
		if(c[i]!=' ' &&c[j]!=' ')
		{
			temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		if(c[i]==' ' && c[j]==' ')
		{
			i++;
			j--;
		}
		else
		{
			if(c[i]==' ')
			{
				while(c[i]==' ')
				{
					i++;
				}
			}
			else
			{
				while(c[j]==' ')
				{
					j--;
				}
			}
		}
	}
	for(char ca:c)
	{
		System.out.print(ca);
	}
}
}
