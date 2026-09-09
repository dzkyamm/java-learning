public class CaseStudy1 {
    public static void main(String[] args) {
        double basic_salary = 3000000;
        double child_allowance = 150000;
        double pension_deducttion = 0.05;
        int number_of_children = 3;

        double totalchildallowance = child_allowance * number_of_children;
        double totalpension = basic_salary * pension_deducttion;
        double netsalary = basic_salary + totalchildallowance - totalpension;

        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Total Child Allowance: " + totalchildallowance);
        System.out.println("Total Pension Deduction: " + totalpension);
        System.out.println("Net Salary: " + netsalary);
    }
}
