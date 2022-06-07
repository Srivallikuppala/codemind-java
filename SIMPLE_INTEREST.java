import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
    int p,t,r,s;
    Scanner sc=new Scanner(System.in);
    p=sc.nextInt();
    t=sc.nextInt();
    r=sc.nextInt();
    s=(p*t*r)/100;
    System.out.println(s);
    }
}