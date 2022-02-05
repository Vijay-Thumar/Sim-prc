import java.util.*;
class XOR {
public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       int c= sc.nextInt();
       int len = (int)(Math.log(c)/Math.log(2));
       int a = (int)Math.pow(2,len)-1;
       int b = a^c;
       System.out.println((long)a*(long)b);
   }
}