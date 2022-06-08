import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
      int a,sum=0;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      int[] ar=new int[a];
      for(int i=0;i<a;i++)
      ar[i]=sc.nextInt();
  for(int i=0;i<a;i++)
  {
      sum=sum+ar[i];
  }
  System.out.println(sum);
    }
}