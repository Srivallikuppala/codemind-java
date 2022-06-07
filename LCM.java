import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<a*b;i++)
        {
            if(i%a==0 && i%b==0)
            break;
        }
             System.out.println(i);
            sc.close();
        
    }
}