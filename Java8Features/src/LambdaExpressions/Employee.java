package LambdaExpressions;

public class Employee {

	private String employeeName;
	private String address;
	private String mobileNo;
	private Integer age;
	public Employee(String employeeName, String address, String mobileNo, Integer age) {
		super();
		this.employeeName = employeeName;
		this.address = address;
		this.mobileNo = mobileNo;
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}
	
	
	
}
