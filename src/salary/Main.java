package salary;


public class Main {

   
    public static void main(String[] args) {
         Employee employee1 = new Employee("Muhamad", "Jalal", 20000);
        Employee employee2 = new Employee("akar", "jonethen", 50000);

       
         System.out.println("Name\t\t\tYearly Salary");
        System.out.println("--------\t------------------");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + "\t\t" + employee1.getYearlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + "\t\t" + employee2.getYearlySalary());

        
        employee1.applyRaise(10);
        employee2.applyRaise(10);

        System.out.println("\n10 Percent SALARY raised!!");
        System.out.println("Name\t\t\tYearly Salary");
        System.out.println("--------\t------------------");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + "\t\t" + employee1.getYearlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + "\t\t" + employee2.getYearlySalary());
    }
    
}
