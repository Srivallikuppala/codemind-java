import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,temp,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(temp!=1)
        {
            if(temp%2==0)
            temp=temp/2;
            else if(temp%3==0)
            temp=temp/3;
            else if(temp%5==0)
            temp=temp/5;
            else
            {
                count=1;
                break;
            }
        }
        if(count==1)
        System.out.println("Not Ugly Number");
        else
        System.out.println("Ugly Number");
    }
}