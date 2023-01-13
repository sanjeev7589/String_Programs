package Stringprograms;

import java.util.HashMap;
import java.util.Set;

public class duplicateandoccurs {
public static void main(String[] args)
{
	duplicateandoccurs d1 = new duplicateandoccurs();
	String s = "Super man Bat Man Spider man man";
	//d1.normal(s);
	d1.collection(s);
	int count=0;
	for(char c:s.toCharArray())
	{
		count++;
	}
	char[] ch = new char[count];
	int i=0;
	for(char c:ch)
	{
		ch[i]=s.charAt(i);
		i++;
	}
	int countforstring =0;
	for(i=0; i<count; i++)
	{
		if(ch[i]==' ')
		{
			countforstring++;
		}	
	}
	i=0;
	int j=0;
	String [] str = new String[countforstring+1];
}
void normal(String s)
{
	//Convert string to string array using split method.
	//compare using equals method string index starting from 0 to next index
	//Make null if same value and null should not be checked
	
	String [] str = s.split(" ");
	int count=1;
	for(int i=0; i<str.length; i++)
	{
		for(int j=i+1; j<str.length; j++)
		{
			if(str[i].equalsIgnoreCase(str[j])&&str[i]!=" ")
			{
				str[j]=" ";
				count++;
			}
		}	
		if(str[i]!=" " && count>1)
		{
			System.out.print(str[i] + " present " + count+ " times");
		}
		System.out.println();
		count=1;
	}
}
void collection(String s)
{
	 //Splitting inputString into words
	 
    String[] words = s.split(" ");

    //Creating one HashMap with words as key and their count as value

    HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

    //Checking each word

    for (String word : words)
    {
        //whether it is present in wordCount

        if(wordCount.containsKey(word.toLowerCase()))
        {
            //If it is present, incrementing it's count by 1

            wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
        }
        else
        {
            //If it is not present, put that word into wordCount with 1 as it's value

            wordCount.put(word.toLowerCase(), 1);
        }
    }

    //Extracting all keys of wordCount

    Set<String> wordsInString = wordCount.keySet();

    //Iterating through all words in wordCount

    for (String word : wordsInString)
    {
        //if word count is greater than 1

        if(wordCount.get(word) > 1)
        {
            //Printing that word and it's count

            System.out.println(word+" : "+wordCount.get(word));
        }
    }
}
}
