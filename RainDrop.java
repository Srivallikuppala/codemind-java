import java.util.Scanner;
class Sample
{
    public static String findString(int x)
    {
        String result="";
        if(x%3==0)
        result=result+"Pling";
        if(x%5==0)
        result=result+"Plang";
        if(x%7==0)
        result=result+"Plong";
     
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
       String output=Sample.findString(n);
       if(output.isEmpty())
       System.out.println(n);
       else
       System.out.println(output);
       sc.close();
    }
}