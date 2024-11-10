import java.util.Scanner;
class Vowels
{
public static void main(String args[])
{
Scanner naidu=new Scanner(System.in);
char alpha;
System.out.println("enter alphabet:");
alpha=naidu.next().charAt(0);
System.out.println("alphabet is:"+alpha);
if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonent");
}
}
}