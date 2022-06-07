import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,i,sum=0,a,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       for(i=0;i<n;i++)
       {
           a=sc.nextInt();
           b=sc.nextInt();
           sum=a+b;
           System.out.println(sum);
       }
    }
}