package Stringprograms;

public class nowhitespace {
public static void main(String[]args)
{
	nowhitespace w = new nowhitespace();
	String s ="TwoSpaces  ThreeSpaces   FourSpaces    Tab        End";
	//w.normal(s);
	//w.normal2(s);
	w.usinginbuilt(s);
	
}
void normal(String s)
{
	int length=0;
	for(char c:s.toCharArray())
	{
		length++;
	}
	System.out.print(length);
	char [] ch =s.toCharArray();
	char[] ch1 = new char[length];
	int k=0;
	int j=0;
	String stringwithoutspace="";
	for(int i=0; i<length; i++)
	{
		if(ch[i]!=' ')
		{
			j=i;
			while((ch[j]!=' ') && (j<length-1))
			{
				ch1[k]=ch[j];
				k++;
				j++;
			}
			i=j;
			//ch1[k] =' ';
			//k++;
		}
	}
for(j=0; j<length; j++)
{
	stringwithoutspace=stringwithoutspace+ch1[j];
}
System.out.println(stringwithoutspace);
}
void normal2(String s)
{
     char[] charArray =s.toCharArray();
      
     String stringWithoutSpaces = "";
     
     String onespace = " ";
      
     for (int i = 0; i < charArray.length; i++) 
     {
         if ( (charArray[i] != ' ') )
         {
             stringWithoutSpaces = stringWithoutSpaces + charArray[i];
         }
     }
      
     System.out.println("Input String : "+s);
      
     System.out.println("Input String Without Spaces : "+stringWithoutSpaces);     
 }	
void usinginbuilt(String s)
{
	//replaceAll() method of String class to remove all white spaces (including tab also) from a string.
	// method to remove spaces from string in java. replaceAll() method takes two parameters. 
	//One is the string to be replaced and another one is the string to be replaced with. 
	//We pass the string “\\s+” (whitespace)to be replaced with an empty string “”. 
	//This method removes spaces at the end, spaces at the beginning and spaces between the words.
	 String stringWithoutSpaces = s.replaceAll("\\s+", "");
     
     System.out.println("Input String : "+s);
      
     System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
}
}

