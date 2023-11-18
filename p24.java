import java.util.Scanner;
class p24
{
public static void main(String x[]) 
{
int a;
Scanner s=new Scanner(System.in);
System.out.println("To check if the positive number is palindrome or not  enter :-");
System.out.print("Number: ");
a=s.nextInt();
if(a==palin(a))
System.out.println(a+" is palindrome" );
else
System.out.println(a+" is not a palindrome" );
}
 public static int palin(int a)
{     int rev=0;
        while (a != 0) {
            rev *= 10;
            rev += a % 10;
            a /= 10;
        }
        return rev;
    }   
}