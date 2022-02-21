
import java.util.*;
class Employee{
	int id;
	String name;
	double salary;
	String dept;
	public Employee(int id, String name, double salary, String dept){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public void displayDetails() {
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+salary);
		System.out.println("Employee dept: "+dept);
	}
}
public class GenericsAssignmentQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> s = new HashSet<>();
		s.add(new Employee(1, "AA", 123333, "CSE"));
		s.add(new Employee(4, "DD", 374334, "ECE"));
		s.add(new Employee(5, "EE", 4444334, "ECE"));
		s.add(new Employee(6, "FF", 37466334, "CSE"));
		s.add(new Employee(5, "EE", 4444334, "ECE"));
		for (Employee e: s) {
			e.displayDetails();
			System.out.println();
		}
	}

}