import java.util.Scanner;
class Pdt
{
public static void main(String args[])
{
Scanner naidu=new Scanner(System.in);
String pname;
int pno;
float pcost;
float pquantity;
float pbill;
System.out.println("enter product name:");
pname=naidu.next();
System.out.println("enter product number:");
pno=naidu.nextInt();
System.out.println("enter product cost:");
pcost=naidu.nextFloat();
System.out.println("enter product quantity:");
pquantity=naidu.nextFloat();
System.out.println("enter product bill:");
pbill=naidu.nextFloat();
pbill=pcost*pquantity;
System.out.println("the given product name is:"+pname); 
System.out.println("the given product number is:"+pno);
System.out.println("the given product is:"+pcost);
System.out.println("the given product quantity is:"+pquantity);
System.out.println("the given product bill is:"+pbill);
}
}
