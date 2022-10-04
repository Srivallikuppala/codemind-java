import java.util.Scanner;
class pal
{
    public static boolean isprime(int n)
    {
        int c=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
               c++; 
            }
        }
        if(c==0)
        return true;
        else
        return false;
    }
    public static boolean ispal(int n)
    {
        int r,m,x=0;
        m=n;
        while(m!=0)
        {
            r=m%10;
            x=(x*10)+r;
            m=m/10;
        }
        if(n==x)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d1,d2,i;
        n=sc.nextInt();
        for(i=n+1;;i++)
        {
            if(isprime(i))
            {
                if(ispal(i))
                {
                System.out.println(i);
                break;
                }
            }
        }
    }
}