import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Float a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=a*b;
        System.out.printf("%.2f",c);
    }
}