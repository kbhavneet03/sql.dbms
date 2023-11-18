import java.util.Scanner;
class A
{
public static void main(String st[])
{
int y;
System.out.print("Enter any year = ");
Scanner s=new Scanner(System.in);
y=s.nextInt();
if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
{
System.out.print("Leap year");
}
else
{
System.out.print("Not a Leap year");
}
}
}