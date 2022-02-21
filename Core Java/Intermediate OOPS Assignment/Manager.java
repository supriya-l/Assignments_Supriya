import java.util.ArrayList;


class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary + incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
    	
        int overtime = 500;
        return salary + overtime;
        
    }
}
 class Assignment2Q2 {
   static  int salary = 10000;
    public int getSalary(int salary) {
		return salary;
	}
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){	
    	int totalSalary = 0;
    for(int i = 0; i < employeeSalaries.size(); i++)
        totalSalary += employeeSalaries.get(i);
 return totalSalary;
}
    public static void main(String[] args) {
    	Manager m = new Manager();
    	int msalary = m.getSalary(salary);
    	
    	Labour l = new Labour();
    	int lsalary = l.getSalary(salary);
    	
    	ArrayList<Integer> employeeSalaries = new ArrayList<Integer>();
    	employeeSalaries.add(msalary);
    	employeeSalaries.add(lsalary);

    	System.out.println("Total Salary of all the Employees is "+(employeeSalaries));
	
    	
    }
}

