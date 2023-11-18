class p26
{  
public static void main(String x[])  
{  
int n=895, digit, sum = 0;  
System.out.println("Given number is "+ n );  
while(n > 0)  
{  
//finds the last digit of the given number    
digit = n % 10;  
//adds last digit to the variable sum  
sum = sum + digit;  
//removes the last digit from the number  
n = n / 10;  
}  
//prints the result    
System.out.println("Sum of Digits: "+sum);  
}  
}  