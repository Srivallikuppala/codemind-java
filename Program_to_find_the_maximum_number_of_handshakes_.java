import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int n,h;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        h=(n*(n+1)/2)-n;
        System.out.println(h);
    }
}