import com.zubair.emp.Clerk;
import com.zubair.emp.Employee;
import com.zubair.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m1 = new Manager("Mike", 3200, 900);
		
		Clerk c1 = new Clerk("Yuan", 2100, 500);

		showSalary(m1);
		showSalary(c1);
	}

	private static void showSalary(Employee e) {
		if(e instanceof Clerk)
			System.out.println("Clerk Salary: " + e.getSalary());
		else
			System.out.println("Manager Salary: " + e.getSalary());
	}
	
//	private static void showSalary(Clerk c1) {
//		System.out.println("Clerk Salary: " + c1.getSalary());
//	}
//
//	private static void showSalary(Manager m1) {
//		System.out.println("Manager Salary: " + m1.getSalary());
//	}
}