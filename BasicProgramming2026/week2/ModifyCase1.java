import java.util.Scanner;
public class ModifyCase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int basic_salary, child_allowance, number_of_children;
        double pension_deduction = 0.05, total_child_allowance, total_pension, net_salary;
        
        System.out.print("Enter basic salary: ");
        basic_salary = scanner.nextInt();
        System.out.print("Enter child allowance: ");
        child_allowance = scanner.nextInt();
        System.out.print("Enter number of children: ");
        number_of_children = scanner.nextInt();
        
        total_child_allowance = child_allowance * number_of_children;
        total_pension = basic_salary * pension_deduction;
        net_salary = basic_salary + total_child_allowance - total_pension;
        
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Total Child Allowance: " + total_child_allowance);
        System.out.println("Total Pension Deduction: " + total_pension);
        System.out.println("Net Salary: " + net_salary);

        scanner.close();
    }
}