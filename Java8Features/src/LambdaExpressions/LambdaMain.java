package LambdaExpressions;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMain {

	public static void main(String[] args) {
		EmployeeService empService=new EmployeeService();
		
		List<Employee> employees=empService.getAllEmployees();
		
		//predicate
		Predicate<Employee> predicateFuncemployeesMajor= emp->emp.getAge()>18;
		Predicate<Employee> predicateFuncemployeemajorlastlimit= emp->emp.getAge()<30;
		
		Employee emp=new Employee("hari","sircilla","eafrf",244);
		System.out.println(predicateFuncemployeesMajor.test(emp));
		//and
		employees.stream().filter(predicateFuncemployeesMajor.and(predicateFuncemployeemajorlastlimit)).forEach(e->System.out.println(e));
		
		System.out.println("******************************************");
		//consumer
		Consumer<Employee> consumerFunc= emplo-> System.out.println(emplo);
		
		employees.stream().filter(predicateFuncemployeesMajor).forEach(consumerFunc);
		System.out.println("******************************************");
		//supplier
		Supplier<Double> randomIntegerSuplier=()-> Math.random();
		System.out.println(randomIntegerSuplier.get());
		System.out.println("******************************************");
		//function
		
		Function<String,Integer> stringMaptoInteger= s->s.length();
		System.out.println(stringMaptoInteger.apply("Jai shree ram"));
		
	}

}
