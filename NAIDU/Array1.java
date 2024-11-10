import java.util.Scanner;
class Array1 
{
 public static void main(String args[])
{
 Scanner naidu=new Scanner(System.in);
 int i;
 int n;
 System.out.println("enter i value");
 i=naidu.nextInt();
 System.out.println("enter n value");
 n=naidu.nextInt();
 int a[]=new int[n];
 System.out.println("enter elements to array:");
 for(i=0;i<a.length;i++)
{
 a[i]=naidu.nextInt();
}
 System.out.println("the elements in an array is:");
 for(i=0;i<a.length;i++)
{
 System.out.println(a[i]);
}
}
}