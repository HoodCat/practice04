package prob04;

public class Depart extends Employee {
	private String department;
	
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		System.out.println(
				String.format("이름:%s 연봉:%d 부서:%s",
						super.getName(),
						super.getSalary(),
						this.department));
	}
	
	
}
