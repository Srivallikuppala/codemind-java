import java.util.Scanner;
class Sample
{
    public static void main(String args[])
{
    char a;
    Scanner sc=new Scanner(System.in);
    a=sc.next().charAt(0);
    if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
    System.out.println("Vowel");
    else
    System.out.println("Consonant");
}    
}
