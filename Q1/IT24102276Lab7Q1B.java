import java.util.Scanner;

public class IT24102276Lab7Q1B{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Student 1");

System.out.print("Enter Subject Marks:");
int m1 = input.nextInt();
int m2 = input.nextInt();
int m3 = input.nextInt();
int m4 = input.nextInt();

int avg = (m1 + m2 + m3 + m4)/4;
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
System.out.println("Overall Grade is: Fail");
}
System.out.println(" ");

System.out.println("Student 2");

System.out.print("Enter Subject Marks:");
int m5 = input.nextInt();
int m6 = input.nextInt();
int m7 = input.nextInt();
int m8 = input.nextInt();

int avg1 = (m5 + m6 + m7 + m8)/4;
System.out.println("Average is : "+ avg1);

if( avg1 <= 100 && avg1 >= 75)
{
System.out.print("Overall Grade is: Distinction");
}

else if( avg1 <= 74 && avg1 >= 50)
{
System.out.print("Overall Grade is: Credit");
}

else
{
System.out.println("Overall Grade is: Fail");
}
System.out.println(" ");

System.out.println("Student 3");

System.out.print("Enter Subject Marks:");
int m9 = input.nextInt();
int m10 = input.nextInt();
int m11 = input.nextInt();
int m12 = input.nextInt();

int avg2 = (m9 + m10 + m11 + m12)/4;
System.out.println("Average is : "+ avg2);

if( avg2 <= 100 && avg2 >= 75)
{
System.out.print("Overall Grade is: Distinction");
}

else if( avg2 <= 74 && avg2 >= 50)
{
System.out.print("Overall Grade is: Credit");
}

else
{
System.out.print("Overall Grade is: Fail");
}
}
}
