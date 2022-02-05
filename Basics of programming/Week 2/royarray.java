import java.util.*;

public class royarray {
    public static void main(String[] args)

    {

        Scanner sc=new Scanner(System.in);

        int t,size,mid=1;

        boolean flag=true;

        t=sc.nextInt();

        for(int i=0;i<t;i++)

        {

            flag=true;

            size=sc.nextInt();

            String logo[]=new String[size];

            

            for(int k=0;k<size;k++)

            {

                logo[k]=sc.next();

            }

            

            mid=size/2;

            

            for(int c=0,d=size-1;c<=mid;c++,d--)

            {

                for(int x=0,y=size-1;x<=mid;x++,y--)

                {

                    if(logo[c].charAt(x)==logo[c].charAt(y) && logo[c].charAt(x)==logo[d].charAt(x) && logo[d].charAt(x)==logo[d].charAt(y))  

                        continue;

                    else

                    {

                        flag=false;

                        break;

                    }

                    

                

                }

                if(flag==false)

                    break;

            }

            

            if(flag==true)

                System.out.println("YES");

            else

                System.out.println("NO");

            

        }

    }


 

}

