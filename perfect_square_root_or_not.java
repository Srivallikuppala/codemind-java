import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,i,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n/2;i++)
        {
            if(i*i==n)
            {
                count=1;
                break;
            }
        }
        if(count==1)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
    
        
    }
}