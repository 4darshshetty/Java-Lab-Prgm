import java.util.Scanner;

class Employee

{

String name;

int id;

float salary;

float raiseSalary(float percent)

{

return salary+(salary* (percent/100));

}

}

class Demo

{

public static void main(String[] args)

{

Employee e=new Employee();

Scanner sc=new Scanner(System.in);e.name="MNS";

e.id=001;

e.salary=90000;

System.out.println("Enter the percentage of increment");

int a=sc.nextInt();

System.out.println("Salary after increment:="+e.raiseSalary(a));

}

}
