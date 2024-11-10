import java.util.Scanner;
class Emp
{
public static void main(String args[])
{
Scanner naidu=new Scanner(System.in);
String ename;
int eno;
float esal;
System.out.println("enter employee name:");
ename=naidu.next();
System.out.println("enter employee number:");
eno=naidu.nextInt();
System.out.println("enter employee salary:");
esal=naidu.nextFloat();
System.out.println("the given employee name is:"+ename); 
System.out.println("the given employee number is:"+eno);
System.out.println("the given employee salary is:"+esal);
}
}
