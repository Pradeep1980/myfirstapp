package streamtest;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String address;
	private int departmentId;
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", departmentId=" + departmentId + "]";
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public Employee() {

	}

	public Employee(int id, String name, int salary, String address, int departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.departmentId=departmentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
