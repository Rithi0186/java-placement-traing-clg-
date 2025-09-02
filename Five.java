import java.util.Scanner;
class Five{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter empid:");
int empId=scan.nextInt();
System.out.println("enter your gender:");
char gender =scan.next().charAt(0);

System.out.println("Enter your salary");
float salary =scan.nextFloat();
scan.nextLine();
System.out.println("Enter your full name");
String name=scan.nextLine();
System.out.println("emp Details:");
System.out.println("empid: "+empId);
System.out.println("Name: " +name);
System.out.println("gender:" +gender);
System.out.println("salary: " +salary);
}
}