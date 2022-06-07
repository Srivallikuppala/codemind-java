import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,i=0,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            if(r>i)
            {
                i=r;
            }
            n=n/10;
        }
    System.out.println(i);
        
    }
}