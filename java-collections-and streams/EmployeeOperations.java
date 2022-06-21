import java.util.*;
import java.time.LocalDate;

class EmployeeOperations{

	public static float findTotalSalary(List<Employee> employees){
		float sum = 0;
		for(Employee e:employees){
			sum+=e.salary;
		}
	 return sum;
	}

	public static void main(String []a){
		
		List<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee(10001, "Rohan", "Reddy", "rohan@yahoo.com", LocalDate.of(2020,10,5),52000,10);
		Employee e2 = new Employee(10004, "Abhishek", "Sharma", "abhi@yahoo.com", LocalDate.of(2021,2,15),44000,20);
		Employee e3 = new Employee(10002, "Suraj", "Kumar", "ksuraj@yahoo.com", LocalDate.of(2019,5,5),63000,10);
		Employee e4 = new Employee(10007, "Javed", "Hussain", "hussian@yahoo.com", LocalDate.of(2021,10,20),42000,20);
		Employee e5 = new Employee(10005, "Ishan", "Dutta", "dishan@yahoo.com", LocalDate.of(2020,10,5),52000,10);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);

		/*

		for(Employee e:employeeList){
			System.out.println("----------------------------------------------------");
			System.out.println(e);
			System.out.println("----------------------------------------------------");
		}
		
		*/

	//	float total = findTotalSalary(employeeList);

		double total = employeeList.stream().map(e->e.salary).reduce((s,c)->s+c).get();

		Employee emp = employeeList.stream().max((emp1,emp2)->(int)(emp1.salary-emp2.salary)).get();
 
		System.out.println("Total salary : "+total);

		System.out.println("Highest Paid Employee : ");

		System.out.println(emp);

	}
}