import java.util.Scanner;
public class CombinationOf2numbers {
//calculating a factorial of a number
public static int fact(int num)
{
int fact=1, i;
for(i=1; i<=num; i++)
{
fact = fact*i;
}
return fact;
}
public static void main(String args[])
{
int n, r;
Scanner scan = new Scanner(System.in);
System.out.print("Enter Value of n : "); // 5 input
n = scan.nextInt();
System.out.print("Enter Value of r : "); // 3 input
r = scan.nextInt();
// NCR and NPR of a number
System.out.println("NCR = " +(fact(n)/(fact(n-r)*fact(r))));
System.out.println("nNPR = " +(fact(n)/(fact(n-r))));
}
}