import java.util.Scanner;

public class IT24102276Lab7Q3{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

for(int i = 1; i <= 5; i++)
{
System.out.println("Customer " + i);
System.out.print("Enter total bill amount :");
double total = input.nextDouble();

System.out.print("Enter mode of payment( C for cash, O for other): ");
char mode = input.next().charAt(0);

if (mode == 'c' || mode == 'C')
{
double discount = total * 0.05;
System.out.println("Discount is "+ discount);
System.out.println("Amount to be paid: "+ (total - discount));
System.out.println(" ");
}

else if (mode == 'o' || mode == 'O')
{
System.out.println("No discount applicable");
System.out.println("Amount to be paid: "+ total);
System.out.println(" ");
}

else
{
System.out.println("Payment mode is not valid");
System.out.println(" ");
}

}
}
}


