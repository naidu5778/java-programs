import java.util.Scanner;
class Area
{
public static void main(String args[])
{
Scanner naidu=new Scanner(System.in);
int r;
float pi=3.14f;
double area;
System.out.println("enter radius:");
r=naidu.nextInt();
area=pi*r*r;
System.out.println("the radius is:"+r);
System.out.println("the area is:"+area);
}
}


