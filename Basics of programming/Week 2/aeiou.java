import java.util.*;

class aeiou

{

public static void main(String args[])

{

Scanner in=new Scanner(System.in);

int n=in.nextInt();

String s=in.next();

Set<Character> hs=new HashSet<Character>();

for(int i=0;i<s.length();i++)

{

if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'

||s.charAt(i)=='u')

hs.add(s.charAt(i));

}

if(hs.size()==5)

System.out.println("YES");

else

System.out.println("NO");

}

}