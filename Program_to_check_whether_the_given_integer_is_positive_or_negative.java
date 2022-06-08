import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
      int a;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      if(a>0)
      System.out.println("Positive Number");
      else
      System.out.println("Negative Number");
    }
}