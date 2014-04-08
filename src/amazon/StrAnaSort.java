package amazon;

import java.util.Arrays; 
import java.util.Comparator; 

public class StrAnaSort { 

public static void main(String[] args) 
{ 
String[] strArr = {"god","dog", "abc", "cab", "man"}; 
Arrays.sort(strArr, new AnagramComparator()); 
for(String str:strArr) 
{ 
System.out.print(str+" "); 
} 
} 
} 

class AnagramComparator implements Comparator<String> 
{ 

@Override 
public int compare(String str1, String str2) 
{ 
return sumLetters(str1)-sumLetters(str2); 
} 

private int sumLetters(String str) 
{ 
int sum = 0; 
for(int ch:str.toCharArray()) 
{ 
sum+=ch; 
} 
return sum; 
} 

}