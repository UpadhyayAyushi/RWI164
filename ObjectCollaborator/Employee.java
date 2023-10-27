package ObjectCollaborator;

public class Employee {
		int id;
		String name;
		int salary;
		Address address;
		
	void printEmployeeDetails(Employee emp) {
		//System.out.println(emp);
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.salary);
		//System.out.println(emp.address);
		System.out.println(emp.address.city);
		System.out.println(emp.address.state);
		System.out.println(emp.address.pincode);
		
	}


		public static void main(String[] args) {
		Employee emp=new Employee();
	    emp.id=101;
		emp.name="om";
		emp.salary=200000;
		
		emp.address=new Address();
		emp.address.city="banaglore";
		emp.address.state="karnataka";
		emp.address.pincode="210238";
		
		emp.printEmployeeDetails(emp);

		}

	}

