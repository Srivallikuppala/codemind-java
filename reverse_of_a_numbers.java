import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,r,i=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            i=(i*10)+r;
            n=n/10;
        }
        System.out.println(i);
    }
}