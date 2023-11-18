import java.util.Scanner;
class A
{
public static void main(String st[])
{
int n,r,sum=0;
System.out.print("Enter the number = ");
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n>0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
System.out.print("Sum of digits "+sum);
}
}