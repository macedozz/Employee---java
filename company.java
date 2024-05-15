package cursoAula;
import java.util.Scanner;
import entities.employee;
public class company {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		employee employee = new employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		
		System.out.println();
		System.out.println("Gloss salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		
		System.out.println("Employee: "+ employee);
		
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		Double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data:" + employee);
		
		sc.close();
	}
}
