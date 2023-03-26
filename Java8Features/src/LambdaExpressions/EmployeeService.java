package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	
	List<Employee> empList;
	
	public EmployeeService() {
		empList=new ArrayList<>();
		empList.add(new Employee("pruthvi","Siddipet","1224",10));
		empList.add(new Employee("ram","ayodhya","32234",27));
		empList.add(new Employee("hanuman","ayodhya","324",25));
		empList.add(new Employee("sai","siddipet","34",32));
		empList.add(new Employee("shiva","siddipet","34",12));
	}
	
	public List<Employee> getAllEmployees(){
		return empList;
	}

}
