import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
    double c,f;
    Scanner sc=new Scanner(System.in);
    c=sc.nextDouble();
      f=(1.8*c)+32;
      System.out.printf("%.2f",f);
    }
}