import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        char a;
        Scanner sc=new Scanner(System.in);
        a=sc.next().charAt(0);
       switch(a)
       {
           case'V':
           case'v':
               System.out.println("Violet");
           break;
           case'I':
           case'i':
               System.out.println("Indigo");
           break;
           case'B':
           case'b':
               System.out.println("Blue");
           break;
           case'G':
           case'g':
               System.out.println("Green");
           break;
           case'Y':
           case'y':
               System.out.println("Yellow");
           break;
           case'O':
           case'o':
               System.out.println("Orange");
           break;
           case'R':
           case'r':
               System.out.println("Red");
           break;
           default:
           System.out.println("-1");
       }
    }
}