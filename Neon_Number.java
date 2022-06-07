import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,r,a,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        r=n*n;
        while(r!=0)
        {
            a=r%10;
            sum=sum+a;
            r=r/10;
        }
        if(sum==n)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}