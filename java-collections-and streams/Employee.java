import java.time.LocalDate;
class Employee{

	int employeeId;
	String firstName;
	String lastName;
	String email;
	LocalDate hiredate;
	float salary;
	int deptId;

	public Employee(){
	}

	public Employee(int employeeId, String firstName, String lastName, String email,
							LocalDate hiredate, float salary, int deptId){	
	 this.employeeId = employeeId;
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.email=email;
	 this.hiredate=hiredate;
	 this.salary=salary;
	 this.deptId=deptId;
	}	

	public String toString(){
		return "ID : "+employeeId+" | Name : "+firstName+" "+lastName+" | Email : "+email+" | Date Joined : "+hiredate+" | Salary : "+salary+" | Dept : "+deptId;

	}
}