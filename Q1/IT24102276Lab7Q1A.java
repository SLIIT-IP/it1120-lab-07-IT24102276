import java.util.Scanner;

public class IT24102276Lab7Q1A{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int avg, m1, m2, m3, m4;

System.out.println("Enter marks for four subjects:");

System.out.print("Enter Subject Mark 1:");
m1 = input.nextInt();

System.out.print("Enter Subject Mark 2:");
m2 = input.nextInt();

System.out.print("Enter Subject Mark 3:");
m3 = input.nextInt();

System.out.print("Enter Subject Mark 4:");
m4 = input.nextInt();

avg = (m1 + m2 + m3 + m4)/4;
System.out.println("Average is : "+ avg);

if( avg <= 100 && avg >= 75)
{
System.out.print("Overall Grade is: Distinction");
}

else if( avg <= 74 && avg >= 50)
{
System.out.print("Overall Grade is: Credit");
}

else
{
System.out.print("Overall Grade is: Fail");
}
}
}