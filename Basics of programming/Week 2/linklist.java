import java.util.*;

public class linklist {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
           int num = scan.nextInt();
           if(num % 2 ==0){
               stack.push(num);
           }else{
               if (!stack.empty()) {
                   while (!stack.empty()) {
                       System.out.print(stack.pop() + " ");
                   }
               }
               System.out.print(num+" ");
           }
        }
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    
    }
}
