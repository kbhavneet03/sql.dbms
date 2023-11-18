import java.util.Scanner;
class p30
{
public static void main(String x[]) 
{
double a,area;
Scanner s=new Scanner(System.in);
System.out.println("Enter the side of an Equilateral triangle: ");
a=s.nextDouble();
area=(1.73/4)*a*a;
System.out.println("Area of an equilateral triangle of side "+a+" is  "+area );
}
    
}